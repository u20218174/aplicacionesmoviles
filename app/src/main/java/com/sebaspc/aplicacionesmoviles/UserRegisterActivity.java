package com.sebaspc.aplicacionesmoviles;

import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class UserRegisterActivity extends AppCompatActivity {

    TextView textView;

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

    }
}