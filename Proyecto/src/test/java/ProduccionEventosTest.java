
import ProduccionEventos.Empleado;
import ProduccionEventos.Escenario;
import ProduccionEventos.Transporte;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author GenadyThink
 */
public class ProduccionEventosTest {
    public static void main(String[] args) {
        Empleado empleado1=new Empleado();
        empleado1.setPuesto("Encargado");
        empleado1.setEdad(23);
        empleado1.setManeja(true);
        empleado1.setNombre("Gerardo");
        System.out.println("Nombre del Empleado: "+empleado1.getNombre());
        System.out.println("Edad: "+empleado1.getEdad());
        System.out.println("Puesto: "+empleado1.getPuesto());
        System.out.println("Maneja: "+empleado1.getManeja());
        System.out.println("\n\n");
        //--------------------------------
        Escenario escenario0=new Escenario();
        escenario0.setTipo("Dj");
        escenario0.setDj(true);
        escenario0.setEscenario(false);
        escenario0.setPista(true);
        escenario0.setWashes(false);
        escenario0.setCabezasMoviles(true);
        System.out.println("Tipo de Escenario: "+escenario0.getTipo());
        System.out.println("Dj: "+escenario0.getDj());
        System.out.println("Tarima: "+escenario0.getEscenario());
        System.out.println("Pista: "+escenario0.getPista());
        System.out.println("Washes: "+escenario0.getWashes());
        System.out.println("Beans: "+escenario0.getCabezasMoviles());
        //--------------------------------
        System.out.println("\n\n");
        Transporte transporte0=new Transporte();
        transporte0.setMarca("RAM");
        transporte0.setCarga(true);
        transporte0.setColor("Rojo");
        transporte0.setEjes(4);
        transporte0.setPasajeros(4);
        transporte0.setPeso(4000);
        
        System.out.println("Color: "+transporte0.getColor());
        System.out.println("Numero de ejes: "+transporte0.getEjes());
        System.out.println("Marca: "+transporte0.getMarca());
        System.out.println("Numero de pasajeros: "+transporte0.getPasajeros());
        System.out.println("Peso en kilos soportado: "+transporte0.getPeso());
        System.out.println("Es de carga: "+transporte0.getCarga());
        
        
        
        
        
        
        
        
        
        
        
    }
}
