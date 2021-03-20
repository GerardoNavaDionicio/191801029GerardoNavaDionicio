
package Conexion;
import java.sql.*;
/* @author GenadyThink*/
public class Conexion {
    //static es una palabra reservada que determina que el atributo es de la clase y no del objeto 
    //final es un modificador que indica que el atributo es una constante, por lo que no se le podra cambiar el valor de ningun modo
    private static final String URL="jdbc:mysql://localhost:33065/usuarios?zeroDateTimeBehavior=CONVERT_TO_NULL";
    private static final String USUARIO="root",PASS="";
   
    public static Connection getConnection()throws SQLException{
        //throws es el try y catch implementado en un método
        return DriverManager.getConnection(URL,USUARIO,PASS);
    }
    //polimorfismo
    public static void close(Connection conexion)throws SQLException{
        conexion.close();
    } 
    //polimorfismo
    public static void close(Connection conexion,Statement declaracion )throws SQLException{
        conexion.close();
        declaracion.close();
    } 
    //polimorfismo
    public static void close(Connection conexion,ResultSet resultado,Statement declaracion )throws SQLException{
        conexion.close();
        resultado.close();
        declaracion.close();
    }  
}