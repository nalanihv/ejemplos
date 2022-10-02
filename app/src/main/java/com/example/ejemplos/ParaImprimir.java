package com.example.ejemplos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ParaImprimir extends AppCompatActivity {
    private EditText etGuardar;
    private Button bOrdenar, bGuardar;
    private ListView lvNumeros;
    private ArrayList<Integer> alNumeros;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_para_imprimir);

        etGuardar = findViewById(R.id.etTexto);
        bGuardar = findViewById(R.id.btMostrar);
        bOrdenar = findViewById(R.id.btOrdenar);
        lvNumeros = findViewById(R.id.lvMostrar);
        alNumeros = new ArrayList<>();


        ArrayAdapter adapter = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1, alNumeros);

        bGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String input = etGuardar.getText().toString().trim();
                if (input.equals(""))
                    Toast.makeText(getApplicationContext(), "Favor de ingresar un número", Toast.LENGTH_LONG).show();
                else {
                    int aux = Integer.parseInt(input);
                    boolean bandera = false;
                    for (int i = 0; i < alNumeros.size(); i++) {
                        if (alNumeros.get(i) == aux) {
                            bandera = true;
                            break;
                        }
                    }

                    if (bandera)
                        Toast.makeText(getApplicationContext(), "El entero " + aux + " ya existe", Toast.LENGTH_LONG).show();
                    else {
                        alNumeros.add(aux);
                        etGuardar.setText("");
                        adapter.notifyDataSetChanged();
                        lvNumeros.setAdapter(adapter);
                    }
                }
            }
        });

        bOrdenar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int n = alNumeros.size();
                for (int i = 0; i < n - 1; i++) {
                    for (int j = 0; j < n - i - 1; j++) {
                        if (alNumeros.get(j) > alNumeros.get(j + 1)) {
                            int temp = alNumeros.get(j);
                            alNumeros.set(j, alNumeros.get(j + 1));
                            alNumeros.set(j + 1, temp);
                        }
                    }
                }
                for (int i = 0; i < alNumeros.size(); i++) {
                    Log.i("mensajes", alNumeros.get(i) + "");
                }
                //ArrayAdapter adapter = new ArrayAdapter( getApplicationContext(), android.R.layout.simple_list_item_1, alNumeros );
                adapter.notifyDataSetChanged();
                lvNumeros.setAdapter(adapter);
            }
        });
    }
}