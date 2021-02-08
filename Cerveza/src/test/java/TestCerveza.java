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
public class TestCerveza {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cerveza Indio = new Cerveza("Obscura","No","Lager","Caguama" ,940,10.5,35.99);
        System.out.println(Indio+"\n\n");
        Cerveza XX=new Cerveza("Clara","Si","Ale","Botella",210,4.5,19.42);
        System.out.println(XX+"\n\n");
        Cerveza Corona = new Cerveza("Clara","Si","Lager","Ampolleta",125,5.1,25.12);
        System.out.println(Corona);
        Cerveza Victoria=new Cerveza("Oscura","No","Ale", "Lata", 335,4.0,20.50);
        System.out.println(Victoria);
        
        System.out.println("\n\nColor de la Cerveza: ");
        String color=scanner.nextLine();
        System.out.println("Tiene Transparencia?: ");
        String transparencia=scanner.nextLine();
        System.out.println("Tipo de Fermentacion: ");
        String fermentacion=scanner.nextLine();
        System.out.println("Presentacion: ");
        String presentacion=scanner.nextLine();
        System.out.println("Contenidoo Neto: ");
        Double contenido=scanner.nextDouble();
        System.out.println("Grado de alcohol: ");
        Double graduacion=scanner.nextDouble();
        System.out.println("Precio");
        Double precio=scanner.nextDouble();
        Cerveza cerveza=new Cerveza(color, transparencia, fermentacion, presentacion, 0, 0, precio);
        System.out.println(cerveza);
    }
}
