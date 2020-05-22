package com.example.library;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button login;
        final EditText text;
        final TextView hello;
        hello = findViewById(R.id.hello);
        hello.setVisibility(View.INVISIBLE);

        login = findViewById(R.id.login);
        text=findViewById(R.id.text);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, text.getText().toString(), Toast.LENGTH_SHORT).show();
                login.setEnabled(false);
                login.setVisibility(View.INVISIBLE);
                text.setVisibility(View.INVISIBLE);
                hello.setVisibility(View.VISIBLE);
            }
        });
    }
}
