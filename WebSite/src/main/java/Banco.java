/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author GenadyThink
 */
public class Banco {
    private int idPago,importe;
    private String tipoTarjeta;
    private boolean realizado;
    
    
    
    public  Banco() {
    }
    public  Banco(int idPago,int importe,String tipoTarjeta,boolean realizado) {
        this.idPago=idPago;
        this.importe=importe;
        this.realizado=realizado;
        this.tipoTarjeta=tipoTarjeta;
    }
    @Override
    public String toString() {
        return "\nid pago"+ getIdPago()+"\nimporte"+getImporte()+"\nTipo de tarjeta"+getTipoTarjeta()+"\nRealizado"+isRealizado();
    }

    public int getIdPago() {
        return idPago;
    }

    public void setIdPago(int idPago) {
        this.idPago = idPago;
    }

    public int getImporte() {
        return importe;
    }

    public void setImporte(int importe) {
        this.importe = importe;
    }

    public String getTipoTarjeta() {
        return tipoTarjeta;
    }

    public void setTipoTarjeta(String tipoTarjeta) {
        this.tipoTarjeta = tipoTarjeta;
    }

    public boolean isRealizado() {
        return realizado;
    }

    public void setRealizado(boolean realizado) {
        this.realizado = realizado;
    }
    
}
