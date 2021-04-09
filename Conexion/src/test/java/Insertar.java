import java.sql.*;
import java.util.Scanner;
import DaoUsuarios.DaoUsuarios;
import Usuarios.Usuario;

public class Insertar {
    public static void main(String[] args) throws SQLException {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nombre Usuario:");
        String usuario=scanner.nextLine();
        System.out.println("Contraseña:");
        String contraseña=scanner.nextLine();
        
        
        Usuario newUsuario= new Usuario(usuario, contraseña);        
        DaoUsuarios.insertar(newUsuario);
        
        
        System.out.println("!<!<!<!<!<!Usuario Registrado!>!>!>!>!>!");
        System.out.println("\t"+newUsuario); 
    }
}
/*
        String url="jdbc:mysql://localhost:33065/usuarios?zeroDateTimeBehavior=CONVERT_TO_NULL";
        try{
            //crear conexion con base de datos
            Connection conexion=DriverManager.getConnection(url,"root","");
            //crear una declaracion de como se va a trabajar en la base de datos
            String SQL="INSERT INTO usuarios(nombre_usuario,contraseña,status)VALUES(?,?,?)";
            PreparedStatement declaracion=conexion.prepareStatement(SQL);
            System.out.println("Nombre Usuario:");
            String usuario=scanner.nextLine();
            System.out.println("Contraseña:");
            String contraseña=scanner.nextLine();
            System.out.println("Estatus: ");
            int status=scanner.nextInt();
            declaracion.setString(1,usuario);
            declaracion.setString(2,contraseña);
            declaracion.setInt(3,status);
            
            //Variable que recibirá el resultado de ejecutar la secuenta SQL
            //ResultSet resultado=declaracion.executeQuery(SQL);
           declaracion.executeUpdate();
           
            
            declaracion.close();
            conexion.close();
            
            
        }catch(SQLException ex){
            ex.printStackTrace(System.out);
        }
    }*/
