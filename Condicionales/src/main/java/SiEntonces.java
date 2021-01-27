
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
public class SiEntonces {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Ingresa un numero");
        int numero=scanner.nextInt();
        if (numero<0)
            System.out.println("es negativo");
        else
            System.out.println("es positivo");
    }
}
