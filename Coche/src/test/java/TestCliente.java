
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author GenadyThink
 */
public class TestCliente {
    public static void main(String[] args) {
        Coche chevy = new Coche("Chevy","Rojo", 101010, 5, 150000.90);
        Clientes juan=new Clientes(111111, 12344, 35, "Juan", chevy);
        System.out.println(juan);
        
    }
}
