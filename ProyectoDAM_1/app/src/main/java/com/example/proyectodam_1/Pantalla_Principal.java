package com.example.proyectodam_1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Pantalla_Principal extends AppCompatActivity implements View.OnClickListener {


    private Button boton_alumno, boton_profesor, boton_admin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_principal);

        boton_alumno = findViewById(R.id.bp_Alumno);
        boton_profesor=findViewById(R.id.bp_profesor);
        boton_admin=findViewById(R.id.bp_administrador);

        boton_alumno.setOnClickListener(this);
        boton_profesor.setOnClickListener(this);
        boton_admin.setOnClickListener(this);


    }

    @Override
    public void onClick(View vista) {
        switch (vista.getId()){
            case R.id.bp_Alumno:
                IngresoAlumno(vista);
                break;
            case R.id.bp_profesor:
                IngresoProfesor(vista);
                break;
            case R.id.bp_administrador:
                IngresoAdmin(vista);
                break;
        }
    }

    private void IngresoAdmin(View vista) {
        Intent intent3 = new Intent(this, AdminLogeo.class);
        startActivity(intent3);
    }

    public void IngresoAlumno(View vista){
        Intent intent1 = new Intent(this, AlumnoLogeoActivity.class);
        startActivity(intent1);
    }

    public void IngresoProfesor(View vista){
        Intent intent2 = new Intent(this, ProfesorLogeoActivity.class);
        startActivity(intent2);
    }




}