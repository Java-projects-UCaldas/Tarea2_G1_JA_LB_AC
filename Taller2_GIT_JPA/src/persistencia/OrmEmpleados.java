package persistencia;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import modelos.Empleado;

/**
 * Usa una base de datos como repositorio de los datos de los empleados,
 * y ofrece los servicios definidos en RepositorioEmpleados.
 * @author Jhon
 * @author Andres
 * @author Lucas
 * @version 1.0
 */
public class OrmEmpleados implements RepositorioEmpleados{

	private EntityManager gestorBd;
	
	public OrmEmpleados() {
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("EmpleadosPU");
		gestorBd = fabrica.createEntityManager();
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Empleado> consultarEmpleados() {
		Query query = gestorBd.createQuery("select e from Empleado e");
		System.out.println(query);
		List<Empleado> empleados = query.getResultList();
		return empleados;
	}

	@Override
	public boolean adicionarEmpleado(Empleado empleado) {
		try	{
			gestorBd.getTransaction().begin();
			gestorBd.persist(empleado);
			gestorBd.getTransaction().commit();
		}
		catch (Exception errorCrear)	{
			return false;
		}
		return true;
	}

	@Override
	public Empleado buscarEmpleado(String identificador) {
		Empleado empleado = gestorBd.find(Empleado.class, identificador);
		return empleado;
	}

	@Override
	public boolean borrarEmpleado(Empleado empleado) {
		try	{
			gestorBd.getTransaction().begin();
			gestorBd.remove(empleado);
			gestorBd.getTransaction().commit();
		}
		catch (Exception errorBorrar)	{
			return false;
		}
		return true;
	}
	
	/**
	 * Cierra el EntitiyManager cuando se vaya a destruir este objeto
	 */
	@Override
	protected void finalize() {
		gestorBd.close();
	}
}
