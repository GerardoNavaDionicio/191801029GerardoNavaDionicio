
import DaoIluminacion.DaoIluminacion;
import Iluminacion.Iluminacion;
import java.sql.SQLException;
import java.util.Scanner;

public class ActualizarIluminacion {
    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        int opcion;
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
                    int serie1=scanner.nextInt();
                    System.out.println("Ingrese La Nueva Marca");
                    String marca = scanner.nextLine();
                    scanner.nextLine();
                    Iluminacion iluminacion = new Iluminacion(marca, serie1);
                    DaoIluminacion.actualizar(iluminacion, opcion);
                    System.out.println("Cambio Realizado con Éxito");
                    break;
                }
            case 2:
                {
                    System.out.println("Ingrese el Nuevo Tipo");
                    String tipo = scanner.nextLine();
                    scanner.nextLine();
                    System.out.println("Ingrese el numero de Serie");
                    int serie2=scanner.nextInt();
                    scanner.nextLine();
                    Iluminacion iluminacion = new Iluminacion(serie2, tipo);
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
        }
    }
}
