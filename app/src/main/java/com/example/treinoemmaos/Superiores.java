package com.example.treinoemmaos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Superiores extends AppCompatActivity {

    private MediaPlayer musica1 = new MediaPlayer();
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        musica1.pause();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_superiores);

        musica1 = MediaPlayer.create(this, R.raw.audio1);
        musica1.start();

        Button buttonFinalizar = findViewById(R.id.button_finalizar);
        buttonFinalizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Superiores.this, Final.class);
                musica1.pause();
                startActivity(intent);
            }
        });

        Button buttonVoltar = findViewById(R.id.button_voltar);
        buttonVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });




    }
}