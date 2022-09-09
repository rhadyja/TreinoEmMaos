package com.example.treinoemmaos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        String nome = getIntent().getExtras().getString("nome");
        TextView textView = findViewById(R.id.textView_titulotwo);
        textView.setText(nome);

        Button buttonVoltar = findViewById(R.id.button_voltar);
        buttonVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        Button buttonInferiores = findViewById(R.id.button_inferiores);
        buttonInferiores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, Inferiores.class);
                startActivity(intent);
            }
        });

        Button buttonSuperiores = findViewById(R.id.button_superiores);
        buttonSuperiores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, Superiores.class);
                startActivity(intent);
            }
        });

        Button buttonCardio = findViewById(R.id.button_cardio);
        buttonCardio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, Cardio.class);
                startActivity(intent);
            }
        });
    }
}