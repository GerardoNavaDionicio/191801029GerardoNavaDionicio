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
public class Escenario {
    private String tipo;
    private boolean pista,washes,cabezasMoviles,dj,escenario;
    public  Escenario() {
    }
    public  Escenario(String tipo,boolean pista,boolean washes,boolean cabezasMoviles,boolean dj,boolean escenario) {
        this.cabezasMoviles=cabezasMoviles;
        this.dj=dj;
        this.escenario=escenario;
        this.pista=pista;
        this.tipo=tipo;
        this.washes=washes;
    }
    @Override
    public String toString() {
        return "\nTipo de Evento: "+tipo+"\nPista: "+pista+"\nWashes: "+washes+"\nCabezas Moviles: "+cabezasMoviles+"Dj: "+dj+"Escenario: "+escenario;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean getPista() {
        return pista;
    }

    public void setPista(boolean pista) {
        this.pista = pista;
    }

    public boolean getWashes() {
        return washes;
    }

    public void setWashes(boolean washes) {
        this.washes = washes;
    }

    public boolean getCabezasMoviles() {
        return cabezasMoviles;
    }

    public void setCabezasMoviles(boolean cabezasMoviles) {
        this.cabezasMoviles = cabezasMoviles;
    }

    public boolean getDj() {
        return dj;
    }

    public void setDj(boolean dj) {
        this.dj = dj;
    }

    public boolean getEscenario() {
        return escenario;
    }

    public void setEscenario(boolean escenario) {
        this.escenario = escenario;
    }
    
    
}
