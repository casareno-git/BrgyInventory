
package com.example.brgyinventory;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class dashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_dashboard);

        // CONNECT BUTTONS
        Button btnProfile = findViewById(R.id.btnProfile);
        Button btnBorrowing = findViewById(R.id.btnBorrowing);
        Button btnStatus = findViewById(R.id.btnStatus);

        // PROFILE BUTTON
        btnProfile.setOnClickListener(v -> {
            Toast.makeText(this,
                    "Profile page is not yet available",
                    Toast.LENGTH_SHORT).show();
        });

        // BORROWING PAGE BUTTON
        btnBorrowing.setOnClickListener(v -> {
            Intent intent = new Intent(dashboard.this, borrowing.class);
            startActivity(intent);
        });

        // BORROWING STATUS BUTTON
        btnStatus.setOnClickListener(v -> {
            Intent intent = new Intent(dashboard.this, borrowform.class);
            startActivity(intent);
        });
    }
}
