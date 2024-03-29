package com.letstravel.sqlite;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WelcomeActivity extends AppCompatActivity {

    private Button btnaddwords, btndisplaywords;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        btnaddwords=findViewById(R.id.btnaddwords);
        btndisplaywords=findViewById(R.id.btndisplaywords);

        btnaddwords.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(WelcomeActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        btndisplaywords.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(WelcomeActivity.this, DisplayingWord.class);
                startActivity(intent);
            }
        });

    }
}
