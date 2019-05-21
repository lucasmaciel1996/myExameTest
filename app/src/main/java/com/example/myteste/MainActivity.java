package com.example.myteste;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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
         Button btn_soma = (Button) findViewById(R.id.btn_soma);
         Button btn_diminui = (Button) findViewById(R.id.btn_diminui);


         final TextView txt_score = (TextView)findViewById(R.id.txt_score);
         final TextView txt_result = (TextView)findViewById(R.id.txt_result);

        final  Exame exame = new Exame(0,"#1111","");

         btn_soma.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 exame.setPonto(2);
                 exame.soma_pontos(exame);
                 txt_score.setText("Pontos : "+exame.getTotal_ponto());
             }
         });

        btn_diminui.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exame.setPonto(1);
                exame.diminui_pontos(exame);
                txt_score.setText("Pontos : "+exame.getTotal_ponto());
            }
        });

        btn_alert.setOnClickListener(new View.OnClickListener(){
          @Override
           public void onClick(View v){
              txt_result.setText(exame.consulta_result(exame));
          }
        });

    }
}
