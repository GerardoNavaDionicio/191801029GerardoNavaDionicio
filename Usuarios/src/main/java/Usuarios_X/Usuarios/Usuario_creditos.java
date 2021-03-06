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
public class Usuario_creditos {
    private String id_materia;
    private int id_usuario,cuatrimestre,creditos;
    private boolean regular;
    
    public  Usuario_creditos() {
    }
    public  Usuario_creditos(String id_materia,int id_usuario,int cuatrimestre,int creditos) {
        this.creditos=creditos;
        this.cuatrimestre=cuatrimestre;
        this.id_materia=id_materia;
        this.id_usuario=id_usuario;
        this.regular=regular;
    }

    public String getId_materia() {
        return id_materia;
    }

    public void setId_materia(String id_materia) {
        this.id_materia = id_materia;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public int getCuatrimestre() {
        return cuatrimestre;
    }

    public void setCuatrimestre(int cuatrimestre) {
        this.cuatrimestre = cuatrimestre;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public boolean isRegular() {
        return regular;
    }

    public void setRegular(boolean regular) {
        this.regular = regular;
    }
    
    
    
    
    
}
