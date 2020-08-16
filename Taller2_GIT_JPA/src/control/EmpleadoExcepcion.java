package control;

/**
 * Excepciones relacionadas con el registro de empleados en la compañia,
 * especialmente por no cumplir alguna regla del negocio
 * @author Jhon
 * @author Andres
 * @author Lucas
 * @version 1.0
 */

@SuppressWarnings("serial")
public class EmpleadoExcepcion extends Exception{
	
	public EmpleadoExcepcion(String mensaje) {
		super(mensaje);
	}

}
