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
	
	public Horas() {
	}
	
	public Horas(String identificador, String nombre, double valorHora, int horasTrabajadas) {
		super(identificador, nombre);
		this.valorHora = valorHora;
		this.horasTrabajadas = horasTrabajadas;
	}
	
	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}

	public int getHorasTrabajadas() {
		return horasTrabajadas;
	}

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
