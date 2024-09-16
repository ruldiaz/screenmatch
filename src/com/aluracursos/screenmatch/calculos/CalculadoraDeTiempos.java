package com.aluracursos.screenmatch.calculos;

import com.aluracursos.screenmtach.modelos.Titulo;

public class CalculadoraDeTiempos {
    private int tiempoTotal;

    public int getTiempoTotal(){
        return tiempoTotal;
    }

    public void incluye(Titulo titulo){
        this.tiempoTotal += titulo.getDuracionEnMinutos();
    }
}
;