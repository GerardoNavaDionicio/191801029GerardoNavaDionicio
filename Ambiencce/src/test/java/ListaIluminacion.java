
import DaoIluminacion.DaoIluminacion;
import Iluminacion.Iluminacion;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ListaIluminacion {
    public static void main(String[] args) throws SQLException {
        List <Iluminacion> listaIluminacion = new ArrayList<>();
            listaIluminacion = DaoIluminacion.listaIluminacion();
        for(Iluminacion iluminacion:listaIluminacion)
        {
            System.out.println(iluminacion);
        }
    }
}
