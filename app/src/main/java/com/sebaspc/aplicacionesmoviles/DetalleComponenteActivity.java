package com.sebaspc.aplicacionesmoviles;
import java.io.Serializable;
import android.content.Intent;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class DetalleComponenteActivity extends AppCompatActivity {

    TextView textView;
    TextView textView2;
    ImageButton imageButton;
    ImageButton imageButton2;
    Button button1;
    TextView componente;
    TextView descripcion;
    String nomb;
    String desc;
    ImageButton mas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_componente);

        textView = findViewById(R.id.txtAdd);

        componente= findViewById(R.id.txtComponente);
        descripcion=findViewById(R.id.txtDescripcion);

        nomb = (String) getIntent().getSerializableExtra("nom");
        desc = (String) getIntent().getSerializableExtra("des");

        componente.setText(nomb);
        descripcion.setText(desc);


        Spannable text1 = new SpannableString("'");
        text1.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.black)), 0,text1.length(),Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        textView.setText(text1);

        Spannable text2 = new SpannableString("Add");
        text2.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.blue_light)), 0,text2.length(),Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        textView.append(text2);

        Spannable text3 = new SpannableString("' para agregar a tu creación");
        text3.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.black)), 0,text3.length(),Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        textView.append(text3);

        textView2 = findViewById(R.id.txtBuy);

        Spannable text4 = new SpannableString("'");
        text4.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.black)), 0,text4.length(),Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        textView2.setText(text4);

        Spannable text5 = new SpannableString("Buy");
        text5.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.blue_light)), 0,text5.length(),Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        textView2.append(text5);

        Spannable text6 = new SpannableString("' para comprar el componente");
        text6.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.black)), 0,text6.length(),Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        textView2.append(text6);

        button1 = findViewById(R.id.btnVolver);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
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