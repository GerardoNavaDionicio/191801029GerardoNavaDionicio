/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author GenadyThink
 */
public class Cancion {
    public String titulo;
    public int orden;
    public double duracion;
    
    //Metodos
    public Cancion(String titulo,int orden, double duracion){
        this.duracion = duracion;
        this.orden = orden;
        this.titulo = titulo;
    }
    public Cancion(){
        this.duracion = 0.0;
        this.orden = 0 ;
        this.titulo = "";
    }
    
    @Override
    public String toString(){
        return "Orden: "+orden+"\nTitulo: "+titulo+"\nDuracion: "+duracion;
    }
}
