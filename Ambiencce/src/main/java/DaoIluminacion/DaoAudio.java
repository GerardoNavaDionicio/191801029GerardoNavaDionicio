/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DaoIluminacion;

import Audio.Audio;
import Conexion.ConexionA;
import Iluminacion.Iluminacion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author GenadyThink
 */
public class DaoAudio {
    private static String SQL;
    public static List<Audio> listaAudio() throws SQLException{
        List <Audio> listaAudio = new ArrayList<>();
        Connection conexion=ConexionA.getConnection();
        Statement declaracion = conexion.createStatement();
        SQL="SELECT * FROM audio";
        ResultSet resultado = declaracion.executeQuery(SQL);
        while(resultado.next())
        {
           Audio audio = new Audio(resultado.getString("marca"),resultado.getString("tipo"),resultado.getBoolean("disponible"),resultado.getBoolean("amplificado"),resultado.getInt("voltaje"),resultado.getInt("modelo"));
           listaAudio.add(audio);
        }
        ConexionA.close(conexion, resultado, declaracion);
        return listaAudio;
    }
    //insertar
    public static void insertar(Audio audio) throws SQLException{
        Connection conexion = ConexionA.getConnection();
        SQL = "INSERT INTO audio(marca,tipo,amplificado,disponible,voltaje) VALUES(?,?,?,?,?)";
        PreparedStatement declaracion = conexion.prepareStatement(SQL); 
        
        declaracion.setString(1,audio.getMarca());
        declaracion.setString(2,audio.getTipo());
        declaracion.setInt(3,1);
        declaracion.setInt(4,1);
        declaracion.setInt(5,audio.getVoltaje());
        declaracion.executeUpdate();
        ConexionA.close(conexion, declaracion);
    }
    public static void actualizar(Audio audio, int opcion) throws SQLException{
        
        Connection conexion = ConexionA.getConnection();
        //private String SQL;
        switch (opcion) {
            case 1:
                {
                    SQL = "UPDATE audio SET marca = ? WHERE modelo = ?";
                    PreparedStatement declaracion = conexion.prepareStatement(SQL);
                    declaracion.setString(1, audio.getMarca());
                    declaracion.setInt(2,audio.getModelo());
                    declaracion.executeUpdate();
                    ConexionA.close(conexion, declaracion);
                    break;
                }
            case 2:
                {
                    SQL = "UPDATE audio SET tipo = ? WHERE modelo = ?";
                    PreparedStatement declaracion = conexion.prepareStatement(SQL);
                    declaracion.setString(1, audio.getTipo());
                    declaracion.setInt(2, audio.getModelo());
                    declaracion.executeUpdate();
                    ConexionA.close(conexion, declaracion);
                    break;
                }
            case 3:
                {
                    SQL = "UPDATE audio SET voltaje = ? WHERE modelo = ?";
                    PreparedStatement declaracion = conexion.prepareStatement(SQL);
                    declaracion.setInt(1, audio.getVoltaje());
                    declaracion.setInt(2, audio.getModelo());
                    declaracion.executeUpdate();
                    ConexionA.close(conexion, declaracion);
                    break;
                }
            default:
                break;
        }
    }
    
    
    
    
    
    
    
    
    
    
}
