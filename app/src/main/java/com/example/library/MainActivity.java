package com.example.library;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button login;
        login = findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                ImageView image = (ImageView) findViewById(R.id.pic);
                image.setImageResource(R.drawable.staryellow);
                Toast.makeText(MainActivity.this, "image changed", Toast.LENGTH_SHORT).show();
                login.setEnabled(false);
            }
        });
    };
}