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
public class Tacos {
    public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            System.out.println("Taqueria Doña Pelos");
            System.out.println("Cuantos tacos consumiste?");
            int tacos=scanner.nextInt();
            System.out.println("Cuantos Refrescos Tomaste?");
            int refrescos=scanner.nextInt();
            System.out.println("Su pago es de:");
            System.out.println((tacos*17)+(refrescos*10));
            
    }
    
}
