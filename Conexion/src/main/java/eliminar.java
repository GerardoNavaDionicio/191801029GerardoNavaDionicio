
import Usuarios.Usuarios;
import java.sql.*;
import java.util.Scanner;
import DaoUsuarios.DaoUsuarios;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author GenadyThink
 */
public class eliminar {
    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Que usuario quieres Eliminar?:\t");
        String idDelete=scanner.nextLine();
        Usuarios usuario = new Usuarios(0);
        DaoUsuarios.eliminar(usuario);
        
        
        
        
        
        
        
        
        
        
        
        
        /*String url="jdbc:mysql://localhost:33065/usuarios?zeroDateTimeBehavior=CONVERT_TO_NULL";
        try{
            Scanner scanner=new Scanner(System.in);
            Connection conexion=DriverManager.getConnection(url,"root","");
            String SQL="DELETE FROM usuarios WHERE id=?";
            PreparedStatement declaracion = conexion.prepareStatement(SQL); 
            //Eliminar datos
            Scanner scan = new Scanner(System.in);
            System.out.println("Que usuario quieres Eliminar?:\t");
            String idDelete = scan.nextLine();
            declaracion.setString(1, idDelete);
            declaracion.executeUpdate();
            //Cerrar toda conexion con la base de datos
            declaracion.close();
            conexion.close();
        }catch(SQLException ex){
            ex.printStackTrace(System.out);
        }*/
        
        
        
    }
}
