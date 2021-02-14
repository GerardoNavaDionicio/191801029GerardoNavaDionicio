
import java.util.ArrayList;
public class Cine{
    public String nombreCine;
    public int horaIn,horaOut;
    public ArrayList<Pelicula>peliculas;
    public Cine(){
    }
    public  Cine(String nombreCine, int horaInt,int horaOut,ArrayList<Pelicula>peliculas) {
        this.horaIn=horaInt;
        this.horaOut=horaOut;
        this.nombreCine=nombreCine;
        this.peliculas=peliculas;
    }
   public Cine(String nombreCine, int horaInt,int horaOut){
        this.horaIn=horaInt;
        this.horaOut=horaOut;
        this.nombreCine=nombreCine;
        this.peliculas=new ArrayList();
    }
   //Metodo para imprimir nombre del Cine
    @Override
    public String toString() {
        return "\nNombre del cine: "+nombreCine;
    }
    public String imprimirPeliculas(){
        String cartelera="";
        for(Pelicula pelicula:peliculas){
                cartelera += pelicula.titulo+"\n";
           }
        return cartelera;
    }
    //Metodo para agrar una pelicula
    public void agregarPelicula(Pelicula pelicula){
        peliculas.add(pelicula);
    }
    //Metodo para definir horarioss
    public boolean horaCine(int hora){
        if ((hora>=horaIn)&&(hora<=horaOut))
            return true;
        else 
            return false;     
    }
    //Metodo para saber cuantas peliculas hay 
    public int totalPeliculas(){
        return peliculas.size();
    }
}

