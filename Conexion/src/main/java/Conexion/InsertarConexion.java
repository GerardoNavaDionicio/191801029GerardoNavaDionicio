package Conexion;
import java.sql.*;

public class InsertarConexion { 
    private static final String URL="jdbc:mysql://localhost:33065/usuarios?zeroDateTimeBehavior=CONVERT_TO_NULL";
    private static final String USUARIO="root",PASS="";
    public static Connection getConnection()throws SQLException
    {
        return DriverManager.getConnection(URL,USUARIO,PASS);
    }
    
    
    public static void close(Connection conexion,ResultSet resultado,Statement declaracion )throws SQLException
    {
        conexion.close();
        resultado.close();
        declaracion.close();
    }  
}
