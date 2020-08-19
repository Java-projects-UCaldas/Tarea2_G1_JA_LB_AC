package modelos;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * Tipo de Empleado el cual se calcula su salario con base en su salario semanal
 * @author Jhon
 * @author Andres
 * @author Lucas
 * @version 1.0
 */

@Entity
@DiscriminatorValue("asalariado")
public class Asalariado extends Empleado  {

	private double salarioSemanal;
	
	/**
	 * Constructor por defecto. Se tiene para poder usar el API de persistencia JPA
	 */
	public Asalariado() {
		
	}
	
	/**
	 * 
	 * @param identificador del Empleado Asalariado
	 * @param nombre del Empleado Asalariado
	 * @param salarioSemanal Salalario semanal del empleado
	 */
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
	
	/**
	 * Métodos set para los atributos. Se tienen para poder cumplir con lo
	 * requerido por el API de persistencia JPA
	 */
	public void setSalarioSemanal(double salarioSemanal) {
		this.salarioSemanal = salarioSemanal;
	}

}
