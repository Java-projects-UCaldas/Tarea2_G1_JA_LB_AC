package modelos;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.DiscriminatorColumn;


/**
 * 
 * @author Jhon
 * @author Andres
 * @author Lucas
 *  Clase abstracta mediante la cual se crean los 
 *  objetos tipo empleado y se denota el método 
 *  calcularSalario
 */

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipo")
public abstract class Empleado {
	
	@Id
	private String identificador;
	private String nombre;
	
	public Empleado() {
		
	}
	
	public Empleado(String identificador, String nombre) {
		
		this.identificador = identificador;
		this.nombre = nombre;
	}
	
	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	public String getNombre() {
		return nombre;
	}

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
