package com.sebaspc.aplicacionesmoviles;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button botonEnsamblar;

    Button botonConfiguracion;

    Button botonCerrarSesion;

    Button botonQueEs;

    ImageButton imageButton;
    ImageButton imageButton2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botonEnsamblar = findViewById(R.id.btnEnsamblar);

        botonEnsamblar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), EditPCActivity.class);
                startActivity(intent);
                finish();
            }
        });

        botonConfiguracion = findViewById(R.id.btnConfiguracion);

        botonConfiguracion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MisCreacionesActivity.class);
                startActivity(intent);
                finish();
            }
        });

        botonCerrarSesion = findViewById(R.id.btnCerrarSesion);

        botonCerrarSesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(intent);
                finish();
            }
        });

        botonQueEs = findViewById(R.id.btnQueEs);

        botonQueEs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), QueEsPCForgeActivity.class);
                startActivity(intent);
                finish();
            }
        });

        imageButton = findViewById(R.id.iconCasa);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
        imageButton2 = findViewById(R.id.iconSalir);
        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), LoadingActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }
}