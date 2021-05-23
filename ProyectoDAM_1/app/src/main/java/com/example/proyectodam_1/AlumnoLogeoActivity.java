package com.example.proyectodam_1;

import android.content.Intent;
import android.icu.number.IntegerWidth;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class AlumnoLogeoActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText et_codigo, et_contraseña;
    private Button bt_ingresar, bt_registrar;

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

    }

    public void Ingresar(View view){
        String contraseña= et_contraseña.getText().toString();
        String codigo=  et_codigo.getText().toString();

            if(!codigo.equals("") && !contraseña.equals("")){
                Intent intent = new Intent(this, AlumnoHorarioActivity.class);
            }
            else{
                Toast.makeText(this, "Ingresa tu còdigo", Toast.LENGTH_SHORT).show();
                et_codigo.requestFocus();
                InputMethodManager imm =(InputMethodManager)getSystemService(this.INPUT_METHOD_SERVICE);
                imm.showSoftInput(et_codigo, InputMethodManager.SHOW_IMPLICIT);
            }



    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bt_ingresar:
                break;
            case R.id.bt_registrar:
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                break;

        }
    }
}