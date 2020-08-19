package modelos;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * Tipo de Empleado el cual se calcula su salario dependiendo de las horas trabajadas
 * @author Jhon
 * @author Andres
 * @author Lucas
 * @version 1.0
 */

@Entity
@DiscriminatorValue("horas")
public class Horas extends Empleado{
	
	private double valorHora;
	private int horasTrabajadas;
	
	/**
	 * Constructor por defecto. Se tiene para poder usar el API de persistencia JPA
	 */
	public Horas() {
	}
	
	/**
	 * 
	 * @param identificador identificacion del empleado
	 * @param nombre nombre del empleado
	 * @param valorHora valor por hora del empleado
	 * @param horasTrabajadas cantidad de horas trabajadas por el empleado
	 */
	public Horas(String identificador, String nombre, double valorHora, int horasTrabajadas) {
		super(identificador, nombre);
		this.valorHora = valorHora;
		this.horasTrabajadas = horasTrabajadas;
	}
	
	public double getValorHora() {
		return valorHora;
	}
	
	/**
	 * Métodos set para los atributos. Se tienen para poder cumplir con lo
	 * requerido por el API de persistencia JPA
	 */
	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}

	public int getHorasTrabajadas() {
		return horasTrabajadas;
	}
	
	/**
	 * Métodos set para los atributos. Se tienen para poder cumplir con lo
	 * requerido por el API de persistencia JPA
	 */
	public void setHorasTrabajadas(int horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}

	@Override
	public double calcularSalario() {
		double salario = 0;
		double bono = 200000;
		if (this.horasTrabajadas > 40) {
			salario = (this.valorHora * this.horasTrabajadas) + bono;
		}
		else {
			salario = this.valorHora * this.horasTrabajadas;
		}
		return salario;
	}

}
