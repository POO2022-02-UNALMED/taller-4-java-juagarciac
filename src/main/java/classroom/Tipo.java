package classroom;

public class Tipo {
	public int codigo;
	
	public Tipo(int codigo) {
		this.codigo = codigo;
	}
	public static Tipo DISCIPLINAR() {
		return new Tipo(int 10);
	}
	public static Tipo FUNDAMENTACION() {
		return new Tipo(int 20);
	}
	public static Tipo ELECTIVA() {
		return new Tipo(int 30);
	}
}
