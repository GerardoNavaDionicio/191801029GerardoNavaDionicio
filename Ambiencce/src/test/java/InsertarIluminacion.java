
import DaoIluminacion.DaoIluminacion;
import Iluminacion.Iluminacion;
import java.sql.*;
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
public class InsertarIluminacion {
    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Marca:\t");
        String marca=scanner.nextLine();
        System.out.println("Tipo:\t");
        String tipo=scanner.nextLine();
        System.out.println("Voltaje:\t");
        int voltaje=scanner.nextInt();
        Iluminacion newIluminacion= new Iluminacion (marca, tipo,voltaje);        
        DaoIluminacion.insertar(newIluminacion);
        
        
        System.out.println("!<!<!<!<!<!Iluminacion Registrada!>!>!>!>!>!");
        System.out.println("\t"+newIluminacion); 
    }
}
