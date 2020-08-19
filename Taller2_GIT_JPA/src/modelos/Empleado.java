package modelos;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.DiscriminatorColumn;

/**
 * Clase abstracta mediante la cual se crean los objetos tipo empleado 
 * y se denota el método calcularSalario
 * @author Jhon
 * @author Andres
 * @author Lucas
 * @version 1.0
 */

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipo")
public abstract class Empleado {
	
	@Id
	private String identificador;
	private String nombre;
	
	/**
	 * Constructor por defecto. Se tiene para poder usar el API de persistencia JPA
	 */
	public Empleado() {
		
	}
	
	/**
	 * 
	 * @param identificador identificacion del empleado
	 * @param nombre nombre del empleado
	 */
	public Empleado(String identificador, String nombre) {
		
		this.identificador = identificador;
		this.nombre = nombre;
	}
	
	public String getIdentificador() {
		return identificador;
	}
	
	/**
	 * Métodos set para los atributos. Se tienen para poder cumplir con lo
	 * requerido por el API de persistencia JPA
	 */
	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	public String getNombre() {
		return nombre;
	}
	
	/**
	 * Métodos set para los atributos. Se tienen para poder cumplir con lo
	 * requerido por el API de persistencia JPA
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Método que calcula el salario dependiendo del tipo 
	 * de empleado, es decir, si es Asalariado, por Horas,
	 * o Comisión.
	 * @return
	 */
	public abstract double calcularSalario();

}
