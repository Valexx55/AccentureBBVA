package acccobol3;

class Prueba {

	public int calcula() 
	{
		return 1 + 1;
	}

	public static void main(String[] argumentos) {
		// Prueba.calcula();
		Prueba prueba = new Prueba();
		int calculo = prueba.calcula();
		System.out.println(calculo);
	}
}
