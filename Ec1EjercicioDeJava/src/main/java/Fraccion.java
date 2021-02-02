
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
public class Fraccion {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Ingresa el numerador de la fraccion:");
        double numerador=scanner.nextDouble();
        System.out.println("Ingresa el numerador de la fraccion:");
        double denominador=scanner.nextDouble();
        System.out.println("Su valor decimal es:");
        System.out.println(numerador/denominador);
    }  
}
