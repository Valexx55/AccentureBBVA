package acccobol4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class MainEscribirFicheros {
	
	public static final String EXTENSION = ".json";
	
	public static void lista2Fichero 
	(ArrayList<String> lista, String nombre_fichero)
	{
		//TODO escribir la lista en el fichero
	}
	
	public static void mostrarList (ArrayList<String> lista)
	{ 
		for (String cadena : lista)
		{
			System.out.println(cadena);
		}
		
	}
	
	public static void main(String[] args) {
		FileWriter fw=  null;
		BufferedWriter bw = null;
		
		try 
		{
			fw = new FileWriter("salida.txt", true);
			bw = new BufferedWriter(fw);
			bw.write("Hola chicas");
			bw.newLine();
		} 
		catch (Exception e) 
		{
			
		}finally 
		{
			try 
			{
				bw.close();
			} catch (IOException e) 
			{
				e.printStackTrace();
			}
		}
	}

}
