package com.example.lr2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText Surname = findViewById(R.id.surname);
        final EditText Name = findViewById(R.id.name);
        final EditText Email = findViewById(R.id.email);
        final EditText Password = findViewById(R.id.password);
        final Button sendDataButton = findViewById(R.id.sendDataButton);
        sendDataButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ResultActivity.class);
                intent.putExtra("Surname", Surname.getText().toString());
                intent.putExtra("Name", Name.getText().toString());
                intent.putExtra("Email", Email.getText().toString());
                intent.putExtra("Password", Password.getText().toString());
                startActivity(intent);
            }
        });
    }

}