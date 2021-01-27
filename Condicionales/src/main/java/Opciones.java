
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
public class Opciones {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Ingresa un numero");
        int numero=scanner.nextInt();
        System.out.println("Ingresa otro numero");
        int numerodos=scanner.nextInt();
        System.out.println("Opcion 1: suma\nOpcion 2: Resta");
        int opcion=scanner.nextInt();
        switch(opcion)
        {
            case 1:
                System.out.println(numero+numerodos);
            break;
            case 2:
                System.out.println(numero-numerodos);
            break;
            default:
                System.out.println("no existe esta opcion");
            break;
        }
    }
}