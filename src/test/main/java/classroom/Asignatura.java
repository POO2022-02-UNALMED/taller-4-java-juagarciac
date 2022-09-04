package classroom;

public class Asignatura {

    public String nombre;
    public int codigoInterno;
    public int codigoExterno;
    public Tipo tipo;
    
    Asignatura(String nombre, int codigoInterno, int codigoExterno,Tipo tipo) {
        this.nombre = nombre;
        this.codigoInterno = codigoInterno;
        this.codigoExterno = codigoExterno;
        this.tipo = tipo;
    }

    Asignatura() {
        this.nombre="Sin nombre";
    }

    Asignatura(int codigoExterno,Tipo tipo) {
    	this.nombre ="Sin nombre";
        this.codigoExterno = codigoExterno;
        this.tipo = tipo;
    }

    Asignatura(String nombre, Tipo tipo) {
    	this.nombre = nombre;
        this.tipo = tipo;
    }

    public void cambiarDatos(int codigoExterno) {
        this.codigoExterno = codigoExterno;
    }

    void cambiarDatos(String nombre) {
        this.nombre = nombre;
    }

    public void setCodigoInterno(int codigoInterno) {
        this.codigoInterno = codigoInterno;
    }
    
    public void setCodigoInterno(double codigoInterno) {
        this.codigoInterno = (int) codigoInterno;
    }
}
