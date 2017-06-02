package com.example.gcesar.clase;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    // Variables infladas del XML
    TextView user;
    TextView pass;
    // Variables utilizadas dentro del programa
    String usuarioRecibido = "";
    String passRecibido = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        user = (TextView) findViewById(R.id.user);
        pass = (TextView) findViewById(R.id.pass);

        //Donde el intent saca la informacion que llama
        Intent intent = getIntent();

        //Asignar a mis strings la informacion que viene del intent
        usuarioRecibido = intent.getStringExtra("llaveCorreo");
        passRecibido = intent.getStringExtra("contrasenia");

        user.setText(usuarioRecibido);
        pass.setText(passRecibido);

    }
}
