package com.sebaspc.aplicacionesmoviles;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class LoginActivity extends AppCompatActivity {

    Button buton1;
    Button buton2;
    EditText correo;
    EditText contra;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        buton1 = findViewById(R.id.btnProcesar);

        correo = findViewById(R.id.etUsuario);
        contra = findViewById(R.id.etContra);

        buton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Validador validador = new Validador();
                if (validador.validar_correo(correo.getText().toString())){
                    int duration = Toast.LENGTH_SHORT;
                    CharSequence text = "Correo correcto";
                    if (correo.getText().toString().equals("admin@utp.edu.pe") && contra.getText().toString().equals("admin")){
                        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(intent);
                    }else{
                        text = "Correo y contraseña incorrectos";
                        Toast toast = Toast.makeText(LoginActivity.this, text, duration);
                        toast.show();
                    }
                }
                else{
                    int duration = Toast.LENGTH_SHORT;
                    CharSequence text = "Ingrese un correo valido";
                    Toast toast = Toast.makeText(LoginActivity.this, text, duration);
                    toast.show();
                }
            }
        });

        buton2 = findViewById(R.id.btnRegistrar);

        buton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), UserRegisterActivity.class);
                startActivity(intent);
            }
        });

    }

}