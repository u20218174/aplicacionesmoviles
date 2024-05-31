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

public class UserRegisterActivity extends AppCompatActivity {

    TextView textView;

    Button buton1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_register);

        textView = findViewById(R.id.txtTitulo);

        Spannable text1 = new SpannableString("Regístrate y ");
        text1.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.black)), 0,text1.length(),Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        textView.setText(text1);

        Spannable text2 = new SpannableString("comienza a crear");
        text2.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.ligh_green)), 0,text2.length(),Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        textView.append(text2);

        buton1 = findViewById(R.id.btnCrear);

        buton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}