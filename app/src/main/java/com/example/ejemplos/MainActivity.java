package com.example.ejemplos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private EditText etTexto;
    private Button  btGuardar;
    private Button  btModificar;
    private NodoLIsta primero = null;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

/*
        etTexto = findViewById(R.id.etTexto);
        btGuardar = findViewById(R.id.btMostrar);
        btModificar=findViewById(R.id.btModifica);
       // ArrayAdapter adapter=new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1,);

        btGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String aux = etTexto.getText().toString().trim();
                primero = new NodoLIsta(aux, primero);
                etTexto.setText("");

                String resultado = "";
                NodoLIsta auxPri = primero;
                while (auxPri != null) {
                    resultado += auxPri + " -> ";
                    auxPri = auxPri.getEnlace();

                }
                //arrayList.add(resultado);
                //lvMostrar.setAdapter(adapter);
                etTexto.setText("");
                //adapter.notifyDataSetChanged();

                Log.i("Log",resultado);

            }

        });
        btModificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String aux = etTexto.getText().toString().trim();
                primero = new NodoLIsta(aux, primero);
                int contador=0;
                boolean esta = false;
                NodoLIsta auxPri = primero;

                while (auxPri != null) {

                    contador++;

                    if ( aux.equals(auxPri.getDato())){
                        esta=true;
                        Log.i("log","eL NOMBRE SE ENCUENTRA EN LA POSCICION "+contador);
                        break;
                    }
                    auxPri = auxPri.getEnlace();//se actualiza el dato

                }

                if (esta==false)
                    Log.i("Log","El nombre no se encuentra en la lista ");



            }
        });*/
    }


}