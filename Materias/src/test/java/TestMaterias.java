
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author GenadyThink
 */
public class TestMaterias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nombre de la materia:");
        String nombreMateria=scanner.nextLine();
        System.out.println("Nombre de la carrera");
        String carrera=scanner.nextLine();
        System.out.println("Codigo de la Materia");
        String codigoMateria=scanner.nextLine();
        System.out.println("Creditos de la materia");
        int creditos=scanner.nextInt();
        System.out.println("Cuatrimestre:\t");
        int cuatrimestre=scanner.nextInt();
        
        Materias calculo = new Materias("Calculo","Ing. Tics","0101", 160, 1);
        System.out.println(calculo);
        
        Materias dibujo = new Materias("Dibujo","Disenio Grafico","abc123",10, 4);
        System.out.println(dibujo);
        
        Materias matematicas =new Materias("Matematicas","Matematicas puras","MateFullHd4k", 12, 1);
        System.out.println(matematicas);
        
        
        Materias materias = new Materias(nombreMateria, carrera, codigoMateria, creditos, cuatrimestre);
        System.out.println(materias);
        
    }
}
