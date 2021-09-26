package com.example.valet;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;

public class ValetActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.valet);
    }

    public void adicionar(View view) {
        Intent intent = new Intent();
        intent.putExtra("modelo", ((EditText) findViewById(R.id.modelo)).getText().toString());
        intent.putExtra("placa", ((EditText) findViewById(R.id.placa)).getText().toString());
        setResult(Activity.RESULT_OK, intent);
        finish();
    }
}
