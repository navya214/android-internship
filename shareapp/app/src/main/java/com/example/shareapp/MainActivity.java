package com.example.shareapp;


import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button b1;
    EditText et1;
    String st;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = findViewById(R.id.share);
        et1 = findViewById(R.id.edit);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                st = et1.getText().toString();
                Intent intent1 = new Intent(android.content.Intent.ACTION_SEND);
                intent1.setType("text/plain");
                Intent intent = intent1.putExtra(Intent.EXTRA_TEXT, st);
                startActivity(intent);

            }
        });


    }
}