/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hardaware;

/**
 *
 * @author GenadyThink
 */
public class Ram {
    private String marca;
    private int capacidad;
    private int velocidad;
    
    public Ram(String marca, int capacidad,int velocidad){
        this.capacidad=capacidad;
        this.marca=marca;
        this.velocidad=velocidad;
    }
    public  Ram() {
    }
    @Override
    public String toString() {
        return "\nCapacidad: "+capacidad+"Gb"+"\nvelocidad: "+velocidad+"GbHz"+"\nMarca: "+marca;
    }
    
    //-----------------------------------------------
    public String getMarca(){
        return this.marca;
    }
    public void setMarca(String marca){
        this.marca=marca;
    }
      //-----------------------------------------------
    public int getCapacidad(){
        return this.capacidad;
    }
    public void setCapacidad(int capacidad){
        this.capacidad=capacidad;
    }
    
      //-----------------------------------------------
    public int getVelocidad(){
        return this.velocidad;
    }
    public void setVelocidad(int velocidad){
        this.velocidad=velocidad;
    }
    
}
