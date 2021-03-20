import java.sql.*;
import java.util.Scanner;
/*
 * @author GenadyThink
 */
public class Actualizar {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String url="jdbc:mysql://localhost:33065/usuarios?zeroDateTimeBehavior=CONVERT_TO_NULL";
        //System.out.println("Que Quieres Hacer?\n\t1.-Cambiar ID\n\t2.-Cambiar Nombre de Uusuario\n\t3.-Cambiar contraseña\n\t4.-Cambiar Estatus");
        //int opcion=scanner.nextInt();
        
        
        try{
            Connection conexion = DriverManager.getConnection(url,"root","");
            String SQL = "UPDATE usuarios SET id=?"+ "WHERE id=?";
            PreparedStatement declaracion = conexion.prepareStatement(SQL);
            System.out.println("Que Id quieres actualizar?");
           String id = scanner.nextLine();
            System.out.println("Escribe el nuevo Id");
            String idChange = scanner.nextLine();
            declaracion.setString(1,idChange);
            declaracion.setString(2,id);
            declaracion.executeUpdate();
            declaracion.close();
            conexion.close();
        }catch(SQLException ex){
            ex.printStackTrace(System.out);
        }
        
        
       /*try{
            Connection conexion = DriverManager.getConnection(url,"root","");
            String SQL = "UPDATE usuarios SET nombre_usuario=?"+ "WHERE id=?";
            PreparedStatement declaracion = conexion.prepareStatement(SQL);
            System.out.println("Que Id quieres actualizar?");
            String id = scanner.nextLine();
            System.out.println("Escribe el nuevo nombre de usuario");
            String idChange = scanner.nextLine();
            declaracion.setString(1,idChange);
            declaracion.setString(2,id);
            declaracion.executeUpdate();
            declaracion.close();
            conexion.close();
        }catch(SQLException ex){
            ex.printStackTrace(System.out);
        }*/
       
        /*try{
            Connection conexion = DriverManager.getConnection(url,"root","");
            String SQL = "UPDATE usuarios SET contraseña=?"+ "WHERE id=?";
            PreparedStatement declaracion = conexion.prepareStatement(SQL);
            System.out.println("Que Id quieres actualizar?");
            String id = scanner.nextLine();
            System.out.println("Escribe la nueva contraseña");
            String idChange = scanner.nextLine();
            declaracion.setString(1,idChange);
            declaracion.setString(2,id);
            declaracion.executeUpdate();
            declaracion.close();
            conexion.close();
        }catch(SQLException ex){
            ex.printStackTrace(System.out);
        }*/
        
        
        /*try{
            Connection conexion = DriverManager.getConnection(url,"root","");
            String SQL = "UPDATE usuarios SET status=?"+ "WHERE id=?";
            PreparedStatement declaracion = conexion.prepareStatement(SQL);
            System.out.println("Que Id quieres actualizar?");
            String id = scanner.nextLine();
            System.out.println("Escribe el nuevo status");
            String idBoolean = scanner.nextLine();
            declaracion.setString(1,idBoolean);
            declaracion.setString(2,id);
            declaracion.executeUpdate();
            declaracion.close();
            conexion.close();
        }catch(SQLException ex){
            ex.printStackTrace(System.out);
        }*/
        
        
       
       
        
    }
}
