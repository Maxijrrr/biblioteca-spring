package com.example.biblioteca;

public class Libro {

    private String titulo;
    private String autos;

    
    public Libro(String titulo, String autos) {
        this.titulo = titulo;
        this.autos = autos;
    }


    public String getTitulo() {
        return titulo;
    }


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public String getAutos() {
        return autos;
    }


    public void setAutos(String autos) {
        this.autos = autos;
    }

    
    
    
}
