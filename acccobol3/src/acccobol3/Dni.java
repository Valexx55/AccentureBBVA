package acccobol3;

public class Dni {
	
	private static final String CARACTERES_DNI="TRWAGMYFPDXBNJZSQVHLCKE";
	
	
	public static char calcularLetraDni (String dni)
	{
		char letra = '0';
		
			int n_dni = Integer.parseInt(dni);//CASTING
			int resto = (n_dni%23);
			letra = CARACTERES_DNI.charAt(resto);
			
		return letra;
	}
	public static void main(String[] args) {
		/*Dni dni1 = new Dni();
		Dni dni2 = new Dni();*/
		
		char letra1 = Dni.calcularLetraDni("53130984");
		//char letra2 = dni2.calcularLetraDni("53130984");
		
		System.out.println("LETRA 1 = " + letra1);
		//System.out.println("LETRA 2 = " + letra2);
		
	}
	
	

}
