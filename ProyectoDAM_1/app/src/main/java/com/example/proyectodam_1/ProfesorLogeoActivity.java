package com.example.proyectodam_1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.proyectodam_1.daoClass.daoProfesor;


public class ProfesorLogeoActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText et_codigo, et_password;
    private Button b_entrar, b_regresar;
    daoProfesor dao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profesor_logeo);

        et_codigo= findViewById(R.id.txt_pcodigo);
        et_password= findViewById(R.id.txt_pcontraseña);
        b_entrar=findViewById(R.id.bt_p_ingresar);
        b_regresar= findViewById(R.id.bt_p_regresar);

        dao= new daoProfesor(this);

        b_entrar.setOnClickListener(this);
        b_regresar.setOnClickListener(this);


        }

    @Override
    public void onClick(View vista) {
        switch (vista.getId()){
            case R.id.bt_p_ingresar:
                String teacher = et_codigo.getText().toString();
                String contraseina= et_password.getText().toString();

                if(teacher.equals(" ") || contraseina.equals(" ")){
                    Toast.makeText(this, "Error: Completa los campos", Toast.LENGTH_SHORT).show();
                }else if (dao.Login(teacher, contraseina)==1){
                     Profesor profesor = dao.getprofesor(teacher, contraseina);
                     Toast.makeText(this, "Datos Correctos", Toast.LENGTH_SHORT).show();
                     Intent intent = new Intent(ProfesorLogeoActivity.this, ProfesorHorarioActivity.class);
                     startActivity(intent);
                }
                break;
            case R.id.bt_p_regresar:
                Intent intent1 = new Intent(ProfesorLogeoActivity.this, Pantalla_Principal.class);
                startActivity(intent1);
                break;
        }

    }

    @Override
    public void onBackPressed() {
    }

    }



