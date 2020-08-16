package control;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelos.Empleado;
import modelos.Asalariado;

public class ORMTest {

	public static void main(String[] args) {
		EntityManagerFactory fabrica = 
				Persistence.createEntityManagerFactory("EmpleadosPU"); 
		EntityManager gestorBD = 
				fabrica.createEntityManager(); 
		
		gestorBD.getTransaction().begin(); 
/*		Empleado empleado = new Asalariado("123","colombianita", 100000); 
		gestorBD.persist(empleado); 
		gestorBD.getTransaction().commit();*/
		Empleado empleadoBuscado = gestorBD.find(Empleado.class, "123"); 
		System.out.println(empleadoBuscado.getClass()); 
		gestorBD.remove(empleadoBuscado);
		gestorBD.getTransaction().commit();		
		gestorBD.close(); 
	}

}
