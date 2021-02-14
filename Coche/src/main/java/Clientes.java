/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author GenadyThink
 */
public class Clientes {
    public int dni,telefono;
    public String nombre;
    public int edad;
    public Coche coche;
    
    public Clientes(){
    }
    public  Clientes(int dni,int telefono,int edad,String nombre,Coche coche) {
        this.dni=dni;
        this.edad=edad;
        this.nombre=nombre;
        this.telefono=telefono;
        this.coche=coche;
    }
    @Override
    public String toString() {
        return "\nNombre: "+nombre+"\nEdad: "+edad+"\nTelefono: "+telefono+"\nDni: "+dni+"Coche: "+coche; 
    }
}
