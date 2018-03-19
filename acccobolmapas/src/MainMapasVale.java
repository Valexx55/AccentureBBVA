import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MainMapasVale {

	/**
	 * 
	 * SOLUCIÓN 1 (UNA SOLA CONSULTA)
	 * 
	 * SELECT e.employee_id, e.first_name, e.salary, d.department_id FROM
	 * employees e, departments d WHERE e.department_id = d.department_id ORDER
	 * by d.department_id;
	 * 
	 * --------------------------------
	 * 
	 * SELECT e.employee_id, e.first_name, e.salary, e.department_id FROM
	 * employees e;
	 * 
	 * SOLUCIÓN 2 (DOS CONSULTAS)
	 * 
	 * 2.1 SELECT * FROM Departments 2.2 Para cada id_depto
	 * 
	 * SELECT * FROM employees where department_id = id_depto
	 * 
	 * 
	 * 
	 */

	public static final String CONSULTA_DPTOS = "SELECT department_id, department_name FROM departments";
	public static final String CONSULTA_EMP_DPTO = "SELECT employee_id, first_name, salary, hire_date FROM employees where department_id = ?";

	private static Connection obtenerConexion() throws SQLException {
		Connection connection = null;

		try {
			connection = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "HR", "password");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Ha fallado al obtener la conexión");
			throw e;
		}

		return connection;
	}

	public static void liberarRecursos(Connection conexion, Statement st, ResultSet rs) {

		if (rs != null) {
			try {
				rs.close();
			}

			catch (SQLException e) {
				// log.error("Error al liberar el ResultSet", e);
			}
		}
		if (st != null) {
			try {
				st.close();
			}

			catch (SQLException e) {
				// log.error("Error al liberar el Statement", e);
			}
		}

		if (conexion != null) {
			try {
				conexion.close();
			}

			catch (SQLException e) {
				// log.error("Error al liberar la conexion", e);
			}
		}
	}

	public static List<EmpleadoMapa> obtenerListaEmpleadosPorDpto(int id_dpto) {
		List<EmpleadoMapa> lista_empleados = null;
		Connection conexion = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		EmpleadoMapa eaux = null;

		try {
			conexion = obtenerConexion();
			ps = conexion.prepareStatement(CONSULTA_EMP_DPTO);
			ps.setInt(1, id_dpto);
			rs = ps.executeQuery();
			lista_empleados = new ArrayList<EmpleadoMapa>();
			eaux = null;

			while (rs.next()) {
				eaux = new EmpleadoMapa(rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getDate(4));
				lista_empleados.add(eaux);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			liberarRecursos(conexion, ps, rs);
		}

		return lista_empleados;
	}

	public static List<DepartmentMapa> obtenerListaDepartamentos() {
		List<DepartmentMapa> lista_departamentos = null;
		Connection conexion = null;
		Statement st = null;
		ResultSet rs = null;

		try {
			conexion = obtenerConexion();
			st = conexion.createStatement();
			rs = st.executeQuery(CONSULTA_DPTOS);

			lista_departamentos = new ArrayList<DepartmentMapa>();

			while (rs.next()) {
				lista_departamentos.add(new DepartmentMapa(rs.getInt(1), rs.getString(2)));
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			liberarRecursos(conexion, st, rs);
		}

		return lista_departamentos;
	}

	public static Map<DepartmentMapa, List<EmpleadoMapa>> obtenerMapaEmpleados() {
		Map<DepartmentMapa, List<EmpleadoMapa>> maped = null;
		List<EmpleadoMapa> l_empleados = null;

		List<DepartmentMapa> l_departamentos = obtenerListaDepartamentos();
		maped = new HashMap<DepartmentMapa, List<EmpleadoMapa>>();
		for (DepartmentMapa d : l_departamentos) {
			l_empleados = obtenerListaEmpleadosPorDpto(d.getId());
			maped.put(d, l_empleados);
		}

		return maped;
	}
	
	public static EmpleadoMapa obtenerMejorPagado (List<EmpleadoMapa> le)
	{
		EmpleadoMapa mejor_pagado = null;
		int longuitud = le.size();
		int actual = 0;
		
			//mejor_pagado = (longuitud==0) ? null : le.get(0);
			if (longuitud==0)
			{
				mejor_pagado = null;
			}
			else 
			{
				Collections.sort(le, new ComparaEmpleados());
				mejor_pagado = le.get(le.size()-1);//obtengo el mejor pagado
			}
		
		return mejor_pagado;
	}
	

	/*
	 * //TODO HACED UN MÉTODO, QUE RECIBA EL MAPA DE DEPARTAMENTOS-EMPLEADOS Y
	 * DEVUELVA UNA LISTA DE EMPLEADOS COMPUESTA ÚNICAMENTE POR LOS MEJORES
	 * PAGADOS DE CADA DEPARTAMENTO
	 */

	private static List<EmpleadoMapa> obtenerMejorPagados(Map<DepartmentMapa, List<EmpleadoMapa>> mapa) {
		List<EmpleadoMapa> le = null;
		List<EmpleadoMapa> le_actual = null;
		EmpleadoMapa mejor_pagado = null;
		
		Set<DepartmentMapa> conjunto_claves = mapa.keySet();
		Iterator<DepartmentMapa> it = conjunto_claves.iterator();
		//int clave_actual = 1;
		DepartmentMapa clave_actual = null;
		
		le = new ArrayList<EmpleadoMapa>();
		while (it.hasNext()) {
			
			clave_actual = it.next();
			System.out.println("Clave actual " + clave_actual);
			le_actual = mapa.get(clave_actual);
			mejor_pagado = obtenerMejorPagado(le_actual);
			if (mejor_pagado!=null)
			{
				le.add(mejor_pagado);
			}
		}

		return le;

	}

	public static void main(String[] args) {

		try {
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			Map<DepartmentMapa, List<EmpleadoMapa>> maped 
			= obtenerMapaEmpleados();
			
			DepartmentMapa dn = new DepartmentMapa(120, "Treasury");
			List<EmpleadoMapa> lp = maped.get(dn);
			
			List<EmpleadoMapa> lista_mejor_pagados 
			= obtenerMejorPagados(maped);
			System.out.println(lista_mejor_pagados);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		// método equivalente al anterior
		// Sea como sea, es, <<oye, si te piden una conexión, se la pides a esa
		// clase!>>

		/*
		 * Map<String, Persona> mapa = null;
		 * 
		 * mapa = new HashMap<String, Persona>();
		 * 
		 * Persona p1 = new Persona("VALE", "43", 68); Persona p2 = new
		 * Persona("MARY", "56", 56);
		 * 
		 * mapa.put(p1.getDni(), p1); mapa.put(p2.getDni(), p2);
		 * 
		 * Persona p3 = mapa.get("65"); if (p2.equals(p3)) {
		 * System.out.println("SOn iguales"); } else {
		 * System.out.println("NO SON IGUALES");
		 * 
		 * }
		 */

	}

}
