
import DaoIluminacion.DaoIluminacion;
import Iluminacion.Iluminacion;
import java.sql.SQLException;
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
public class EliminarIluminacion {
    public static void main(String[] args) throws SQLException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese la Serie de la Iluminacion");
        int serie = scan.nextInt();
        Iluminacion iluminacion= new Iluminacion(serie);
        DaoIluminacion.eliminar(iluminacion);
        System.out.println("\t FINISH HIM");
    }
}
