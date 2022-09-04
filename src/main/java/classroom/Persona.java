package classroom;

public class Persona {

    public final int cedula;
    public String nombre;
    static int totalPersonas=0;
    
    
    Persona(){
    	this.nombre="";
    	this.cedula=0;
    	totalPersonas++;
    }

    Persona(int cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
        totalPersonas++;
    }
    
    Persona(String nombre, int cedula) {
        this.cedula = cedula;
        this.nombre = nombre;
        totalPersonas++;
    }

    Persona(int cedula) {
        this.cedula = cedula;
        this.nombre = "";
        totalPersonas++;
    }

    Persona(String nombre) {
        this.nombre =nombre;
        this.cedula=1;
        totalPersonas++;
    }
    
    public int getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
