/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import java.sql.*;
/**
 *
 * @author GenadyThink
 */
public class ConexionA {
    private static final String URL="jdbc:mysql://localhost:33065/ambiencce?zeroDateTimeBehavior=CONVERT_TO_NULL";
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
