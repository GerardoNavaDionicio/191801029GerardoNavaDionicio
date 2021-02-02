import java.util.Scanner;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author GenadyThink
 */
public class Digitos {
    public static void main(String[] args) 
    {
        String numero;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa numero");
        numero=scanner.nextLine();
        System.out.println("EL numero  "+numero+"  tiene  "+numero.length()+"  Digitos");
    }
}