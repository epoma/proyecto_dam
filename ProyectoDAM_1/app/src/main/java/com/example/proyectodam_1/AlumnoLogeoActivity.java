package com.example.proyectodam_1;

import android.content.Intent;
import android.icu.number.IntegerWidth;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


import androidx.appcompat.app.AppCompatActivity;

public class AlumnoLogeoActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText et_codigo, et_contraseña;
    private Button bt_ingresar, bt_registrar;
    daoAlumno dao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.alumno_logeo);

    et_codigo=findViewById(R.id.txt_codigo);
    et_contraseña=findViewById(R.id.txt_contraseña);
    bt_ingresar=findViewById(R.id.bt_ingresar);
    bt_registrar=findViewById(R.id.bt_registrar);

    bt_ingresar.setOnClickListener(this);
    bt_registrar.setOnClickListener(this);

    dao= new daoAlumno(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bt_ingresar:
                Log.d("A", "onClick: Entrando a la funcion");
                String alumo = et_codigo.getText().toString();
                String contra = et_contraseña.getText().toString();
                if(alumo.equals("")&& contra.equals("")){
                    Toast.makeText(this, "Error: Campos vacios", Toast.LENGTH_SHORT).show();
                }else if (dao.login(alumo,contra)==1){
                    Alumno Al = dao.getAlumno(alumo,contra);
                    Toast.makeText(this, "Datos correctos", Toast.LENGTH_SHORT).show();
                    Intent intent2 = new Intent(AlumnoLogeoActivity.this, ProfesorHorarioActivity.class);
                    intent2.putExtra("alum", Al.getAlumno());
                    startActivity(intent2);
                }
                break;
            case R.id.bt_registrar:
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                break;
        }
    }
}