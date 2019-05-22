package com.example.myteste;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import models.Exame;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_main);
         final int total_pontos = 0;


         Button btn_alert = (Button) findViewById(R.id.btn_alert);
         Button btn_faltaleve = (Button) findViewById(R.id.btn_faltaleve);
         Button btn_faltamedia = (Button) findViewById(R.id.btn_faltamedia);
         Button btn_faltagrave = (Button) findViewById(R.id.btn_faltagrave);
         Button btn_faltagravissima = (Button) findViewById(R.id.btn_faltagravissima);
         Button btn_reset = (Button) findViewById(R.id.btn_reset);

         final TextView txt_score = (TextView)findViewById(R.id.txt_score);
         final TextView txt_result = (TextView)findViewById(R.id.txt_result);

        final  Exame exame = new Exame(0,"#1111","");

         btn_faltaleve.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 exame.setPonto(1);
                 exame.soma_pontos(exame);
                 txt_score.setText("Pontos : "+exame.getTotal_ponto());
             }
         });

        btn_faltamedia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exame.setPonto(2);
                exame.soma_pontos(exame);
                txt_score.setText("Pontos : "+exame.getTotal_ponto());
            }
        });
        btn_faltagrave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exame.setPonto(3);
                exame.soma_pontos(exame);
                txt_score.setText("Pontos : "+exame.getTotal_ponto());
            }
        });

        btn_faltagravissima.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exame.setPonto(4);
                exame.soma_pontos(exame);
                txt_score.setText("Pontos : "+exame.getTotal_ponto());
            }
        });
        btn_reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_score.setText("Pontos : ");
                txt_result.setText(exame.resetExame());
                txt_result.setTextColor(getResources().getColor(R.color.colorInfo));
            }
        });

        btn_alert.setOnClickListener(new View.OnClickListener(){
          @Override
           public void onClick(View v){
              txt_result.setText(exame.consulta_result(exame));
               if(exame.consulta_result(exame).equals("APROVADO"))
               {
                   txt_result.setTextColor(getResources().getColor(R.color.colorSucess));
               }else{
                   txt_result.setTextColor(getResources().getColor(R.color.colorfaltagravissima));
               }
            }
        });



    }
}
