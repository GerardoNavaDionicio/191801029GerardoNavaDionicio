/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author GenadyThink
 */
public class Pelicula {
    public String titulo,genero,director,casaProductora,clasificacion;
    public int anio;
    public double duracion;
    public boolean subtitulada;
    
    public  Pelicula() {
    }
    public  Pelicula(String titulo,String director,String genero,String casaProductora,String clasificacion,double duracion,int anio,boolean subtitulada){
       this.anio=anio;
       this.casaProductora=casaProductora;
       this.clasificacion = clasificacion;
       this.director=director;
       this.duracion=duracion;
       this.genero=genero;
       this.subtitulada=subtitulada;
       this.titulo=titulo;
    }
    public  Pelicula(String titulo) {
        this.titulo=titulo;
    }
    
    
    
    
    @Override
    public String toString() {
        return "\nTitulo: "+titulo;
    }
}

