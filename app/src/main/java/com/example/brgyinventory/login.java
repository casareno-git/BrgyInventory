package com.example.brgyinventory;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;

public class login extends AppCompatActivity {

    private EditText username;
    private EditText password;
    private Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username = findViewById(R.id.etUsername);
        password = findViewById(R.id.etPassword);
        loginButton = findViewById(R.id.btnLogin);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = username.getText().toString().trim();
                String pass = password.getText().toString().trim();

                if (user.isEmpty() || pass.isEmpty()) {
                    Toast.makeText(login.this,
                            "Please enter your username and password",
                            Toast.LENGTH_SHORT).show();
                } else if (user.equals("admin") && pass.equals("12345")) {
                    Toast.makeText(login.this,
                            "Login Successful!",
                            Toast.LENGTH_SHORT).show();

                    Intent intent = new Intent(login.this, dashboard.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(login.this,
                            "Invalid username or password",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
