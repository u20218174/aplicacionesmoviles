package com.sebaspc.aplicacionesmoviles;

import android.content.Intent;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class QueEsPCForgeActivity extends AppCompatActivity {

    TextView textView;
    TextView textView1;
    TextView textView2;

    Button buton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_que_es_pcforge);

        textView = findViewById(R.id.txtDisena);

        Spannable text1 = new SpannableString("Diseña tu PC ");
        text1.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.light_red)), 0,text1.length(),Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        textView.setText(text1);

        Spannable text2 = new SpannableString("la medida.");
        text2.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.black)), 0,text2.length(),Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        textView.append(text2);

        textView1 = findViewById(R.id.txtPcforge);

        Spannable text3 = new SpannableString("PCForge es la primera aplicación movil que te permite ");
        text3.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.black)), 0,text3.length(),Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        textView1.setText(text3);

        Spannable text4 = new SpannableString("'forjar' tu PC desde cero.");
        text4.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.ligh_green)), 0,text4.length(),Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        textView1.append(text4);

        textView2 = findViewById(R.id.txtDinamica);

        Spannable text5 = new SpannableString("De manera dinámica, puedes ");
        text5.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.black)), 0,text5.length(),Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        textView2.setText(text5);

        Spannable text6 = new SpannableString("agregar componentes, elegirlos a tu gusto.");
        text6.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.light_red)), 0,text6.length(),Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        textView2.append(text6);

        buton = findViewById(R.id.btnVolver);

        buton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });
    }
}