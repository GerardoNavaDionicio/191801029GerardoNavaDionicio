/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author GenadyThink
 */
public class Musicos {
    //Atributos:
    public String repertorio,estiloDeMusica,sexo,tipoDeInstrumento;
    public int edad,instrumentosDominados;
    
    //metodos
    @Override
    public String toString(){
        return " Edad: " + edad + " anios" + "\n Sexo: " + sexo + "\n Estilo de musica: " + estiloDeMusica + "\n Instrumentos dominados: " + instrumentosDominados + "\n Repertorio: " + repertorio + "\n Instrumento tipo: " + tipoDeInstrumento;
        
    }
}
