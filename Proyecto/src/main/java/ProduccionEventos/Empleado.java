/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProduccionEventos;

/**
 *
 * @author GenadyThink
 */
public class Empleado {
    private String nombre,puesto;
    private int edad;
    private boolean maneja;
    
    public Empleado() {
    }
    public  Empleado(String nombre,String puesto,int edad, boolean maneja) {
        this.edad=edad;
        this.maneja=maneja;
        this.nombre=nombre;
        this.puesto=puesto;
    }
    @Override
    public String toString() {
        return "\nNombre: "+getNombre()+"\nEdad: "+getEdad()+"\nPuesto: "+getPuesto()+"\nManeja: "+getManeja();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean getManeja() {
        return maneja;
    }

    public void setManeja(boolean maneja) {
        this.maneja = maneja;
    }
    
}
