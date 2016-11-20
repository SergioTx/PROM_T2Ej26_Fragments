package com.example.sergio.prom_t2ej26_fragments;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.sergio.prom_t2ej26_fragments.fragments.FragmentDetalle;

public class DetalleActivity extends AppCompatActivity {

    public static final String EXTRA_TEXTO = "con.example.sergio.prom_t2ej26_fragments.EXTRA_TEXTO";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);

        FragmentDetalle detalle = (FragmentDetalle) getSupportFragmentManager().findFragmentById(R.id.frg_detalle);

        detalle.mostrarDetalle(getIntent().getStringExtra(EXTRA_TEXTO));
    }
}
