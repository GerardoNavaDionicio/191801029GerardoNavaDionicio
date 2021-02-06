/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author GenadyThink
 */
public class Materias {
    //Atributos
    public String nombreMateria,carrera,codigoMateria;
    public int creditos,cuatrimestre;
    
    //Metodos
    //constructor completo
    public Materias(String nombreMateria,String carrera,String codigoMateria,int creditos,int cuatrimestre){
        this.carrera=carrera;
        this.codigoMateria=codigoMateria;
        this.creditos=creditos;
        this.cuatrimestre=cuatrimestre;
        this.nombreMateria=nombreMateria;
    }
    //Constructor vacio
    public Materias(){
    }
    @Override
    public String toString(){
        return "\n\nMateria: "+nombreMateria+"\nCodigo de Materia: "+codigoMateria+"\nCreditos: "+creditos+"\nCarrera: "+carrera+"\ncuatrimestre: "+cuatrimestre;
    }
}
