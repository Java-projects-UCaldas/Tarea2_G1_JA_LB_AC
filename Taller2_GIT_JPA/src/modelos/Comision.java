package modelos;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * 
 * @author Jhon
 * @author Andres
 * @author Lucas
 * Clase que hereda de empleado y del tipo
 * específico comisión
 */

@Entity
@DiscriminatorValue("comision")
public class Comision extends Empleado{
	
	private double salarioBase;
	private double valorVentasRealizadas;
	
	public Comision(){
		
	}
	
	public Comision(String identificador, String nombre, double salarioBase, double valorVentasRealizadas) {
		super(identificador, nombre);
		this.salarioBase = salarioBase;
		this.valorVentasRealizadas = valorVentasRealizadas;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public double getValorVentasRealizadas() {
		return valorVentasRealizadas;
	}

	public void setValorVentasRealizadas(double valorVentasRealizadas) {
		this.valorVentasRealizadas = valorVentasRealizadas;
	}

	@Override
	public double calcularSalario() {
		return (this.valorVentasRealizadas * 0.05) + this.salarioBase;
	}

}
