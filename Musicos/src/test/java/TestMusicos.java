/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author GenadyThink
 */
public class TestMusicos {
    public static void main(String[] args) {
        Musicos trompeta = new Musicos();
        trompeta.edad = 25;
        trompeta.estiloDeMusica = "jazz";
        trompeta.repertorio = "Alto";
        trompeta.sexo = "masculino";
        trompeta.instrumentosDominados = 5;
        trompeta.tipoDeInstrumento = "Viento";
        
        System.out.println(trompeta + "\n\n");
        
        
        Musicos bajo = new Musicos();
        bajo.edad = 28;
        bajo.estiloDeMusica = "Country";
        bajo.repertorio = "Bajo";
        bajo.sexo = "Femenino";
        bajo.instrumentosDominados = 2;
        bajo.tipoDeInstrumento = "Cuerda";        
        System.out.println(bajo + "\n\n");
       
        
        Musicos bateria = new Musicos();
        bateria.edad = 33;
        bateria.estiloDeMusica = "Rock";
        bateria.repertorio = "Medio";
        bateria.sexo = "Femenino";
        bateria.instrumentosDominados = 1;
        bateria.tipoDeInstrumento = "Golpe";        
        System.out.println(bateria + "\n\n");
    }
}
