package modelos;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("asalariado")
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
		return this.salarioSemanal;
	}

	public double getSalarioSemanal() {
		return salarioSemanal;
	}

	public void setSalarioSemanal(double salarioSemanal) {
		this.salarioSemanal = salarioSemanal;
	}

}
