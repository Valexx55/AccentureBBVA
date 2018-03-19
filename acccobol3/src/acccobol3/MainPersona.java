package acccobol3;

import java.util.Scanner;

public class MainPersona {
	
	private static final int NUM_PERSONAS = 3;
	
	public static Persona obtenerMayorEdad (Persona[] array_p)
	{
		Persona persona_mayor_edad = null;
		Persona persona_en_curso = null;
		int edad_persona_en_curso = 0;
		int edad_mayor = 0;
		
		for (int j=0; j<array_p.length; j++)
		{
			persona_en_curso = array_p[j];
			edad_persona_en_curso = persona_en_curso.getEdad();
			
			if (edad_persona_en_curso>edad_mayor)
			{
				edad_mayor = edad_persona_en_curso;
				persona_mayor_edad = persona_en_curso;
			}
		}
		
		return persona_mayor_edad;
	}
	
	
	public static void mostrarArrayPersonas (Persona[] array_p)
	{
		for (Persona p : array_p)
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
		
		Persona[] array_personas = null;
		array_personas = new Persona[NUM_PERSONAS];
		
		for (int j=0; j<NUM_PERSONAS; j++)
		{
			Persona objeto_persona = pedirALaVezLos3Datos();
			array_personas[j] = objeto_persona;
		}
		mostrarArrayPersonas(array_personas);
		Persona p = obtenerMayorEdad(array_personas);
		System.out.println("Persona mayor_edad " + p.getNombre());
		int total = Persona.obtenerTotalPersonas();
		System.out.println("TOTAL personas = " + total);
	}//fin del main

}//fin clase
