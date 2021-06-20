package com.example.proyectodam_1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;


import com.example.proyectodam_1.Fragment_Admin_teacher;
import com.example.proyectodam_1.Fragment_Alumno;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    FragmentTransaction transaction;
    Fragment FragmentoProfesor, FragmentoAlumno, FragmentoMensaje;
    Button botonAlumno, botonProfesor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botonAlumno= findViewById(R.id.botonalumno);
        botonProfesor= findViewById(R.id.botonprofesor);

        botonAlumno.setOnClickListener(this);
        botonProfesor.setOnClickListener(this);

        FragmentoMensaje= new BlankFragmentAdmin();
        FragmentoProfesor = new Fragment_Admin_teacher();
        FragmentoAlumno= new Fragment_Alumno();

        getSupportFragmentManager().beginTransaction().add(R.id.Contenedor_Fragment,FragmentoMensaje).commit();

    }

    @Override
    public void onClick(View v) {
        transaction = getSupportFragmentManager().beginTransaction();

        switch (v.getId()) {
            case R.id.botonalumno:
                transaction.replace(R.id.Contenedor_Fragment, FragmentoAlumno);
                transaction.addToBackStack(null);
                break;
            case R.id.botonprofesor:
                transaction.replace(R.id.Contenedor_Fragment, FragmentoProfesor);
                transaction.addToBackStack(null);
                break;
        }
        transaction.commit();
    }
}