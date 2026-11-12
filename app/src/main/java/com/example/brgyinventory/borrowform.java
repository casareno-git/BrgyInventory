package com.example.brgyinventory;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class borrowform extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_borrowform);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // btn declarations
        Button borrowsubmitbtn = findViewById(R.id.borrowsubmitbtn);
        Button borrowcancelbtn = findViewById(R.id.borrowcancelbtn);

        // toast-related declarations
        Context context = getApplicationContext();
        String submittxt = "Request submitted.";
        String canceltxt = "Request cancelled.";
        int toastduration = Toast.LENGTH_SHORT;

        Toast submittoast = Toast.makeText(context, submittxt, toastduration);
        Toast canceltoast = Toast.makeText(context, canceltxt, toastduration);

        // intents for navigation
        final Intent submitintent = new Intent(borrowform.this, borrowing.class);
        final Intent cancelintent = new Intent(borrowform.this, borrowing.class);

        // submit btn actions
        borrowsubmitbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submittoast.show();
                startActivity(submitintent);
            }
        });

        // cancel btn actions
        borrowcancelbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                canceltoast.show();
                startActivity(cancelintent);
            }
        });

    }
}