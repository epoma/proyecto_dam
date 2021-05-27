package com.example.proyectodam_1;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.proyectodam_1.Classes.Alumno;
import com.example.proyectodam_1.daoClass.daoAlumno;

import androidx.appcompat.app.AppCompatActivity;

public class AlumnoLogeoActivity extends AppCompatActivity {

    private EditText et_codigo, et_contrasena;
    private Button bt_ingresar, bt_registrar;
    daoAlumno dao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.alumno_logeo);

        et_codigo = findViewById(R.id.txt_pcodigo);
        et_contrasena = findViewById(R.id.txt_pcontraseña);
        bt_ingresar = findViewById(R.id.bt_pingresar);

        dao = new daoAlumno(this);

        bt_ingresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String alum = et_codigo.getText().toString();
                String contra = et_contrasena.getText().toString();
                if (alum.equals("") && contra.equals("")) {
                    Toast.makeText(AlumnoLogeoActivity.this, "Error: Campos vacios", Toast.LENGTH_SHORT).show();
                } else if (dao.login(alum, contra) == 1) {
                    Alumno Al = dao.getAlumno(alum, contra);
                    Toast.makeText(AlumnoLogeoActivity.this, "Datos correctos", Toast.LENGTH_SHORT).show();
                    Intent intent2 = new Intent(AlumnoLogeoActivity.this, AlumnoHorarioActivity.class);
                    intent2.putExtra("alum", Al.getAlumno());
                    startActivity(intent2);
                }


            }
        });


    }

}

