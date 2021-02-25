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
public class Transporte {
    private String marca,color;
    private int ejes,peso,pasajeros;
    private boolean carga;
    public  Transporte() {
    }
    public Transporte(String marca,String color,int ejes, int peso,int pasajeros,boolean carga) {
        this.carga=carga;
        this.color=color;
        this.ejes=ejes;
        this.marca=marca;
        this.pasajeros=pasajeros;
        this.peso=peso;
    }
    @Override
    public String toString() {
        return "\narca: "+getMarca()+"\nColor: "+getColor()+"\nPasajeros: "+getPasajeros()+"\nEjes: "+getEjes()+"\nCarga: "+getCarga()+"\nPeso: "+getPeso();
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getEjes() {
        return ejes;
    }

    public void setEjes(int ejes) {
        this.ejes = ejes;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }

    public boolean getCarga() {
        return carga;
    }

    public void setCarga(boolean carga) {
        this.carga = carga;
    }
}
