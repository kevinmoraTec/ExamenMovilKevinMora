package com.example.examenandroidfinalkevinmora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;


public class MainActivity extends AppCompatActivity {
    private Button mButtonSend;
    private EditText mEditTextDate;
    private Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setViews();
        mButtonSend = (Button) findViewById(R.id.button);
        mButtonSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String valor1=mEditTextDate.getText().toString();
                String selection=spinner.getSelectedItem().toString();
                if (selection.equals("Colores") ){
                    Intent i = new Intent(MainActivity.this, Validar.class);
                    i.putExtra("ColorIngresado",valor1);
                    startActivity(i);
                }else if(selection.equals("Cantidad de letras")){
                    Intent i = new Intent(MainActivity.this, Validar.class);
                    i.putExtra("palabraIngresada",valor1);
                    startActivity(i);
                }
            }
        });

    }


    private void setViews() {
        // Button


        // EditText
        mEditTextDate = (EditText) findViewById(R.id.editText);
        spinner = (Spinner) findViewById(R.id.spinner);



        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.spinner_data, android.R.layout.simple_spinner_item);

        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Apply the adapter to the spinner
        spinner.setAdapter(adapter);
    }

    public void validar(View view){

    }

}