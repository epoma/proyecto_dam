package com.example.proyectodam_1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.proyectodam_1.Classes.Alumno;
import com.example.proyectodam_1.daoClass.daoAlumno;

public class AlumnoLogeoActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText et_codigo, et_contrasena;
    private Button bt_ingresar, bt_regresar;
    daoAlumno dao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.alumno_logeo);

        et_codigo = findViewById(R.id.txt_pcodigo);
        et_contrasena = findViewById(R.id.txt_pcontraseña);
        bt_ingresar = findViewById(R.id.bt_Aingresar);
        bt_regresar = findViewById(R.id.bt_Aregresar);

        dao = new daoAlumno(this);

        bt_ingresar.setOnClickListener(this);
        bt_regresar.setOnClickListener(this);
    }

    @Override
    public void onClick(View vista) {
        switch (vista.getId()){
            case R.id.bt_Aingresar:
                Logeo(vista);
                break;
            case R.id.bt_Aregresar:
                Regresar(vista);
                break;
        }
    }

    public void  Logeo(View vista){
        String alum= et_codigo.getText().toString();
        String contraseña = et_contrasena.getText().toString();
          if(alum.equals("") || contraseña.equals("")){
            Toast.makeText(this, "Completa todos los campos", Toast.LENGTH_SHORT).show();
        } else if (dao.login(alum, contraseña)==1){
              Alumno alumno = dao.getAlumno(alum, contraseña);
              Toast.makeText(this, "Datos Correctos", Toast.LENGTH_SHORT).show();
              Intent intent = new Intent(this, AlumnoHorarioActivity.class);
             // intent.putExtra("alum", alumno.getAlumno());
              startActivity(intent);
          }

    }

    public void Regresar(View vista){
        Intent intent2= new Intent(this, Pantalla_Principal.class);
        startActivity(intent2);
    }


}



