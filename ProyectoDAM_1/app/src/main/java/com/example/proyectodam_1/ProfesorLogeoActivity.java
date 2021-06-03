package com.example.proyectodam_1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import com.example.proyectodam_1.Classes.Profesor;
import com.example.proyectodam_1.daoClass.daoProfesor;


public class ProfesorLogeoActivity extends AppCompatActivity {

    private EditText et_codigo, et_password;
    private Button b_entrar;
    daoProfesor dao;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profesor_logeo);

        et_codigo= findViewById(R.id.txt_pcodigo);
        et_password= findViewById(R.id.txt_pcontraseña);
        b_entrar=findViewById(R.id.bt_Aingresar);

        dao= new daoProfesor(this);

        b_entrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String teacher = et_codigo.getText().toString();
                String pass = et_password.getText().toString();

                if(teacher.equals("")&& pass.equals("")){
                    Toast.makeText(ProfesorLogeoActivity.this, "Error: Campos vacios", Toast.LENGTH_SHORT).show();
                }else if (dao.Login(teacher,pass)==1){
                    Profesor pro = dao.getprofesor(teacher,pass);
                    Toast.makeText(ProfesorLogeoActivity.this, "Datos correctos", Toast.LENGTH_SHORT).show();
                    Intent intent2 = new Intent(ProfesorLogeoActivity.this, ProfesorHorarioActivity.class);
                    intent2.putExtra("alum", pro.getProfesor());
                    startActivity(intent2);
                }


            }
        });






        }


    }



