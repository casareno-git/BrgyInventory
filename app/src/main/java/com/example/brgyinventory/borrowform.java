package com.example.brgyinventory;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class borrowform extends AppCompatActivity {

    EditText qtyinput;
    EditText dateinput;
    EditText returndateinput;
    EditText reasoninput;

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

        // declarations
        Button borrowsubmitbtn = findViewById(R.id.borrowsubmitbtn);
        Button borrowcancelbtn = findViewById(R.id.borrowcancelbtn);
        qtyinput = (EditText) findViewById(R.id.borrowqty);
        dateinput = (EditText) findViewById(R.id.borrowdate);
        returndateinput = (EditText) findViewById(R.id.borrowreturndate);
        reasoninput = (EditText) findViewById(R.id.borrowreason);

        // toast-related declarations
        Context context = getApplicationContext();
        String submittxt = "Request submitted.";
        String canceltxt = "Request cancelled.";
        String emptytxt = "Please answer all fields.";
        int toastduration = Toast.LENGTH_SHORT;

        Toast submittoast = Toast.makeText(context, submittxt, toastduration);
        Toast canceltoast = Toast.makeText(context, canceltxt, toastduration);
        Toast emptytoast = Toast.makeText(context, emptytxt, toastduration);

        // intent for navigation
        final Intent finishintent = new Intent(borrowform.this, borrowing.class);

        // submit btn actions
        borrowsubmitbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String borrowqty = qtyinput.getText().toString();
                String borrowdate = dateinput.getText().toString();
                String borrowreturndate = returndateinput.getText().toString();
                String borrowreason = reasoninput.getText().toString();

                // check if fields are empty
                if (borrowqty.isEmpty() || borrowdate.isEmpty() || borrowreturndate.isEmpty() || borrowreason.isEmpty()) {
                    emptytoast.show();
                } else {
                    submittoast.show();
                    startActivity(finishintent);
                }
            }
        });

        // cancel btn actions
        borrowcancelbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                canceltoast.show();
                startActivity(finishintent);
            }
        });

    }
}