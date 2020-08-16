package modelos;

import javax.persistence.Id;

/**
 * 
 * @author Jhon
 * @author Andres
 * @author Lucas
 *  Clase abstracta mediante la cual se crean los 
 *  objetos tipo empleado y se denota el m�todo 
 *  calcularSalario
 */
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
	
	/**
	 * M�todo que calcula el salario dependiendo del tipo 
	 * de empleado, es decir, si es Asalariado, por Horas,
	 * o Comisi�n.
	 * @return
	 */
	public abstract double calcularSalario();

}
