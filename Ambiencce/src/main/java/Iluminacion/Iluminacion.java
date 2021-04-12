/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iluminacion;

/**
 *
 * @author GenadyThink
 */
public class Iluminacion {
    private String marca,tipo;
    private boolean disponible,dmx;
    private int voltaje,serie;
    public  Iluminacion() {
        //Constructor Vacio
    }
    public  Iluminacion(String marca,String tipo,Boolean disponible,Boolean dmx,int voltaje,int serie) {
        //Conmstructor Completo
        this.disponible=disponible;
        this.dmx=dmx;
        this.marca=marca;
        this.serie=serie;
        this.tipo=tipo;
        this.voltaje=voltaje;
    }
    public  Iluminacion(String marca,String tipo,int voltaje) {
        this.marca=marca;
        this.tipo=tipo;
        this.voltaje=voltaje;
    }
    public Iluminacion(int serie){
        this.serie=serie;
    }
    
    public Iluminacion(String marca,int serie){
        this.marca=marca;
        this.serie=serie;
    }
    public  Iluminacion(int serie,String tipo) {
        this.tipo=tipo;
        this.serie=serie;
    }
    public  Iluminacion(int serie, int voltaje) {
        this.serie=serie;
        this.voltaje=voltaje;
    }
    public  Iluminacion(String marca, String tipo, int voltaje, int serie) {
        this.marca=marca;
        this.tipo=tipo;
        this.voltaje=voltaje;
        this.serie=serie;
    }
    
    
    @Override
    public String toString() {
        return    "Numero de Serie: "+serie+ "      Voltaje: "+voltaje+"      DMX: "+dmx+"      Disponible: "+disponible+"      Marca: "+marca+"      tipo: "+tipo;
    }
    
    public String imprimir(){
        return "Iluminacion:\n"+"\nMarca\t"+getMarca()+"\nTipo\t"+getTipo()+"\nNumero de Serie\t"+getSerie()+"\nVoltaje\t"+getVoltaje()+"\nDmx\t"+isDmx()+"\nDisponible\t"+isDisponible();
    }
   //--------------------------------------------------------------------------------------------------- 

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public boolean isDmx() {
        return dmx;
    }

    public void setDmx(boolean dmx) {
        this.dmx = dmx;
    }

    public int getVoltaje() {
        return voltaje;
    }

    public void setVoltaje(int voltaje) {
        this.voltaje = voltaje;
    }

    public int getSerie() {
        return serie;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }
    
}
