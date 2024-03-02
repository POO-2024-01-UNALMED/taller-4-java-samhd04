package classroom;

public class Persona {

    final long cedula;
    String nombre;
    static int totalPersonas;
    static long cedulaPorDefecto;
    
    public Persona() {
    	this("", cedulaPorDefecto);
    	cedulaPorDefecto++;
    }

    public Persona(long cedula, String nombre) {
    	this(nombre, cedula);
    }

    public Persona(long cedula) {
    	this("", cedula);
    }

    public Persona(String nombre) {
    	this(nombre, cedulaPorDefecto);
    	cedulaPorDefecto++;
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
