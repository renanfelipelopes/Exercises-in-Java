package com.example.jogodavelha;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private boolean jogadorX = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void selecionar(View view) {
        ImageView botao = (ImageView) view;
        if(botao.getContentDescription() == null
        || "".equals(botao.getContentDescription())) {
            if(jogadorX) {
                botao.setImageResource(R.drawable.x);
                botao.setContentDescription("X");
            } else {
                botao.setImageResource(R.drawable.o);
                botao.setContentDescription("O");
            }
            jogadorX = !jogadorX;

            verificarSeGanhouOuEmpatou();
        }
    }

    private boolean verificarSeGanhouOuEmpatou() {
        String[] opcoes = montaArrayOpcoes();
        String vencedor = temVencedor(opcoes);

        /* Verifica se algum jogador venceu. */
        if(vencedor != null && !"".equals(vencedor)) {
            apresentarMensagem("O vencedor foi o: " + vencedor);
            return true;
        } else {
            /* Se ainda não houver vencedor, verifica se deu velha. */
            if(deuEmpate(opcoes)) {
                apresentarMensagem("Deu Velha!");
                return true;
            }
        }
        return false;
    }

    private String[] montaArrayOpcoes() {
        String[] opcoes = new String[9];

        if(((ImageView) findViewById(R.id.ImageView01)).getContentDescription() != null) {
            opcoes[0] = ((ImageView) findViewById(R.id.ImageView01)).getContentDescription().toString();
        }

        if(((ImageView) findViewById(R.id.ImageView02)).getContentDescription() != null) {
            opcoes[1] = ((ImageView) findViewById(R.id.ImageView02)).getContentDescription().toString();
        }

        if(((ImageView) findViewById(R.id.ImageView03)).getContentDescription() != null) {
            opcoes[2] = ((ImageView) findViewById(R.id.ImageView03)).getContentDescription().toString();
        }

        if(((ImageView) findViewById(R.id.ImageView04)).getContentDescription() != null) {
            opcoes[3] = ((ImageView) findViewById(R.id.ImageView04)).getContentDescription().toString();
        }

        if(((ImageView) findViewById(R.id.ImageView05)).getContentDescription() != null) {
            opcoes[4] = ((ImageView) findViewById(R.id.ImageView05)).getContentDescription().toString();
        }

        if(((ImageView) findViewById(R.id.ImageView06)).getContentDescription() != null) {
            opcoes[5] = ((ImageView) findViewById(R.id.ImageView06)).getContentDescription().toString();
        }

        if(((ImageView) findViewById(R.id.ImageView07)).getContentDescription() != null) {
            opcoes[6] = ((ImageView) findViewById(R.id.ImageView07)).getContentDescription().toString();
        }

        if(((ImageView) findViewById(R.id.ImageView08)).getContentDescription() != null) {
            opcoes[7] = ((ImageView) findViewById(R.id.ImageView08)).getContentDescription().toString();
        }

        if(((ImageView) findViewById(R.id.ImageView09)).getContentDescription() != null) {
            opcoes[8] = ((ImageView) findViewById(R.id.ImageView09)).getContentDescription().toString();
        }

        return opcoes;
    }


    private String temVencedor(String[] opcoes) {
        String vencedor = null;

        /* Verificar se a primeira linha está marcada com o mesmo texto. */
        if(opcoes[0] != null && !"".equals(opcoes[0]) && opcoes[0].equals(opcoes[1]) && opcoes[1].equals(opcoes[2])) {
            vencedor = opcoes[0];
        } else

        /* Verificar se a segunda linha está marcada com o mesmo texto. */
        if(opcoes[3] != null && !"".equals(opcoes[3]) && opcoes[3].equals(opcoes[4]) && opcoes[3].equals(opcoes[5])) {
            vencedor = opcoes[3];
        } else

        /* Verificar se a terceira linha está marcada com o mesmo texto. */
        if(opcoes[6] != null && !"".equals(opcoes[6]) && opcoes[6].equals(opcoes[7]) && opcoes[6].equals(opcoes[8])) {
            vencedor = opcoes[6];
        } else

        /* Verificar se a primeira coluna está marcada com o mesmo texto. */
        if(opcoes[0] != null && !"".equals(opcoes[0]) && opcoes[0].equals(opcoes[3]) && opcoes[0].equals(opcoes[6])) {
           vencedor = opcoes[0];
        } else

        /* Verificar se a segunda coluna está marcada com o mesmo texto. */
        if(opcoes[1] != null && !"".equals(opcoes[1]) && opcoes[1].equals(opcoes[4]) && opcoes[1].equals(opcoes[7])) {
            vencedor = opcoes[1];
        } else

        /* Verificar se a terceica coluna está marcada com o mesmo texto. */
        if(opcoes[2] != null && !"".equals(opcoes[2]) && opcoes[2].equals(opcoes[5]) && opcoes[2].equals(opcoes[8])) {
            vencedor = opcoes[2];
        } else

        /* Verifica se a diagonal da esquerda para a direita está marcada com o mesmo \ 41 texto. */
        if(opcoes[0] != null && !"".equals(opcoes[0]) && opcoes[0].equals(opcoes[4]) && opcoes[0].equals(opcoes[8])) {
            vencedor = opcoes[0];
        } else

        /* Verifica se toda a diagonal da direita para a esquerda está marcada com o m\ 48 esmo texto. */
        if(opcoes[2] != null && !"".equals(opcoes[2]) && opcoes[2].equals(opcoes[4]) && opcoes[2].equals(opcoes[6])) {
            vencedor = opcoes[2];
        }

        return vencedor;
    }


    private boolean deuEmpate(String[] opcoes) {
        return opcoes[0] != null && opcoes[1] != null && opcoes[2] != null && opcoes[3] != null && opcoes[4] != null && opcoes[5] != null && opcoes[6] != null && opcoes[7] != null && opcoes[8] != null;
    }


    private void apresentarMensagem(String msg) {
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setMessage(msg).setNeutralButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                limparDados();
            }
        });

        AlertDialog alert = builder.create();
        alert.setTitle("Jogo Da Velha");
        alert.show();
    }


    private void limparDados() {
        jogadorX = true;

        ((ImageView) findViewById(R.id.ImageView01)).setContentDescription(null);
        ((ImageView) findViewById(R.id.ImageView02)).setContentDescription(null);
        ((ImageView) findViewById(R.id.ImageView03)).setContentDescription(null);
        ((ImageView) findViewById(R.id.ImageView04)).setContentDescription(null);
        ((ImageView) findViewById(R.id.ImageView05)).setContentDescription(null);
        ((ImageView) findViewById(R.id.ImageView06)).setContentDescription(null);
        ((ImageView) findViewById(R.id.ImageView07)).setContentDescription(null);
        ((ImageView) findViewById(R.id.ImageView08)).setContentDescription(null);
        ((ImageView) findViewById(R.id.ImageView09)).setContentDescription(null);

        ((ImageView) findViewById(R.id.ImageView01)).setImageResource(0);
        ((ImageView) findViewById(R.id.ImageView02)).setImageResource(0);
        ((ImageView) findViewById(R.id.ImageView03)).setImageResource(0);
        ((ImageView) findViewById(R.id.ImageView04)).setImageResource(0);
        ((ImageView) findViewById(R.id.ImageView05)).setImageResource(0);
        ((ImageView) findViewById(R.id.ImageView06)).setImageResource(0);
        ((ImageView) findViewById(R.id.ImageView07)).setImageResource(0);
        ((ImageView) findViewById(R.id.ImageView08)).setImageResource(0);
        ((ImageView) findViewById(R.id.ImageView09)).setImageResource(0);
    }
}
