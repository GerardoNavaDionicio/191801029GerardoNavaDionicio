
import DaoIluminacion.DaoIluminacion;
import Iluminacion.*;
import java.sql.*;
import java.util.*;

public class ActualizarIluminacion {
    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese La Nueva Marca");
        String marca = scanner.nextLine();
        System.out.println("Ingrese el nuevo Tipo");
        String tipo = scanner.nextLine();
        //scanner.nextLine();
        System.out.println("Ingrese el nuevo voltaje");
        int voltaje=scanner.nextInt(); 
        System.out.println("Ingrese el numero de Serie");
        int serie=scanner.nextInt(); 
        Iluminacion iluminacion = new Iluminacion(marca, tipo, voltaje, serie);
        DaoIluminacion.actualizar(iluminacion);
        System.out.println("Cambio Realizado con Éxito");
        
        
        
        /*int opcion;
        do{
            System.out.println("1- Cambiar Marca\n");
            System.out.println("2- Cambiar Tipo\n");
            System.out.println("3- Cambiar Voltaje\n");
            System.out.println("Opcion:\t");
            opcion = scanner.nextInt();
        }while(opcion < 1 && opcion > 3);
        switch (opcion) {
            case 1:
                {
                    System.out.println("Ingrese el numero de Serie");
                    int serie=scanner.nextInt(); 
                    scanner.nextLine();
                    System.out.println("Ingrese La Nueva Marca");
                    String marca = scanner.nextLine();
                    Iluminacion iluminacion = new Iluminacion(marca, serie);
                    DaoIluminacion.actualizar(iluminacion, opcion);
                    System.out.println("Cambio Realizado con Éxito");
                    break;
                }
            case 2:
                {
                    System.out.println("Ingrese el numero de Serie");
                    int serie=scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Ingrese el Nuevo Tipo");
                    String tipo = scanner.nextLine();
                    Iluminacion iluminacion = new Iluminacion(serie, tipo);
                    DaoIluminacion.actualizar(iluminacion, opcion);
                    System.out.println("Cambio Realizado con Éxito");
                    break;
                }
            case 3:
                {
                    System.out.println("Ingrese el Nuevo Voltaje");
                    int voltaje=scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Ingrese el numero de Serie");
                    int serie=scanner.nextInt();
                    scanner.nextLine();
                    Iluminacion iluminacion = new Iluminacion(serie, voltaje);
                    DaoIluminacion.actualizar(iluminacion, opcion);
                    System.out.println("Cambio Realizado con Éxito");
                    break;
                }
            default:
                System.out.println("No se puede");
                break;
        }*/
    }
}
