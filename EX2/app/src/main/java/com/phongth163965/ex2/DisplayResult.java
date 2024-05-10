package com.phongth163965.ex2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayResult extends AppCompatActivity {

    TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_result);
        tv1 = findViewById(R.id.tv1);
        Intent i1 = getIntent();

        Double a = Double.parseDouble(i1.getExtras().getString("a"));
        Double b = Double.parseDouble(i1.getExtras().getString("b"));

        Double sum = a + b;

        tv1.setText(String.valueOf(sum));
    }
}