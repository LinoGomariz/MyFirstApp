package com.example.miprimeraaplicacion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private int numero = 4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MiModelo modelo = new MiModelo();


        Log.e("manel_error", "mensaje de error");
        Log.e(TAG, "otro mensaje de error");

        Log.i(TAG, "Este mensaje es de informacion: "+numero);

        Log.w(TAG, "Esto es un warming");

        Log.d(TAG, "este es el debug");

        Log.d(TAG, "este es el debug");
    }
}