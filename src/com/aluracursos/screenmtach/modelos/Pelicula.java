package com.aluracursos.screenmtach.modelos;

import com.aluracursos.screenmatch.calculos.Clasificacion;

public class Pelicula extends  Titulo implements Clasificacion {
    private String director;

    // getters
    public String getDirector(){
        return director;
    }

    // setters
    public void setDirector(String director){
        this.director = director;
    }

    @Override
    public int getClasificacion() {
        return (int) (calculaMedia() / 2);
    }
}
