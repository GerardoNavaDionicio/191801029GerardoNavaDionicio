
import DaoUsuarios.DaoUsuarios;
import Usuarios.Usuario;
import java.sql.*;
import java.util.Scanner;
/*
 * @author GenadyThink
 */
public class Actualizar {
    public static void main(String[] args) throws SQLException{
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do{
            System.out.println("1- Cambiar nombre de usuario");
            System.out.println("2- Cambiar contraseña");
            System.out.println("\tOpcion:");
            opcion = scanner.nextInt();
        }while(opcion < 1 && opcion > 2);
        
        if(opcion == 1){
            
            System.out.println("Ingrese el ID:");
            int id = scanner.nextInt();
            System.out.println("Ingrese el nombre:");
            scanner.nextLine();
            String nombreUsuario = scanner.nextLine();
            Usuario usuario = new Usuario(id, nombreUsuario);
            DaoUsuarios.actualizar(usuario, opcion);
        }
        else if(opcion == 2){
            
            System.out.println("Ingrese el ID:");
            int id = scanner.nextInt();
            System.out.println("Ingrese la contraseña:");
            scanner.nextLine();
            String contraseña = scanner.nextLine();
            Usuario usuario = new Usuario(contraseña, id);
            DaoUsuarios.actualizar(usuario, opcion);
            
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        /*String url="jdbc:mysql://localhost:33065/usuarios?zeroDateTimeBehavior=CONVERT_TO_NULL";
        try {
            Connection conexion=Conexion.getConnection();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Que Deseas Cambiar");
            System.out.println("1- Nombre del Usuario ");
            System.out.println("2- contraseña del Usuario ");
            System.out.println("Opcion:");
            int numeroAtributo = scanner.nextInt();
            System.out.println("Ingrese el ID al que se le aplicaran los Cambios:");
            int id = scanner.nextInt();
            switch (numeroAtributo)
            {
                case 1:
                    String SQL = "UPDATE usuarios SET nombre_usuario = ?, status = ? WHERE id = ?"; 
                    try (PreparedStatement declaracion = conexion.prepareStatement(SQL)) 
                    {
                        System.out.println("Ingrese el nombre:");
                        scanner.nextLine();
                        String nombreUsuario = scanner.nextLine();
                        declaracion.setString(1, nombreUsuario);
                        declaracion.setInt(3, id);
                        declaracion.setInt(2,1);
                        declaracion.executeUpdate();
                    }
                    System.out.println("[Cambio de Nombre Exitoso]");
                    break;
                case 2:
                    String SQL2 = "UPDATE usuarios SET contraseña = ?, status = ? WHERE id = ?"; 
                    try (PreparedStatement declaracion = conexion.prepareStatement(SQL2)) 
                    {
                        System.out.println("Ingrese la contraseña:");
                        scanner.nextLine();
                        String contraseña = scanner.nextLine();
                        declaracion.setString(1, contraseña);
                        declaracion.setInt(3, id);
                        declaracion.setInt(2,1);
                        declaracion.executeUpdate();
                    }   
                    System.out.println("[Cambio de Contraseña Exitoso]");
                    break;
            }
            conexion.close(); 
            }catch(SQLException ex)
            {
                ex.printStackTrace(System.out);
            }*/
    }
}
