package classroom;

public class Persona {

    final long cedula;
    String nombre;
    static int totalPersonas;
    
    public Persona() {
    	this("", 0);
    }

    public Persona(long cedula, String nombre) {
    	this(nombre, cedula);
    }

    public Persona(long cedula) {
    	this("", cedula);
    }

    public Persona(String nombre) {
    	this(nombre, 1);
    }
    
    public Persona(String nombre, long cedula) {
        this.cedula = cedula;
        this.nombre = nombre;
        totalPersonas++;
    }
    
    public long getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
