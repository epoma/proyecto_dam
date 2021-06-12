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

import com.example.proyectodam_1.Classes.Alumno;
import com.example.proyectodam_1.daoClass.daoAlumno;
import com.example.proyectodam_1.daoClass.daoCarrera;
import com.example.proyectodam_1.room.RoomBDAlumnos;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button Registrar, Cancelar;
    private EditText Nombre, Alumno, Apellido, Contrase, Direccion, Edad, Celular;
    private Spinner estado, carrera;
    ArrayList<String> Estadho;

    daoCarrera daoRace;
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
        Direccion= findViewById(R.id.txt_direccion);
        Edad= findViewById(R.id.txt_Edad);
        Celular = findViewById(R.id.txt_Celularsh);
        estado = findViewById(R.id.sp_estado);
        carrera = findViewById(R.id.sp_carrera);

        daoRace = new daoCarrera(this);
        dao= new daoAlumno(this);

        Cancelar.setOnClickListener(this);
        Registrar.setOnClickListener(this);




        //Llena el spinner con los datos registrados en string.xml
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.comboEstado, android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        estado.setAdapter(adapter);


        //Llena el spinner con los datos registrados en string.xml
        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this,
                R.array.combocodCarrera, android.R.layout.simple_spinner_item);

        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        carrera.setAdapter(adapter1);


        //Metodo para controlar los eventos del spinner
        estado.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),
                        "Seleccionó: "+parent.getItemAtPosition(position).toString(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });



    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_registrar:
//                Alumno a = new Alumno();
//                a.setAlumno(Alumno.getText().toString());
//                a.setNombre(Nombre.getText().toString());
//                a.setApellido(Apellido.getText().toString());
//                a.setPassword(Contrase.getText().toString());
//                a.setEstado(estado.getItemAtPosition(estado.getSelectedItemPosition()).toString());
//                a.setEdad(Integer.parseInt(Edad.getText().toString()));
//                a.setCelular(Integer.parseInt(Celular.getText().toString()));
//                a.setCodcarrera(carrera.getSelectedItemPosition());
//                a.setDireccion(Direccion.getText().toString());

                com.example.proyectodam_1.room.entidades.Alumno entidad = new com.example.proyectodam_1.room.entidades.Alumno();
                entidad.alumno = Alumno.getText().toString();
                entidad.nombre = Nombre.getText().toString();
                entidad.apellido = Apellido.getText().toString();
                entidad.password = Contrase.getText().toString();
                entidad.estado = estado.getItemAtPosition(estado.getSelectedItemPosition()).toString();
                entidad.edad = Integer.parseInt(Edad.getText().toString());
                entidad.celular = Celular.getText().toString();
                entidad.codcarrera = carrera.getSelectedItemPosition();
                entidad.direccion = Direccion.getText().toString();

//                if (a.isNull()) {
//                    Toast.makeText(this, "Error: Llena todos los campos", Toast.LENGTH_LONG).show();
//                }else if (dao.insertarAlumno(a)){
//                    Toast.makeText(this, "Alumno Registrado", Toast.LENGTH_SHORT).show();
//                    Intent intent2 = new Intent(MainActivity.this, AlumnoLogeoActivity.class);
//                    startActivity(intent2);
//                    finish();
//               }else{
//                    Toast.makeText(this, "Alumno ya Registrado!!!", Toast.LENGTH_SHORT).show();
//                }

                if (RoomBDAlumnos.getDB(getApplicationContext()).alumnoDao().agregarAlumnos(entidad) != 0){
                    Toast.makeText(this, "Alumno Registrado", Toast.LENGTH_SHORT).show();
                    Intent intent2 = new Intent(MainActivity.this, AlumnoLogeoActivity.class);
                    startActivity(intent2);
                    finish();
                }else{
                    Toast.makeText(this, "Alumno ya Registrado!!!", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.btn_Cancelar:
                Intent intent = new Intent(MainActivity.this, AdminLogeo.class);
                startActivity(intent);
                finish();
                break;
        }

    }
}