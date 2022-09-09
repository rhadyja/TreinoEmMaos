package com.example.treinoemmaos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Cardio extends AppCompatActivity {

    private MediaPlayer musica3 = new MediaPlayer();

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        musica3.pause();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cardio);

        Button buttonFinalizar = findViewById(R.id.button_finalizar);
        musica3 = MediaPlayer.create(this, R.raw.audio3);
        musica3.start();

        buttonFinalizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Cardio.this, Final.class);
                musica3.pause();
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