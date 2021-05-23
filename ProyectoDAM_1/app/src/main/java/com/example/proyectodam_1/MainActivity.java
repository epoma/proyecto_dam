package com.example.proyectodam_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button Registrar, Cancelar;
    private EditText Nombre, Alumno, Apellido, Contraseña;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    Nombre= findViewById(R.id.txt_Nombre);
    Apellido=findViewById(R.id.txt_Apellido);
    Alumno=findViewById(R.id.txt_Alumno);
    Contraseña=findViewById(R.id.txt_contraseña);
    Registrar=findViewById(R.id.bt_registrar);
    Cancelar=findViewById(R.id.bt_Cancelar);

    Cancelar.setOnClickListener(this);
    Registrar.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bt_registrar:

                break;
            case R.id.bt_Cancelar:
                Intent intent = new Intent(MainActivity.this, AlumnoLogeoActivity.class);
                startActivity(intent);
                finish();
                break;
        }
    }
}