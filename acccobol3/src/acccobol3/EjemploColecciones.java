package acccobol3;

import java.util.ArrayList;

public class EjemploColecciones {
	
	public static void main(String[] args) {
		
		ArrayList<Persona> lista_p = null;
		
		Persona p = new Persona("Jose", "98C", 23);
		Persona p1 = new Persona("Jose1", "99C", 23);
		Persona p2 = new Persona("Jose2", "100C", 23);
		

		Alumno alumno = new Alumno();
		
		if (alumno instanceof Alumno)
		{
			System.out.println("Sí");
			if (alumno instanceof Persona)
			{
				System.out.println("Sí es persona");
				alumno.getDni();
				alumno.getEdad();
				alumno.toString();
				if (alumno instanceof Object)
				{
					System.out.println("Al es un o");
				}
			}
		}
		
		
//		if (p2 instanceof String) 
//		{
//			System.out.println("P2 lo es! ");
//		} else {
//			System.out.println("P2 NO lo es!");
//		}
		
		lista_p = new ArrayList<Persona>();
		
		lista_p.add(p);
		lista_p.add(p1);
		lista_p.add(p2);
		//lista_p.get(0)
		
		System.out.println("La lista tiene "+
		lista_p.size() + " elementos");
		
	}

}
