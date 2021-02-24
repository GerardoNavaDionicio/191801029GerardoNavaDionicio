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
public class Musico {
    private String instrumento,tipoInstrumento,nombre;
    private char sexo;
    private int instrumentosDominados;
    private boolean repertorioAmplio;
    
    
    public Musico() {
    }
    public  Musico(String nombre,String instrumento,String tipoInstrumento,char sexo,int instrumentosDominados,boolean repertorioAmplio) {
        this.nombre=nombre;
        this.instrumento=instrumento;
        this.instrumentosDominados=instrumentosDominados;
        this.repertorioAmplio=repertorioAmplio;
        this.sexo=sexo;
        this.tipoInstrumento=tipoInstrumento;
        
    }
    @Override
    public String toString() {
        return "Nombre:"+getNombre()+"Sexo: "+getSexo()+"Instrumento: "+getInstrumento()+"Tipo de Instrumento: "+"Instrumentos Dominados: "+getInstrumentosDominados()+"Repertorio Amplio: "+repertorioAmplio;
    }

    public String getInstrumento() {
        return instrumento;
    }

    public void setInstrumento(String instrumento) {
        this.instrumento = instrumento;
    }

    public String getTipoInstrumento() {
        return tipoInstrumento;
    }

    public void setTipoInstrumento(String tipoInstrumento) {
        this.tipoInstrumento = tipoInstrumento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getInstrumentosDominados() {
        return instrumentosDominados;
    }

    public void setInstrumentosDominados(int instrumentosDominados) {
        this.instrumentosDominados = instrumentosDominados;
    }

    public boolean getRepertorioAmplio() {
        return repertorioAmplio;
    }

    public void setRepertorioAmplio(boolean repertorioAmplio) {
        this.repertorioAmplio = repertorioAmplio;
    }
}
