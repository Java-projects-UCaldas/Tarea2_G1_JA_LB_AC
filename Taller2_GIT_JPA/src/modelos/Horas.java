package modelos;

/**
 * Tipo de Empleado el cual se calcula su salario dependiendo de las horas trabajadas
 * @author Jhon
 * @author Andres
 * @author Lucas
 * @version 1.0
 */
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
		return 0;
	}

}
