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
public class Promedio {
    public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            System.out.println("Dame el promedio numero 1");
            double promedioUno=scanner.nextDouble();
            System.out.println("Dame el promedio numero 2");
            double promedioDos=scanner.nextDouble();
            System.out.println("Dame el promedio numero 3");
            double promedioTres=scanner.nextDouble();
            String nombre=scanner.nextLine();
            System.out.println("El promedio es:");
            System.out.println((promedioUno+promedioDos+promedioTres)/3);
            
    }
    
}