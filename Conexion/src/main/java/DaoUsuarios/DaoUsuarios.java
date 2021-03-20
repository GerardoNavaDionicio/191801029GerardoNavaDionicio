/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DaoUsuarios;
import Conexion.Conexion;
import Usuarios.Usuarios;
import java.sql.*;
import java.util.*;

/**
 *
 * @author GenadyThink
 */
public class DaoUsuarios {
    private static String SQL;
    
    
    public static List<Usuarios> listaUsuarios() throws SQLException{
        List <Usuarios> listaUsuarios = new ArrayList<>();
        Connection conexion=Conexion.getConnection();
        Statement declaracion = conexion.createStatement();
        SQL = "SELECT * FROM usuario";
        ResultSet resultado = declaracion.executeQuery(SQL);
        while(resultado.next()){
           Usuarios usuario=new Usuarios(resultado.getString("nombre_usuario"),resultado.getString("fecha_alta"),resultado.getString("contraseña"),resultado.getInt("id"),resultado.getBoolean("status"));
           listaUsuarios.add(usuario);
        }
        Conexion.close(conexion, resultado, declaracion);
        return listaUsuarios;
    }
    
    
    
    
    
    
    
    public static void insertar(Usuarios usuario) throws SQLException{
        Connection conexion=Conexion.getConnection();
        SQL="INSERT INTO usuarios(nombre_usuario,contraseña,status)VALUES(?,?,?)";
        PreparedStatement declaracion=conexion.prepareStatement(SQL);
        declaracion.setString(1,usuario.getNombre_usuario());
        declaracion.setString(2,usuario.getContrasenia());
        declaracion.setString(3,usuario.getFecha_alta());
        declaracion.executeUpdate();
        Conexion.close(conexion, declaracion);
    }
    
    public static void eliminar(Usuarios usuario)throws SQLException{
        Connection conexion=Conexion.getConnection();
        SQL="DELETE FROM usuarios WHERE id=?";
        PreparedStatement declaracion = conexion.prepareStatement(SQL); 
        //declaracion.setString(1,usuario.getId());
        declaracion.executeUpdate();
        Conexion.close(conexion, declaracion);
    }
}
