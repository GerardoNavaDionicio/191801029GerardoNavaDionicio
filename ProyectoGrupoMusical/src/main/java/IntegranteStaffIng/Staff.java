/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IntegranteStaffIng;

/**
 *
 * @author GenadyThink
 */
public class Staff extends Musico{
    private boolean maneja;
    private String puesto;
    private double sueldo;
    public  Staff() {
        super();
    }
    public  Staff(String nombre,char sexo,boolean maneja,String puesto,double sueldo) {
        this.maneja=maneja;
        this.puesto=puesto;
        this.sueldo=sueldo;
    }
    @Override
    public String toString() {
        return "\nManeja: "+maneja+"\nPuesto: "+puesto+"\nSueldo: "+sueldo; 
    }

    public boolean getManeja() {
        return maneja;
    }

    public void setManeja(boolean maneja) {
        this.maneja = maneja;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
    
}
