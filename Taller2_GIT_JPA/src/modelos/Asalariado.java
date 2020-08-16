package modelos;



public class Asalariado extends Empleado  {

	private double salarioSemanal;
	
	public Asalariado() {
		
	}
	
	public Asalariado(String identificador, String nombre, double salarioSemanal) {
		super(identificador, nombre);
		this.salarioSemanal=salarioSemanal;
	}
 
	
	@Override
	public double calcularSalario() {
		return 0;
	}

}
