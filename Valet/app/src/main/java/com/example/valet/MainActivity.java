package com.example.valet;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import android.app.Activity;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.widget.AdapterView;

public class MainActivity extends AppCompatActivity {

    private List<String> carros = new ArrayList();
    private ArrayAdapter<String> adapter;

    private DateFormat df = null;
    private DateFormat hf = null;

    private AlertDialog dialog;
    private Valet carroSaida = null;

    private ValetDB db;
    private List<Valet> valets = new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), ValetActivity.class);
                startActivityForResult(intent, 1);
            }
        });

        df = android.text.format.DateFormat.getDateFormat(getApplicationContext());
        hf = android.text.format.DateFormat.getTimeFormat(getApplicationContext());
        db = new ValetDB(this);
        valets = db.consultarVeiculosValet();

        for (Valet v : valets) {
            carros.add(v.getModelo() + " - " + v.getPlaca() + "\nEntrada: "
                    + df.format(v.getEntrada()) + " " + hf.format(v.getEntrada()));
        }

        ListView lista = (ListView) findViewById(R.id.lista);
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, carros);
        lista.setAdapter(adapter);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                carroSaida = valets.get(position);
                dialog = confirmarSaida();
                dialog.show();
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (Activity.RESULT_OK == resultCode) {
            Valet valet = new Valet();
            valet.setModelo(data.getStringExtra("modelo"));
            valet.setPlaca(data.getStringExtra("placa"));
            valet.setEntrada(new Date());

            db.salvarValet(valet);
            valets.add(valet);

            carros.add(valet.getModelo() + " - " +
                    valet.getPlaca() + "\nEntrada: " +
                    df.format(valet.getEntrada()) + " " +
                    hf.format(valet.getEntrada()));
            adapter.notifyDataSetChanged();
        }
    }

    public AlertDialog confirmarSaida() {
        carroSaida.setSaida(new Date());
        carroSaida.setPreco(calcularPreco(carroSaida));
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(R.string.saida);
        builder.setMessage("Saída do " + carroSaida.getModelo() + " - "
                + carroSaida.getPlaca() + "\nPreço: " + carroSaida.getPreco());
        builder.setPositiveButton(getString(R.string.sim), new DialogInterface.OnClickListener() {

        @Override
        public void onClick(DialogInterface dialog, int which) {
            db.salvarValet(carroSaida);
            valets.remove(carroSaida);
            carros.remove(carroSaida.getModelo() + " - " + carroSaida.getPlaca()
                    + "\nEntrada: " + df.format(carroSaida.getEntrada()) + " "
                    + hf.format(carroSaida.getEntrada()));
            adapter.notifyDataSetChanged();
        }
    });
        builder.setNegativeButton(getString(R.string.nao), null);
        return builder.create();
    }


    public double calcularPreco(Valet valet) {
        double preco = 0;

        long tempo = (valet.getSaida().getTime() - valet.getEntrada().getTime()) / 1000 / 60;

        long horas = tempo / 60;
        long minutos = tempo % 60;

        if (horas > 0) {
            preco = horas * 3;
        }

        if (minutos > 0) {
            preco += 3;
        }

        return preco;
    }
}
