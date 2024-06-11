package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {

    EditText txtnumtotales;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        txtnumtotales = (EditText) findViewById(R.id.txtnumtotal);
        int resultadoSuma = getIntent().getIntExtra("resultado", 0);
        txtnumtotales.setText(String.valueOf(resultadoSuma));

    }
}