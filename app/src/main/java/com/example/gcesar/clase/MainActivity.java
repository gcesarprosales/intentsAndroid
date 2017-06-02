package com.example.gcesar.clase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //variables para inflar la vista
    Button login;
    EditText etEmail;
    EditText etPass;

    //variables utilizadas dentro del programa
    final String emailTrue = "gcesarprosales@gmail.com";
    final String passTrue = "12345";
    String correo = "";
    String contrasenia = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        login= (Button) findViewById(R.id.login);
        etEmail = (EditText) findViewById(R.id.etEmail);
        etPass = (EditText) findViewById(R.id.etPass);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                correo = etEmail.getText().toString();
                contrasenia = etPass.getText()+"";

                if (!correo.equals("") && correo.equals(emailTrue)){
                    if (!contrasenia.equals("") && contrasenia.equals(passTrue)){
                        // Intent para pasar a otra actividad (de donde, hacia donde)
                        Intent intent = new Intent(getApplicationContext(),SecondActivity.class);
                        //Poniendo informacion al intent
                        intent.putExtra("llaveCorreo",correo);
                        intent.putExtra("contrasenia",contrasenia);
                        //Lanzar la otra actividad
                        startActivity(intent);
                    }
                }else{
                    Toast.makeText(getApplicationContext(),"Error, datos invalidos", Toast.LENGTH_LONG).show();;
                }
            }
        });
    }
}
