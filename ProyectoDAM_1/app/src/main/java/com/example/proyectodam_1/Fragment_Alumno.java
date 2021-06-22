package com.example.proyectodam_1;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;



import java.util.ArrayList;


public class Fragment_Alumno extends Fragment implements View.OnClickListener {

    private Button Registrar, Cancelar;
    private EditText Nombre, Alumno, Apellido, Contrase, Direccion, Edad, Celular;
    private Spinner estado, carrera;
    ArrayList<String> Estadho;
    private static Context context;




    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment__alumno, container, false);

    }

    @Override
    public void onViewCreated(@NonNull  View view, @Nullable  Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Nombre = view.findViewById(R.id.txt_Nombre);
        Apellido = view.findViewById(R.id.tx_nombbre_alu);
        Contrase = view.findViewById(R.id.txt_contra_alu);
        Direccion = view.findViewById(R.id.txt_dire_alu);
        Edad = view.findViewById(R.id.txt_eda_alu);
        Celular = view.findViewById(R.id.txt_celu_alu);

        context= getActivity().getApplicationContext();


        Cancelar.setOnClickListener(this);
        Registrar.setOnClickListener(this);



        //Llena el spinner con los datos registrados en string.xml
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(context,
                R.array.comboEstado, android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        estado.setAdapter(adapter);

        //Llena el spinner con los datos registrados en string.xml
        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(context,
                R.array.combocodCarrera, android.R.layout.simple_spinner_item);

        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        carrera.setAdapter(adapter1);


    }

    @Override
    public void onClick(View v) {

    }
}