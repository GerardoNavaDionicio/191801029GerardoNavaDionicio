
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
public class ValorAbsoluto {
    public static void main(String[] args) {
        float numero;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un numero");
        numero=scanner.nextFloat();
        int valorAbsoluto=(int)Math.abs(numero);
        System.out.println("El valor absoluto de tu numero es: "+ valorAbsoluto);
    }
}
