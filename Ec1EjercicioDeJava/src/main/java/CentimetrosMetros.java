
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
public class CentimetrosMetros {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Ingresa el numero de Centimetros:");
        double centimetros=scanner.nextDouble();
        System.out.println("Sus centimetros "+" Son "+centimetros/100+ " Metros");
    }
    
}
