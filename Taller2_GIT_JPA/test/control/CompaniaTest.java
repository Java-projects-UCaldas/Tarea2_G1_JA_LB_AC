package control;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;


class CompaniaTest {

	/**
	 * Se adiciona un empleado de tipo 
	 */
	@Test
    void testCalcularNominaSinEmpleados() throws EmpleadoException {
		Compania compania = new Compania();
		assertThrows(EmpleadoException.class, ()-> compania.calcularNominaSemanal());
	}

}
