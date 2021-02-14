import java.util.ArrayList;
import java.util.Scanner;
public class TestCineNava {
    public static void main(String[] args) {
        int check=0;
        boolean horaCheck;
        Scanner scanner = new Scanner(System.in);
        Cine cine=new Cine("Cinepolis", 9, 23);
        do{
            System.out.println("\n\nQuieres agregar pelicula?\t1 = Si\t0 = No");
            check=scanner.nextInt();
            scanner.nextLine();
            switch (check){
                case 1:
                    System.out.println("\nDime el nombre de la pelicula:");
                    String nomPelicula=scanner.nextLine();  
                    Pelicula pelicula = new Pelicula(nomPelicula);
                    cine.agregarPelicula(pelicula);
                break;
                default:
                    System.out.println(cine.toString());
                    System.out.println("Numero de Peliculas: "+ cine.totalPeliculas());
                    System.out.println(cine.imprimirPeliculas());
                    break;
            }
        }while(check!=0);
        System.out.println("Ingresa la hora en que quieres ir al cine:");
        int horaCine=scanner.nextInt();
        horaCheck=cine.horaCine(horaCine);
        if (horaCheck==true){
            System.out.println("Puedes entrar, pero con cubrebocas Rey");
        }
        else
            System.out.println("no esta abierto");
    }
}
