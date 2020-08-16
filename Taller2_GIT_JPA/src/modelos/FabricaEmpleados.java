package modelos;

/**
 * Permite la crecion de empleados segun el tipo seleccionado
 * (que llega como uno de los parametros)
 * @author Jhon
 * @author Andres
 * @author Lukas
 *
 */
public class FabricaEmpleados {
	/**
	 * Crea un nuevo Empleado a apartir de los parametros recibidos
	 * @param identificador valor de la identificacion del empleado
	 * @param nombre valor del nombre del empleado
	 * @param tipo de que tipo es el empleado: 'a' para Asalariado, 'h' para Horas, 'c' para Comision
	 * @param salarioSemanal valor del salario semanal del empleado
	 * @param valorHora valor por hora trabajada del empleado
	 * @param horasTrabajadas cantidad de horas trabajadas del empleado
	 * @param salarioBase valor del salario base semanal del empleado
	 * @param valorVentasRealizadas valor de las ventas semanales realizadas del empleado
	 * @return el objeto Empleado (Asalariado, Horas o Comision) creado
	 * 			o null si no se especifica un tipo valido de empleado
	 */
	public static Empleado crearEmpleado(String identificador, String nombre, char tipo, double salarioSemanal, 
			double valorHora, int horasTrabajadas, double salarioBase, double valorVentasRealizadas) {
		switch (tipo) {
			case 'a' :
			case 'A': return new Asalariado(identificador, nombre, salarioSemanal);
			case 'h':
			case 'H': return new Horas(identificador, nombre, valorHora, horasTrabajadas);
			case 'c':
			case 'C': return new Comision(identificador, nombre, salarioBase, valorVentasRealizadas);
		}
		return null;
			
	}

}
