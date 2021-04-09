/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DaoUsuarios;
import Conexion.Conexion;
import Usuarios.Usuario;
import java.sql.*;
import java.util.*;

public class DaoUsuarios {
    private static String SQL;
    
    
    public static List<Usuario> listaUsuarios() throws SQLException{
        List <Usuario> listaUsuarios = new ArrayList<>();
        Connection conexion=Conexion.getConnection();
        Statement declaracion = conexion.createStatement();
        SQL="SELECT * FROM usuarios";
        ResultSet resultado = declaracion.executeQuery(SQL);
        while(resultado.next())
        {
           Usuario usuario = new Usuario(resultado.getString("nombre_usuario"),resultado.getString("fecha_alta"),resultado.getString("contraseña"),resultado.getInt("id"),resultado.getBoolean("status"));
           listaUsuarios.add(usuario);
        }
        Conexion.close(conexion, resultado, declaracion);
        return listaUsuarios;
    }
    
    
    
    
    
    
    
    public static void insertar(Usuario usuario) throws SQLException{
        Connection conexion = Conexion.getConnection();
        SQL = "INSERT INTO usuarios(nombre_usuario,contraseña,status) VALUES(?,?,?)";
        PreparedStatement declaracion = conexion.prepareStatement(SQL); 
        
        declaracion.setString(1,usuario.getNombre_usuario());
        declaracion.setString(2,usuario.getContrasenia());
        declaracion.setInt(3,1);
        
        declaracion.executeUpdate();
        Conexion.close(conexion, declaracion);
    }
    
    
    
    
    
    
    
    public static void eliminar(Usuario usuario)throws SQLException{
        Connection conexion = Conexion.getConnection();
        SQL = "DELETE FROM usuarios WHERE id=?";
        PreparedStatement declaracion = conexion.prepareStatement(SQL);
        declaracion.setInt(1, usuario.getId());
        declaracion.executeUpdate();
        Conexion.close(conexion, declaracion);
    }
    
    public static void actualizar(Usuario usuario, int opcion) throws SQLException{
        
        Connection conexion = Conexion.getConnection();
        
        if(opcion == 1){
            String SQL = "UPDATE usuarios SET nombre_usuario = ? WHERE id = ?";
            PreparedStatement declaracion = conexion.prepareStatement(SQL);
            declaracion.setString(1, usuario.getNombre_usuario());
            declaracion.setInt(2, usuario.getId());
                
            declaracion.executeUpdate();
            Conexion.close(conexion, declaracion);
        }
        else if(opcion == 2){
            String SQL = "UPDATE usuarios SET contraseña = ? WHERE id = ?";
            PreparedStatement declaracion = conexion.prepareStatement(SQL);
            declaracion.setString(1, usuario.getContrasenia());
            declaracion.setInt(2, usuario.getId());
                
            declaracion.executeUpdate();
            Conexion.close(conexion, declaracion);
        }
    }
    
    
}
