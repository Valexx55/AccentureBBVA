package acccobol3;

import java.util.ArrayList;
import java.util.Scanner;

public class MainPersonaList2 {
	
	private static final int NUM_PERSONAS = 3;
	
	public static Persona obtenerMayorEdad (ArrayList<Persona> l_p)
	{
		Persona persona_mayor_edad = null;
		Persona persona_en_curso = null;
		int edad_persona_en_curso = 0;
		int edad_mayor = 0;
		
		for (int j=0; j<l_p.size(); j++)
		{
			persona_en_curso = l_p.get(j);
			edad_persona_en_curso = persona_en_curso.getEdad();
			
			if (edad_persona_en_curso>edad_mayor)
			{
				edad_mayor = edad_persona_en_curso;
				persona_mayor_edad = persona_en_curso;
			}
		}
		
		return persona_mayor_edad;
	}
	
	
	public static void mostrarArrayPersonas (ArrayList<Persona> arrayl_p)
	{
		for (Persona p : arrayl_p)
		{
//			System.out.println(p.getNombre());
//			System.out.println(p.getDni());
//			System.out.println(p.getEdad());
			//TODO mostrarPersona
			p.mostrarPersona();
		}
	}
	private static int pedirEdad ()
	{
		int edad_leida = 0;
		Scanner scanner = null;
		
			System.out.println("DAme Edad");
			scanner = new Scanner(System.in);
			edad_leida = scanner.nextInt();
		
		return edad_leida;
		
	}
	
	
	public static Persona pedirALaVezLos3Datos ()
	{
		Persona persona_devuelta = null;
		
			/*String nombre = pedirNombre();
			int edad = pedirEdad();
			String dni = pedirDni();*/
			persona_devuelta = new Persona("J", "54-J", 60);
			/*persona_devuelta.setNombre(nombre);
			persona_devuelta.setEdad(edad);
			dni = dni +"-"+ Dni.calcularLetraDni(dni);*/
			//persona_devuelta.setDni(dni);
		
		return persona_devuelta;
		
	}
	
	private static String pedirNombre ()
	{
		String nombre_leido = null;
		Scanner scanner = null;
		
			System.out.println("DAme nombre");
			scanner = new Scanner(System.in);
			nombre_leido = scanner.nextLine();
		
		return nombre_leido;
		
	}
	
	private static String pedirDni ()
	{
		String dni_leido = null;
		Scanner scanner = null;
		
			System.out.println("DAme DNI sin/n");
			scanner = new Scanner(System.in);
			dni_leido = scanner.nextLine();
		
		return dni_leido;
		
	}
	public static void main(String[] args) {
		
		ArrayList<Persona> lista_personas = null;
		lista_personas = new ArrayList<Persona>();
		
		for (int j=0; j<NUM_PERSONAS; j++)
		{
			Persona objeto_persona = pedirALaVezLos3Datos();
			//lista_personas[j] = objeto_persona;
			lista_personas.add(objeto_persona);
		}
		mostrarArrayPersonas(lista_personas);
		Persona p = obtenerMayorEdad(lista_personas);
		System.out.println("Persona mayor_edad " + p.getNombre());
		int total = Persona.obtenerTotalPersonas();
		System.out.println("TOTAL personas = " + total);
	}//fin del main

}//fin clase
