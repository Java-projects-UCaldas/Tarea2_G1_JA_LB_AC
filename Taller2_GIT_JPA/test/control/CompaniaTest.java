package control;

import modelos.Empleado;
import modelos.Asalariado;
import modelos.Comision;
import modelos.Horas;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

/**
 * Pruebas de la clase Compania de los metodos 
 * calcular nomina y adicionar empleados
 */
class CompaniaTest {

	/**
	 * Se calcula la nómina sin que existan empleados
	 */
	@Test
    void testCalcularNominaSinEmpleados() throws EmpleadoException {
		Compania compania = new Compania();
		assertThrows(EmpleadoException.class, ()-> compania.calcularNominaSemanal());
	}
	
	/**
	 * Se verifica que se agregue un empleado de tipo Asalariado
	 */
	@Test
	void testAgregarEmpleadoTipoAsalariado() throws EmpleadoException{
		Compania compania = new Compania();
		boolean agrega = compania.adicionarEmpleado("1", "Pepito1 Perez", 'a', 3000000, 0, 0, 0, 0);
		Asalariado empleado1 = (Asalariado)compania.buscarEmpleado("1");
		assertAll("Empleado Asalariado",
		() -> assertEquals("Pepito1 Perez", empleado1.getNombre()),
		() -> assertEquals(3000000, empleado1.getSalarioSemanal()),
		() -> assertTrue(agrega));
	}
	
	/**
	 * Se verifica que se agregue un empleado de tipo Comision
	 */
	@Test
	void testAgregarEmpleadoTipoComision() throws EmpleadoException{
		Compania compania = new Compania();
		boolean agrega = compania.adicionarEmpleado("2", "Pepito2 Perez", 'c', 0, 4000, 48, 1000000, 500000);
		Comision empleado1 = (Comision)compania.buscarEmpleado("2");
		assertAll("Empleado Comision",
		() -> assertEquals("Pepito2 Perez", empleado1.getNombre()),
		() -> assertEquals(1000000, empleado1.getSalarioBase()),
		() -> assertEquals(500000, empleado1.getValorVentasRealizadas()),
		() -> assertTrue(agrega));
	}
	
	/**
	 * Se verifica que se agregue un empleado de tipo Horas
	 */
	@Test
	void testAgregarEmpleadoTipoHoras() throws EmpleadoException{
		Compania compania = new Compania();
		boolean agrega = compania.adicionarEmpleado("3", "Pepito3 Perez", 'h', 0, 4000, 48, 0, 0);
		Horas empleado1 = (Horas)compania.buscarEmpleado("3");
		assertAll("Empleado Horas",
		() -> assertEquals("Pepito3 Perez", empleado1.getNombre()),
		() -> assertEquals(4000, empleado1.getValorHora()),
		() -> assertEquals(48, empleado1.getHorasTrabajadas()),
		() -> assertTrue(agrega));
	}
	
	/**
	 * Se calcula el total de la nomina semanal
	 */
	@Test
	void testCalcularNominaSemanal() throws EmpleadoException{
		Compania compania = new Compania();
		assertEquals(4417000, compania.calcularNominaSemanal());
	}

}
