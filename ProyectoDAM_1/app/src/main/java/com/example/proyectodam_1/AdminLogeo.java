package com.example.proyectodam_1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.proyectodam_1.Classes.Administrador;
import com.example.proyectodam_1.daoClass.daoAdministrador;

import androidx.appcompat.app.AppCompatActivity;

public class AdminLogeo extends AppCompatActivity implements View.OnClickListener {

    private Button bt_ingreso, bt_regreso;
    private TextView codigo, contraseña;
    daoAdministrador daoAdmin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_logeo);

        bt_ingreso=findViewById(R.id.bt_Ad_Ingreso);
        bt_regreso=findViewById(R.id.bt_Ad_return);
        codigo=findViewById(R.id.txt_ad_codigo);
        contraseña=findViewById(R.id.txt_ad_contraseña);

        daoAdmin= new daoAdministrador(this);

        bt_ingreso.setOnClickListener(this);
        bt_regreso.setOnClickListener(this);

    }

    @Override
    public void onClick(View vista) {
           switch (vista.getId()){
        case R.id.bt_Ad_Ingreso:
            String ID = codigo.getText().toString();
            String PASS= contraseña.getText().toString();
              if(ID.equals(" ") || PASS.equals(" ")){
                  Toast.makeText(this, "Error: Llena todos los campos", Toast.LENGTH_SHORT).show();
              } else if(daoAdmin.loginAdmin(ID, PASS)==1){
                  Administrador administrador = daoAdmin.getAdministrado(ID, PASS);
                  Toast.makeText(this, "Datos Correctos!!", Toast.LENGTH_SHORT).show();
                  Intent intent = new Intent(AdminLogeo.this, MainActivity.class);
                  startActivity(intent);
              }
            break;
               case R.id.bt_Ad_return:
               Intent intent1 = new Intent(AdminLogeo.this, Pantalla_Principal.class);
               startActivity(intent1);
               break;

     }
    }

}