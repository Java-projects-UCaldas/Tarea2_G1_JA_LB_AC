package modelos;

public abstract class Empleado {
	
	private String identificador;
	private String nombre;
	
	
	public Empleado() {
		
	}
	
	public Empleado(String identificador, String nombre) {
		
		this.identificador = identificador;
		this.nombre = nombre;
	}
	
	public abstract double calcularSalario();

}
