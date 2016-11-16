package com.example.sergio.prom_t2ej26_fragments.fragments;

/**
 * Created by Sergio on 16/11/2016.
 */

public class Libro {
    private String autor, titulo;
    private int anio;

    public Libro (String autor, String titulo, int anio){
        this.autor = autor;
        this.titulo = titulo;
        this.anio = anio;
    }

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnio() {
        return anio;
    }
}
