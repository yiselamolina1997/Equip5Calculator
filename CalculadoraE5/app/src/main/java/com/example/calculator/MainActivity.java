package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnSumar, btnRestar, btnMultiplicar, btnDividir;
    EditText txtnum1, txtnum2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtnum1 = (EditText) findViewById(R.id.txtnumber1);
        txtnum2 = (EditText) findViewById(R.id.txtnumber2);
        btnSumar = (Button) findViewById(R.id.btnsumar);
        btnRestar = (Button) findViewById(R.id.btnrestar);
        btnDividir = (Button) findViewById(R.id.btndividir);
        btnMultiplicar = (Button) findViewById(R.id.btnmultiplicar);

        txtnum1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtnum1.setText(" ");
            }
        });
        txtnum2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtnum2.setText(" ");
            }
        });

        btnSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (validad() == true){
                    int num1 = Integer.parseInt(String.valueOf(txtnum1.getText()));
                    int num2 = Integer.parseInt(String.valueOf(txtnum2.getText()));

                    Operaciones object = new Operaciones(num1, num2);

                    Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                    intent.putExtra("resultado", object.Suma());
                    startActivity(intent);
                } else{

                }
            }
        });

        btnRestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (validad() == true){
                    int num1 = Integer.parseInt(String.valueOf(txtnum1.getText()));
                    int num2 = Integer.parseInt(String.valueOf(txtnum2.getText()));

                    Operaciones object = new Operaciones(num1, num2);


                    Intent intent = new Intent(MainActivity.this, MainActivity2.class);

                    intent.putExtra("resultado", object.Resta());

                    startActivity(intent);
                } else{

                }
            }
        });

        btnDividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (validad() == true){
                    int num1 = Integer.parseInt(String.valueOf(txtnum1.getText()));
                    int num2 = Integer.parseInt(String.valueOf(txtnum2.getText()));

                    Operaciones object = new Operaciones(num1, num2);

                    Intent intent = new Intent(MainActivity.this, MainActivity2.class);

                    intent.putExtra("resultado", object.Division());

                    startActivity(intent);
                } else{

                }
            }
        });

        btnMultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (validad() == true){
                    int num1 = Integer.parseInt(String.valueOf(txtnum1.getText()));
                    int num2 = Integer.parseInt(String.valueOf(txtnum2.getText()));

                    Operaciones object = new Operaciones(num1, num2);

                    Intent intent = new Intent(MainActivity.this, MainActivity2.class);


                    intent.putExtra("resultado", object.Multiplicacion());

                    startActivity(intent);
                } else{

                }
            }
        });
    }
    public boolean validad(){
        boolean retorna = true;

        if (txtnum1.getText().toString().isEmpty()){
            txtnum1.setError("No se permiten valores nulos");
            retorna = false;
        }
        if (txtnum2.getText().toString().isEmpty()){
            txtnum2.setError("No se permiten valores nulos");
            retorna = false;
        }
        return retorna;
    }
}
