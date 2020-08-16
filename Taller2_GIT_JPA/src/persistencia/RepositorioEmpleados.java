package persistencia;

import java.util.List;

import modelos.Empleado;

/**
 * Servicios relacionados con la gestión de los datos de los empleados
 * en un repositorio (consultar, adicionar, buscar, borrar)
 * @version 1.0
 */
public interface RepositorioEmpleados {
	
	/**
	 * Consulta toda la lista de los empleados que hay registrados
	 * @return	la lista (List) con los empleados.
	 * 			En caso de no existir empleados retorna una lista vacía.
	 */
	public List<Empleado> consultarEmpleados();

	/**
	 * Adiciona un empleado al repositorio para hacerlo persistente
	 * @param Empleado el objeto Empleado que se desea guardar,
	 * 			debe ser diferente de null
	 * @return un valor booleano indicando si se pudo guardar en el repositorio o no
	 */
	public abstract boolean adicionarEmpleado(Empleado empleado);
	
	/**
	 * Busca un empleado en la base de datos a partir de su identificador
	 * @param identificadro	el número de identificación que se desea buscar,
	 * 			debe ser diferente de null
	 * @return	el objeto empleado con el identificador dado, o null si no se encuentra.
	 */
	public abstract Empleado buscarEmpleado(String identificador);
	
	/**
	 * Elimina toda la información del empleado en el repositorio
	 * @param empleado el objeto empleado que se desea borrar,
	 * 			debe ser diferente de null
	 * @return un valor booleano indicando si se pudo borrar en el repositorio o no
	 */
	public abstract boolean borrarEmpleado(Empleado empleado);
}
