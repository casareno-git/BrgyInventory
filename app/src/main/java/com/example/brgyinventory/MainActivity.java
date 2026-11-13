package com.example.brgyinventory;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        Button btnProfile = findViewById(R.id.btnProfile);
        Button btnBorrowing = findViewById(R.id.btnBorrowing);
        Button btnStatus = findViewById(R.id.btnStatus);

        if (btnProfile != null) {
            btnProfile.setOnClickListener(v -> {
                Toast.makeText(this, "Profile page is not yet available", Toast.LENGTH_SHORT).show();
            });
        }

        if (btnBorrowing != null) {
            btnBorrowing.setOnClickListener(v -> {
                Intent intent = new Intent(MainActivity.this, borrowing.class);
                startActivity(intent);
            });
        }

        if (btnStatus != null) {
            btnStatus.setOnClickListener(v -> {
                Intent intent = new Intent(MainActivity.this, borrowform.class);
                startActivity(intent);
            });
        }
    }
}
