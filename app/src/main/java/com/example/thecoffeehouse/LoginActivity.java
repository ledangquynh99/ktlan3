package com.example.thecoffeehouse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {
    TextView textView119;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        textView119 = findViewById(R.id.txt_login);
        textView119.setOnClickListener( view -> {
                Intent intent =new Intent(LoginActivity.this,LoginttActivity.class);
                startActivity(intent);
                }
        );
    }
}