package classroom;

public class Persona {

    public final long cedula;
    public String nombre;
    public static int totalPersonas;
    public static int numeroCedulasPorDefecto;
    
    public Persona() {
    	this.cedula = numeroCedulasPorDefecto;
    	this.nombre = "";
    	totalPersonas++;
    	numeroCedulasPorDefecto++;
    }

    public Persona(long cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
        totalPersonas++;
    }
    
    public Persona(String nombre, long cedula) {
        this.cedula = cedula;
        this.nombre = nombre;
        totalPersonas++;
    }

    public Persona(long cedula) {
        this.cedula = cedula;
        this.nombre = "";
        totalPersonas++;
    }

    public Persona(String nombre) {
    	this.cedula = numeroCedulasPorDefecto;
        this.nombre = nombre;
        totalPersonas++;
        numeroCedulasPorDefecto++;
    }
    
    public long getCedula() {
        return this.cedula;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
