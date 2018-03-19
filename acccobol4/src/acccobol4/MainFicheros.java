package acccobol4;

import java.io.File;
import java.io.IOException;

public class MainFicheros {
	
	public static void main(String[] args) {
		File archivo = null;
		archivo = new File("f1.txt");
		//si no existe, lo creo
		//y si existe, lo borro
		if (archivo.exists())
		{
			archivo.delete();
			System.out.println("se borró");
		} else //no existe
			{
				try {
					archivo.createNewFile();
					System.out.println("se creó");
				} 
				catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					//capturo la excepción
					System.out.println("se mete por aquí");
				}
			}
	}

}
