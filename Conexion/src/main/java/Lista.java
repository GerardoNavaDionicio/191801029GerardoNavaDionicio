
import java.sql.*;
import DaoUsuarios.*;
import Usuarios.*;
import java.util.*;
/**
 * @author GenadyThink
 */
public class Lista
{
    public static void main(String[] args) throws SQLException 
    {
        List <Usuarios> listaUsuarios = new ArrayList<>();
        listaUsuarios = DaoUsuarios.listaUsuarios();
        for(Usuarios usuario:listaUsuarios)
        {
            System.out.println(usuario);
        }
    }
}
/*crear conexion con base de datos
            Connection conexion=Conexion.getConnection();
            //crear una declaracion de como se va a trabajar en la base de datos
            Statement declaracion=conexion.createStatement();
            String SQL="SELECT * FROM usuarios";
            //Variable que recibirá el resultado de ejecutar la secuenta SQL
            ResultSet resultado=declaracion.executeQuery(SQL);
            //imprimir valores
            while(resultado.next())
            {   
                System.out.println("Nombre de Usuario: "+resultado.getString("nombre_usuario"));
                System.out.println("Contraseña: "+resultado.getString("contraseña"));
                System.out.println("ID: "+resultado.getString("id"));
                System.out.println("Estatus: "+resultado.getString("status"));
                System.out.println("-0-0-0-0-0-0-0-0-0-0-0");
            }
            //cerrar roda conexion con la BD
            Conexion.close(conexion, resultado, declaracion);*/