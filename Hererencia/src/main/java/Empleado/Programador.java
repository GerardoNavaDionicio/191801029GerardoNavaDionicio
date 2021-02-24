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
public class Programador extends Empleado{
    private int sueldo;
    public  Programador() {
        super();
    }
    public  Programador(String apellidoPaterno,String apellidoMaterno,String nombre,int dni,int sueldo) {
        super(apellidoPaterno, apellidoMaterno, nombre, dni);
        this.sueldo=sueldo;
    }
    @Override
    public String toString() {
        return "Sueldo Programador: "+sueldo;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }
    
}
