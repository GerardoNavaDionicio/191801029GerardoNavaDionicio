/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author GenadyThink
 */
public class TestTaza {
    public static void main(String[] args) {
        
        Taza TazaRoja = new Taza();
        TazaRoja.modelo = "Navidenio_2020";
        TazaRoja.color = "Roja";
        TazaRoja.material = "Plastico";
        TazaRoja.tamanio = "Mediana";
        TazaRoja.precio = 350.90;
        System.out.println(TazaRoja + "\n\n");
        
        Taza TazaNaranja = new Taza("Naranja","Grande","Industrial","Plata", 119.50);
        System.out.println(TazaNaranja + "\n\n");
        
        
    }
}
