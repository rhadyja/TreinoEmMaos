package com.example.treinoemmaos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Inferiores extends AppCompatActivity {

    private MediaPlayer musica2 = new MediaPlayer();

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        musica2.pause();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inferiores);

        Button buttonFinalizar = findViewById(R.id.button_finalizar);
        musica2 = MediaPlayer.create(this, R.raw.audio2);
        musica2.start();

        buttonFinalizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Inferiores.this, Final.class);
                musica2.pause();
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