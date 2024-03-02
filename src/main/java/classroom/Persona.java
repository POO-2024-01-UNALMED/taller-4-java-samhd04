package classroom;

public class Persona {

    final long cedula;
    String nombre;
    static int totalPersonas;
    static int numeroCedulasPorDefecto;
    
    static {
    	totalPersonas = 0;
    	numeroCedulasPorDefecto = 0;
    }
    
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
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
