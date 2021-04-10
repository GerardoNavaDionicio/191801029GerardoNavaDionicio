/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Audio;

/**
 *
 * @author GenadyThink
 */
public class Audio {
    private String marca,tipo;
    private int modelo,voltaje;
    private boolean disponible,amplificado;
    
    public  Audio() {
    }
    public  Audio(String marca, String tipo, boolean disponible, boolean amplificado,int modelo,int voltaje) {
        this.amplificado=amplificado;
        this.disponible=disponible;
        this.marca=marca;
        this.modelo=modelo;
        this.tipo=tipo;
        this.voltaje=voltaje;
    }
    @Override
    public String toString() {
        return "\nMarca\t" + getMarca() + "\ntipo\t" + getTipo() + "\nmodelo\t" + getModelo() + "\nvoltaje\t" + getVoltaje() + "\namplificado\t" + isAmplificado() + "\ndisponible\t" + isDisponible();
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public int getVoltaje() {
        return voltaje;
    }

    public void setVoltaje(int voltaje) {
        this.voltaje = voltaje;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public boolean isAmplificado() {
        return amplificado;
    }

    public void setAmplificado(boolean amplificado) {
        this.amplificado = amplificado;
    }
    public  Audio(String tipo, int modelo) {
        this.tipo=tipo;
        this.modelo=modelo;
    }
    public  Audio(int modelo,String marca) {
        this.marca=marca;
        this.modelo=modelo;
    }
    public  Audio(int voltaje, int modelo) {
        this.voltaje=voltaje;
        this.modelo=modelo;
    }
    
}
