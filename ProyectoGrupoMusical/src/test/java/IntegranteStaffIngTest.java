/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import IntegranteStaffIng.Musico;
import IntegranteStaffIng.Staff;
import IntegranteStaffIng.Ingenieros;
/**
 *
 * @author GenadyThink
 */
public class IntegranteStaffIngTest {
    public static void main(String[] args) {
        Musico musico=new Musico();
        
        musico.setNombre("Juan");
        musico.setSexo('M');
        musico.setInstrumento("Bateria");
        musico.setTipoInstrumento("Golpe");
        musico.setInstrumentosDominados(2);
        musico.setRepertorioAmplio(true);
        System.out.println("------------MUSICO----------------\n");
        System.out.println("Nombre del musico: "+musico.getNombre());
        System.out.println("Sexo: "+musico.getSexo());
        System.out.println("Instrumento: "+musico.getInstrumento());
        System.out.println("Tipo de Instrumento de: "+musico.getTipoInstrumento());
        System.out.println("Instrumentos Dominados: "+musico.getInstrumentosDominados());
        System.out.println("Repertorio Amplio: "+musico.getRepertorioAmplio());
        
        //---------------------------------------------------------------------
        Staff staff=new Staff();
        staff.setNombre("Pedro");
        staff.setManeja(false);
        staff.setPuesto("Encargado");
        staff.setSueldo(700);
        staff.setSexo('M');
        System.out.println("-----------STAFF-----------------\n");
        System.out.println("Nombre del Staff: "+staff.getNombre());
        System.out.println("Maneja: "+staff.getManeja());
        System.out.println("Puesto: "+staff.getPuesto());
        System.out.println("Suedo: "+staff.getSueldo());
        System.out.println("Sexo: "+staff.getSexo());
         //---------------------------------------------------------------------
        Ingenieros ingeniero=new Ingenieros();
        ingeniero.setNombre("Atenea");
        ingeniero.setSexo('F');
        ingeniero.setPuesto("Ingeniero de Audio");
        ingeniero.setTipoIng("Monitores");
        ingeniero.setSueldo(1500);
        ingeniero.setOpera("Analoga");
        ingeniero.setManeja(true);
        System.out.println("----------INGENIERO------------------\n");
        System.out.println("Nombre: "+ingeniero.getNombre());
        System.out.println("Sexo: "+ingeniero.getSexo());
        System.out.println("Puesto: "+ingeniero.getPuesto());
        System.out.println("Tipo de Ingeriero: "+ingeniero.getTipoIng());
        System.out.println("Sueldo: "+ingeniero.getSueldo());
        System.out.println("Opera: "+ingeniero.getOpera());
        System.out.println("Maneja: "+ingeniero.getManeja());
       
       
       
       
       
       
       
       
       
       
       
       
       
    }
}
