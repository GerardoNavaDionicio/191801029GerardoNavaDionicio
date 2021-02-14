/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author GenadyThink
 */
public class Coche {
    public String marca,color;
    public int matricula;
    public double precio;
    public int numPuertas;
    
    public  Coche() {
    }
    public  Coche(String marca,String color,int matricula,int numPuertas,double precio) {
        this.numPuertas=numPuertas;
        this.color=color;
        this.marca=marca;
        this.matricula=matricula;
        this.precio=precio;
    }
    @Override
    public String toString() {
        return "\nMArca: "+marca+"\ncolor: "+color+"\nNumero de Puertas: "+numPuertas+"\nPrecio: "+precio+"\nMatricula: "+matricula;
    }
}

