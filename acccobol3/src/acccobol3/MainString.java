package acccobol3;

public class MainString {
	
	private static boolean esPar (String palabra)
	{
		boolean ppar = false;
			ppar = (palabra.length()%2 == 0);
		return ppar;
	}
	
	public static void main(String[] argumentos) {
//		for (String cad :argumentos)
//		{
//			if (esPar (cad))
//			{
//				System.out.println(cad);
//			}
//		}
		
		String nombre1 = "PEPE";
		String nombre2 = "CONCHI";
		
		int lon1 = nombre1.length();
		int lon2 = nombre2.length();
		
		System.out.println("LONG1 " + lon1);
		System.out.println("LONG2 " + lon2);
		
		
	}

}
