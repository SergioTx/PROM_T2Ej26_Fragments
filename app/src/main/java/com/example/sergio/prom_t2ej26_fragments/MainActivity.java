package com.example.sergio.prom_t2ej26_fragments;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.sergio.prom_t2ej26_fragments.fragments.FragmentDetalle;
import com.example.sergio.prom_t2ej26_fragments.fragments.FragmentListado;
import com.example.sergio.prom_t2ej26_fragments.fragments.Libro;

public class MainActivity extends AppCompatActivity implements FragmentListado.LibrosListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentListado frg_listado = (FragmentListado) getSupportFragmentManager().findFragmentById(R.id.frg_listado);
        frg_listado.setLibrosListener(this);
    }

    public void onLibroSeleccionado(Libro l){
        boolean existeDetalle = getSupportFragmentManager().findFragmentById(R.id.frg_detalle) != null;

        if (existeDetalle){
            FragmentDetalle frg_det = (FragmentDetalle) getSupportFragmentManager().findFragmentById(R.id.frg_detalle);
            frg_det.mostrarDetalle(l.getTitulo());
        } else {
            Intent i = new Intent(this,DetalleActivity.class);
            i.putExtra(DetalleActivity.EXTRA_TEXTO,l.getTitulo());
            startActivity(i);
        }
    }
}