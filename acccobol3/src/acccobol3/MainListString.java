package acccobol3;

import java.util.ArrayList;
import java.util.Scanner;

public class MainListString {
	
	private static final String PALABRA_FIN = "FIN";
	
	private static String getPalabra ()
	{
		String str_dev = null;
		Scanner scanner = null;
		
			System.out.println("Dame palabra");
			scanner = new Scanner(System.in);
			str_dev = scanner.nextLine();
		
		return str_dev;
	}
	
	private static boolean esPalabraFin (String f)
	{
		boolean b = false;
		
			b = f.toUpperCase().equals(PALABRA_FIN);
		
		return b;
	}
	
	private static void mostrarLista (ArrayList<String> lp)
	{
		for (String cad : lp)
		{
			System.out.println(cad);
		}
	}
	
	public static void main(String[] args) {
		//me quiero crear una lista de strings
		//que el usuario va introduciendo por teclado
		//hasta que meta "fin" o "FIN"
		ArrayList<String> l_palabras = null;
		l_palabras = new ArrayList<String>();
		String palabra = null;
		boolean fin = false;
		do {
			palabra = getPalabra();
			fin = esPalabraFin(palabra);
			l_palabras.add(palabra);
		} while (!fin);
		l_palabras.remove(l_palabras.size()-1);
		mostrarLista(l_palabras);
		
	}

}
