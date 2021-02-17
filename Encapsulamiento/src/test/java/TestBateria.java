
import Hardaware.Bateria;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author GenadyThink
 */
public class TestBateria {
    public static void main(String[] args) {
        /*instanciar es crear un objeto
        partes para instanciar un objeto
        (Clase + objeto = new Clase()*/
        Bateria bateriaCelular=new Bateria(100);
        System.out.println(bateriaCelular);
        bateriaCelular.setPorcentaje(99);
        System.out.println(bateriaCelular);
    }
}
