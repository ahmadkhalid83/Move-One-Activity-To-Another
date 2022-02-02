package com.example.labactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Activity4 extends AppCompatActivity {

    EditText edtTextFifthActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);
        edtTextFifthActivity = findViewById(R.id.edtTextFifthActivity);

        edtTextFifthActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Activity4.this, Activity5.class));
            }
        });

    }
}