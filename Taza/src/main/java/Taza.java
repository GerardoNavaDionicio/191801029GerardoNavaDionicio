/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author GenadyThink
 */
public class Taza {
    //Atributos
    public String color,tamanio,modelo,material;
    public double precio;
    
    //Metodos
    //Constructores
    public Taza(String color,String tamanio,String modelo,String material,double precio){
        this.color = color;
        this.material = material;
        this.modelo = modelo;
        this.precio =  precio;
        this.tamanio = tamanio;
    }
    public Taza(){
        this.color = "";
        this.material = "";
        this.modelo = "";
        this.precio = 0;
        this.tamanio = "";
    }
     //Metodo toString
    @Override
    public String toString(){
        return "\nModelo de taza: " + modelo + "\nMaterial: " + material + "\nTamanio: " + tamanio + "\nColor: " + color + "\nPrecio: " + precio;
    }
}
