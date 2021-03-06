/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuarios_X.Usuarios;

/**
 *
 * @author GenadyThink
 */
public class Usuario {
    private String nombre_usuario,fecha_alta,contrasenia;
    private int id;
    private boolean status;
    
    public  Usuario() {
    } 
    public  Usuario(String nombre_usuario,String fecha_alta,String contrasenia,int id,boolean status) {
        this.contrasenia=contrasenia;
        this.fecha_alta=fecha_alta;
        this.id=id;
        this.nombre_usuario=nombre_usuario;
        this.status=status;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public String getFecha_alta() {
        return fecha_alta;
    }

    public void setFecha_alta(String fecha_alta) {
        this.fecha_alta = fecha_alta;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
