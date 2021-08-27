package com.example.examenandroidfinalkevinmora;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintSet;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Validar extends AppCompatActivity {
    private TextView tvValorIngresado;
    private TextView tvnumRandom;
    private TextView tvResult;
    private String valorIngresado;
    private Button VolverAtras;



    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_validar);

        VolverAtras=(Button) findViewById(R.id.botoregresar);
        tvValorIngresado= (TextView) findViewById(R.id.tvnumIgresaste);
        tvnumRandom = (TextView) findViewById(R.id.tvnumRandom);
        tvResult= (TextView) findViewById(R.id.tvvalidar);
        valorIngresado = getIntent().getExtras().getString("palabraIngresada");
        valorIngresado = getIntent().getExtras().getString("ColorIngresado");
        ////Para calcular el tamaño de la cadena Ingresada
        tvValorIngresado.setText("VALOR Ingresado ="+valorIngresado);
        int valorCalculadoLetras=calclarTamañodePalabra(valorIngresado);
        //tvResult.setText("tamaño es : "+valorCalculadoLetras);
        ////Para calcular el Color Ingresado.
        String[ ] nombre = {"amaraillo", "azul","rojo"};

        if (nombre[2].equals("amaraillo")){
            tvResult.setText("Color Rojo : Ganaste");

        }



        VolverAtras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Validar.this,MainActivity.class);
                startActivity(i);
            }
        });

    }

    public int calclarTamañodePalabra(String p){
        return  p.length();
    }
}