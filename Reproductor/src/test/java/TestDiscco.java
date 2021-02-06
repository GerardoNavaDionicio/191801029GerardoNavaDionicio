
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author GenadyThink
 */
public class TestDiscco {
    public static void main(String[] args) {
        ArrayList<Cancion> canciones = new ArrayList();
        Cancion cancion1 = new Cancion("Como una Novela", 1, 3.46);
        Cancion cancion2 = new Cancion("Contra el Dragon", 2, 3.48);
        Cancion cancion3 = new Cancion("Bidibidi Bom Bom", 3, 3.50);
        canciones.add(cancion1);
        canciones.add(cancion2);
        canciones.add(cancion3);
        
        String nombre="Las mas romanticas";
        Disco LosAcosta = new Disco("Nombre","Los acosta", 2005, canciones);
        System.out.println(LosAcosta);
    }
    
}
