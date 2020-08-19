package modelos;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * Tipo de Empleado el cual se calcula su salario dependiendo del salario base y el valor de las ventas realizadas
 * @author Jhon
 * @author Andres
 * @author Lucas
 * @version 1.0
 */

@Entity
@DiscriminatorValue("comision")
public class Comision extends Empleado{
	
	private double salarioBase;
	private double valorVentasRealizadas;
	
	/**
	 * Constructor por defecto. Se tiene para poder usar el API de persistencia JPA
	 */
	public Comision(){
		
	}
	
	/**
	 * @param identificador del Empleado Asalariado
	 * @param nombre del Empleado Asalariado
	 * @param salarioBase Salalario Base semanal del empleado
	 * @param valorVentasRealizadas valor de las ventas realizadas por el empleado
	 */
	public Comision(String identificador, String nombre, double salarioBase, double valorVentasRealizadas) {
		super(identificador, nombre);
		this.salarioBase = salarioBase;
		this.valorVentasRealizadas = valorVentasRealizadas;
	}

	public double getSalarioBase() {
		return salarioBase;
	}
	
	/**
	 * Métodos set para los atributos. Se tienen para poder cumplir con lo
	 * requerido por el API de persistencia JPA
	 */
	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public double getValorVentasRealizadas() {
		return valorVentasRealizadas;
	}
	
	/**
	 * Métodos set para los atributos. Se tienen para poder cumplir con lo
	 * requerido por el API de persistencia JPA
	 */
	public void setValorVentasRealizadas(double valorVentasRealizadas) {
		this.valorVentasRealizadas = valorVentasRealizadas;
	}

	@Override
	public double calcularSalario() {
		return (this.valorVentasRealizadas * 0.05) + this.salarioBase;
	}

}
