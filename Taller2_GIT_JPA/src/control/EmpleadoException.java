package control;

/**
 * Excepciones relacionadas con el registro de empleados en la compa�ia,
 * especialmente por no cumplir alguna regla del negocio
 * @author Jhon
 * @author Andres
 * @author Lucas
 * @version 1.0
 */

@SuppressWarnings("serial")
public class EmpleadoException extends Exception{
	
	public EmpleadoException(String mensaje) {
		super(mensaje);
	}

}
