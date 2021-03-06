
/*@author GenadyThink*/
public class Mago extends Personajes{
    private double danio;
    private String poder;

    public Mago(int id, int vida, String nombre, String raza) {
        super();
    }

    public Mago(double danio, String poder, int id, int vida, String nombre, String raza) {
        super(id, vida, nombre, raza);
        this.danio = danio;
        this.poder = poder;
    }

    @Override
    public String toString() {
        return "Mago{" + "danio=" + danio + ", poder=" + poder + '}'+"\n"+super.toString();
    }

    public double getDanio() {
        return danio;
    }

    public void setDanio(double danio) {
        this.danio = danio;
    }

    public String getPoder() {
        return poder;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }
}
