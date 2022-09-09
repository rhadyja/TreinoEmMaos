package com.example.treinoemmaos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editText = findViewById(R.id.edit_nome);
        Button buttonAvancar = findViewById(R.id.button_avancar);

        buttonAvancar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(editText.getText().toString().length() > 0){
                    Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                    intent.putExtra("nome", editText.getText().toString());
                    startActivity(intent);
                }
                else{
                    Toast.makeText(MainActivity.this, "Insira seu nome", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}