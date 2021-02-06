
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author GenadyThink
 */
public class Ak {

    //Atributos:
    public String material,disponibilidad;
    public int municion;
    public double velocidadDeDisparo,danio,precio;
    
    //metodos
    @Override
    public String toString(){
        return "El material del arma es:"+ material + "\ncon una disponibilidad:" + disponibilidad + "\ncon una municion de:" + municion + "\ncon una velocidad de disparo:" + velocidadDeDisparo + "\ncon un Danio de:" + danio + "\ny con un precio de:" + precio;
        
    }
}
