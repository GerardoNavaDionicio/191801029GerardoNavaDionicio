/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Empleado;

/**
 *
 * @author GenadyThink
 */
public class Empleado {
    private String apellidoPaterno,apellidoMaterno,nombre;
    private int dni;
    
    public  Empleado() {
    }
    public  Empleado(String apellidoPaterno,String apellidoMaterno,String nombre,int dni) {
        this.apellidoMaterno=apellidoMaterno;
        this.apellidoPaterno=apellidoPaterno;
        this.dni=dni;
        this.nombre=nombre;
    }
    @Override
    public String toString() {
        return "Nombre: "+nombre+"\nApellido Paterno: "+apellidoPaterno+"\nApellido Materno: "+apellidoMaterno+"\nDNI: "+dni;
    }
    //------------------------------------------------------
    public String getApellidoPaterno() {
        return apellidoPaterno;
    }
    
    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }
    //------------------------------------------------------
    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }
    //------------------------------------------------------
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    //------------------------------------------------------
    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }
    //------------------------------------------------------
}