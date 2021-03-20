import java.sql.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author GenadyThink
 */
public class Conexion2 {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:33065/usuarios?zeroDateTimeBehavior=CONVERT_TO_NULL";
        try{
            //crear conexion con base de datos
            Connection Conexion_2=DriverManager.getConnection(url,"root","");
            //crear una declaracion de como se va a trabajar en la base de datos
            Statement declaracion=Conexion_2.createStatement();
            String SQL="SELECT * FROM usuario_creditos";
            //Variable que recibirá el resultado de ejecutar la secuenta SQL
            ResultSet resultado_2=declaracion.executeQuery(SQL);
           
            //imprimir valores
            while(resultado_2.next())
            {   
                System.out.println("--------------------------------");
                System.out.println("ID Usuario:"+resultado_2.getString("usuario_id"));
                System.out.println("Numero de Creditos"+resultado_2.getString("creditos"));
                System.out.println("Cuatrimestre: "+resultado_2.getString("cuatrimestre"));
                System.out.println("Regular: "+resultado_2.getString("regular"));
                System.out.println("ID Materia: "+resultado_2.getString("id_materia"));
            }
            resultado_2.close();
            declaracion.close();
            Conexion_2.close();
            
        }catch(SQLException ex){
            ex.printStackTrace(System.out);
        }
    }
}
