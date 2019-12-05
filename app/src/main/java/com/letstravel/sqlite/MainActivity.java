package com.letstravel.sqlite;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText txtaddword, txtaddmeaning;
    private Button btnAddwords;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtaddword=findViewById(R.id.txtaddword);
        txtaddmeaning=findViewById(R.id.txtaddmeaning);
        btnAddwords=findViewById(R.id.btnaddword);

        btnAddwords.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
