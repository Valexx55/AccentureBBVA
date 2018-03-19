package acccobol1;

import java.util.Scanner;

/**
 * Esto es una clase pa' empezar
 * 
 * @since 26-2-18
 * @author Alumno
 * 
 *
 */
public class Clase1 {

	/**
	 * Esta función pide un número al usuario entero y lo devuelve
	 * 
	 * @return el número entero leído por teclado
	 */
	public static int leerNumero() 
	{
		int n_dev = -5;
		Scanner scanner = null;//inicializo el objeto

			System.out.println("Mete un entero!");
			scanner = new Scanner(System.in);
			n_dev = scanner.nextInt();
		// TODO pedir un nº por teclado y devolverlo
		return n_dev;
	}

	public static void main(String[] args) {
		System.out.println("Mi primera APP en JAVA  ");
		int n = leerNumero();
		System.out.println("El user metió " + n);
	
	}
}
