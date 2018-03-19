package acccobol2;

import acccobol1.Clase1;

public class Principal {
	
	//calcular el IMC
	
	//1 Recoger los valores
		//1.1 Pedir el peso
		//1.2 Pedir estatura
	
	//2 Calcular el IMC con el peso y la altura
	
	//3 Informar del resultado

	
	
	
	

	public static void main(String[] args) {
		Flujo flujo = new Flujo();
		
		int n_leido = Clase1.leerNumero();
		if (n_leido < 18) {
			System.out.println("Menor de edad");
		} else if (n_leido > 65) {
			System.out.println("Jubilao");
		} else {
			System.out.println("A currar");
		}
	}//fin del main

}//fin de clase
