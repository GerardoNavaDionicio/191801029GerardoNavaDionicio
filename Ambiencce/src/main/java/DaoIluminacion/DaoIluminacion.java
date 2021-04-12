/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DaoIluminacion;

import Conexion.ConexionA;
import Iluminacion.Iluminacion;
import java.util.*;
import java.sql.*;

/**
 *
 * @author GenadyThink
 */
public class DaoIluminacion {
    private static String SQL;
    public static List<Iluminacion> listaIluminacion() throws SQLException{
        List <Iluminacion> listaIluminacion = new ArrayList<>();
        Connection conexion=ConexionA.getConnection();
        Statement declaracion = conexion.createStatement();
        SQL="SELECT * FROM iluminacion";
        ResultSet resultado = declaracion.executeQuery(SQL);
        while(resultado.next())
        {
           Iluminacion iluminacion = new Iluminacion(resultado.getString("marca"),resultado.getString("tipo"),resultado.getBoolean("disponible"),resultado.getBoolean("dmx"),resultado.getInt("voltaje"),resultado.getInt("serie"));
           listaIluminacion.add(iluminacion);
        }
        ConexionA.close(conexion, resultado, declaracion);
        return listaIluminacion;
    }
    //insertar
    public static void insertar(Iluminacion iluminacion) throws SQLException{
        Connection conexion = ConexionA.getConnection();
        SQL = "INSERT INTO iluminacion(marca,tipo,dmx,disponible,voltaje) VALUES(?,?,?,?,?)";
        PreparedStatement declaracion = conexion.prepareStatement(SQL); 
        
        declaracion.setString(1,iluminacion.getMarca());
        declaracion.setString(2,iluminacion.getTipo());
        declaracion.setInt(3,1);
        declaracion.setInt(4,1);
        declaracion.setInt(5,iluminacion.getVoltaje());
        declaracion.executeUpdate();
        ConexionA.close(conexion, declaracion);
    }
    //eliminar
    public static void eliminar(Iluminacion iluminacion)throws SQLException{
        Connection conexion = ConexionA.getConnection();
        SQL = "DELETE FROM iluminacion WHERE serie=?";
        PreparedStatement declaracion = conexion.prepareStatement(SQL);
        declaracion.setInt(1,iluminacion.getSerie());
        declaracion.executeUpdate();
        ConexionA.close(conexion, declaracion);
    }
    //actualizar
    public static void actualizar(Iluminacion iluminacion) throws SQLException{
        
        Connection conexion = ConexionA.getConnection();
        SQL = "UPDATE iluminacion SET marca = ?,tipo = ? ,voltaje = ? WHERE serie = ?";
                    PreparedStatement declaracion = conexion.prepareStatement(SQL);
                    declaracion.setString(1, iluminacion.getMarca());
                    declaracion.setString(2, iluminacion.getTipo());
                    declaracion.setInt(3, iluminacion.getVoltaje());
                    declaracion.setInt(4, iluminacion.getSerie());
                    declaracion.executeUpdate();
                    ConexionA.close(conexion, declaracion);
    }
    
    
    
    
    
    
    
    
    
    
}
