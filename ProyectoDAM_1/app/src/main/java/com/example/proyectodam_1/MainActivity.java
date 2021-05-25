package com.example.proyectodam_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button Registrar, Cancelar;
    private EditText Nombre, Alumno, Apellido, Contrase;
    daoAlumno dao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Nombre = findViewById(R.id.txt_Nombre);
        Apellido = findViewById(R.id.txt_Apellido);
        Alumno = findViewById(R.id.txt_Alumno);
        Contrase = findViewById(R.id.txt_Contraseña);
        Registrar = findViewById(R.id.btn_registrar);
        Cancelar = findViewById(R.id.btn_Cancelar);

       dao= new daoAlumno(this);
        Cancelar.setOnClickListener(this);
        Registrar.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.btn_registrar:
                Alumno a = new Alumno();
                a.setAlumno(Alumno.getText().toString());
                a.setNombre(Nombre.getText().toString());
                a.setApellido(Apellido.getText().toString());
                a.setPassword(Contrase.getText().toString());
                if (a.isNull()) {
                    Toast.makeText(this, "Error: Llena todos los campos", Toast.LENGTH_LONG).show();
                }else if (dao.insertarAlumno(a)){
                    Toast.makeText(this, "Alumno Registrado", Toast.LENGTH_SHORT).show();
                    Intent intent2 = new Intent(MainActivity.this, AlumnoLogeoActivity.class);
                    startActivity(intent2);
                    finish();

                }else{
                    Toast.makeText(this, "Alumno ya Registrado!!!", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.btn_Cancelar:
                Intent intent = new Intent(MainActivity.this, AlumnoLogeoActivity.class);
                startActivity(intent);
                finish();
                break;
        }

    }
}