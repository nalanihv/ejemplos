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
    private Button  btMostrar;
    private NodoLIsta primero = null;
    private ListView lvMostrar;
    private ArrayList<String> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        arrayList=new ArrayList<>();
        etTexto = findViewById(R.id.etTexto);
        btMostrar = findViewById(R.id.btMostrar);
        lvMostrar=findViewById(R.id.lvMostrar);
        ArrayAdapter adapter=new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1,arrayList);


        btMostrar.setOnClickListener(new View.OnClickListener() {
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
                arrayList.add(resultado);
                lvMostrar.setAdapter(adapter);
                etTexto.setText("");
                adapter.notifyDataSetChanged();



                Log.i("Log",resultado);


            }

        });
    }


}