
 //@author GenadyThink
public abstract class Personajes {
    private int id,vida;
    private String nombre, raza;
    public Personajes(int id, int vida, String nombre, String raza) {
        this.id = id;
        this.vida = vida;
        this.nombre = nombre;
        this.raza = raza;
    }

    public Personajes() {
    }

    @Override
    public String toString() {
        return "Personajes{" + "id=" + id + ", vida=" + vida + ", nombre=" + nombre + ", raza=" + raza + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    
    
    
}
