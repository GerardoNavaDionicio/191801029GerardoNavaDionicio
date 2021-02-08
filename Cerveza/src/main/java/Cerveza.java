/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author GenadyThink
 */
public class Cerveza {
    //Atributos
    public String color,transparencia,fermentacion,presentacion;
    public double contenido,graduacion,precio;
    //public int precio;
    
    //Metodos
    //Construcor vacio
    public Cerveza() {
    }
    //Constructor completo
    public Cerveza(String color,String transparencia,String fermentacion,String presentacion,double contenido,double graduacion,double precio){
        this.color=color;
        this.contenido=contenido;
        this.fermentacion=fermentacion;
        this.graduacion=graduacion;
        this.precio=precio;
        this.presentacion=presentacion;
        this.transparencia=transparencia;
    }
    //toString
    @Override
    public String toString() {
        return "\n\nColor: "+color+"\ncontenido: "+contenido+" Neto"+"\nFermentacion: "+fermentacion+"\nPorcentaje de Alcohol: "+graduacion+"\nPresentacion: "+presentacion+"\nPrecio: "+precio+"\nTransparencia: "+transparencia;
    }
}