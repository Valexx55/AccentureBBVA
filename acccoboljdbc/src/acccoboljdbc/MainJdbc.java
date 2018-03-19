package acccoboljdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

/**
 * Clase para leer los empleados
 * de la base de datos HR
 * @author Alumno
 *
 */
public class MainJdbc {
	
	public static final String IP_SERVIDOR ="";
	public static final String PUERTO ="";
	public static final String USER ="";
	public static final String PWD ="";
	
	
	public static void liberarRecursos(Connection conexion, Statement st, ResultSet rs) {

		if (rs != null) {
			try {
				rs.close();
			}

			catch (SQLException e) {
				//log.error("Error al liberar el ResultSet", e);
			}
		}
		if (st != null) {
			try {
				st.close();
			}

			catch (SQLException e) {
				//log.error("Error al liberar el Statement", e);
			}
		}

		if (conexion != null) {
			try {
				conexion.close();
			}

			catch (SQLException e) {
				//log.error("Error al liberar la conexion", e);
			}
		}
	}
	
	
	
	public static List<Empleado> empleadosComun 
	(List<Empleado> l1, List<Empleado> l2)
	{
		List<Empleado> ldev = null;
		
		ldev = new ArrayList<Empleado>();
		for (Empleado e : l1)
		{
			if (l2.contains(e))
			{
				ldev.add(e);
			}
		}
		
		return ldev;
		
	}
	
	
	
	
	
	
	
	
	public static boolean existeEmpleado 
	(List<Empleado> le, Empleado e)
	{
		boolean existe = false;
			
			existe = le.contains(e);
			
		return existe;
		
		/*boolean encontrado = false;
		int pos_actual = 0;
		int longi = le.size();
		Empleado eaux = null;
		//TODO
		do
		{
			eaux = le.get(pos_actual);
			if (eaux.equals(e))
			{
				encontrado = true;
			} else {
				pos_actual++;
			}
		}while ((!encontrado)&&(pos_actual<longi));
		
		return encontrado;*/
	}
	
	public static void mostrarListaEmpleados 
	(Object ale1)
	{
		
		List<Empleado> le = (List<Empleado>)ale1;
		for (Empleado e : le)
		{
			System.out.println(e.toString());
		}
		
	}
	
	
	public Empleado leerBDEmp (int id)
	{
		return null;
	}
	
	public static void main(String[] args) {
		
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		String query = "SELECT employee_id, first_name, salary FROM EMPLOYEES";
		
		try {
			
			DriverManager.registerDriver 
			(new oracle.jdbc.driver.OracleDriver());// método equivalente al anterior
			//Sea como sea, es, <<oye, si te piden una conexión, se la pides a esa clase!>>
			conn = DriverManager.getConnection 
			("jdbc:oracle:thin:@127.0.0.1:1521:xe", 
			"HR", "password");
			st = conn.createStatement();
			rs = st.executeQuery(query);//"SELECT count (*) FROM EMPLOYEES";
			int id_emp = 0;
			String nombre = null;
			double salario = 0;
			Empleado e = null;
			List<Empleado> ale = new ArrayList<Empleado>();
			while (rs.next())
			{
				id_emp = rs.getInt(1);
				nombre = rs.getString(2);
				salario = rs.getDouble(3);
				e = new Empleado(id_emp, nombre, salario);
				ale.add(e);
			}
			
			
			Collections.sort(ale);
			System.out.println("ORDEN NATURAL x Nombre");
			mostrarListaEmpleados (ale);
			System.out.println("ORDEN TOTAL x Salario");
			Collections.sort(ale, new ComparaEmpleados());
			mostrarListaEmpleados (ale);
			
			/*mostrarListaEmpleados (ale);
			//ID = 206 Nombre = William Salario = 20973.69
			Empleado em = new Empleado(207, "William", 20973.69);
			if (existeEmpleado(ale, em))
			{
				System.out.println("Existe");
			}
			else
			{
				System.out.println("NO existe");
			}
			
			//test para elementosenComun
			
			List<Empleado> l = empleadosComun(ale, ale);
			if (l.size()==ale.size())
			{
				System.out.println("FUNCIONA COMUN");
			} else
			{
				System.out.println("NO FUNCIONA COMUN");
			}*/
			//System.out.println("Tenemos " + nemp + " empleados");
			//LIBERO RECURSOS
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//TODO LIBERAR RECURSOS
			liberarRecursos(conn, st, rs);
		}
		
		
		
	}

}
