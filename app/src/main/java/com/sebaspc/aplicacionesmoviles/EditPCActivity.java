package com.sebaspc.aplicacionesmoviles;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class EditPCActivity extends AppCompatActivity {

    ImageButton imageButton;
    ImageButton imageButton2;
    Button btnnoguardar;
    Button btnguardar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_pcactivity);

        btnnoguardar = findViewById(R.id.btnCancelar);

        btnnoguardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MisCreacionesActivity.class);
                startActivity(intent);
                finish();
            }
        });
        btnguardar = findViewById(R.id.btnGuardar);
        btnguardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MisCreacionesActivity.class);
                startActivity(intent);
                finish();
            }
        });

        /*
        button1 = findViewById(R.id.btnBase);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), DetalleComponenteActivity.class);
                startActivity(intent);
            }
        });*/

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