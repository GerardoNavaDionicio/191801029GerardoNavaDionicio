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
public class Ingenieros extends Staff{
    private String opera,tipoIng;
    public  Ingenieros() {
        super();
    }
    public  Ingenieros(String nombre,char sexo,boolean maneja,String puesto,double sueldo,String opera,String tipoIng) {
        this.opera=opera;
        this.tipoIng=tipoIng;
    }
    @Override
    public String toString() {
        return "Opera: "+opera+"\nTipo de Ingeniero: "+tipoIng;
    }

    public String getOpera() {
        return opera;
    }

    public void setOpera(String opera) {
        this.opera = opera;
    }

    public String getTipoIng() {
        return tipoIng;
    }

    public void setTipoIng(String tipoIng) {
        this.tipoIng = tipoIng;
    }
}
