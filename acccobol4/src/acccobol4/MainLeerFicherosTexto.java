package acccobol4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectStreamException;
import java.util.ArrayList;

public class MainLeerFicherosTexto {
	
	
	public static ArrayList<String> 
	fichero2Array (String nombre_fichero)
	{
		ArrayList<String> lista = null;
		FileReader fr = null;
		BufferedReader br = null;
		String linea_leida = null;
		
		try {
			
			fr = new FileReader(nombre_fichero);
			br = new BufferedReader(fr);
			linea_leida = br.readLine();
			lista = new ArrayList<String>();
			while (linea_leida != null)
			{
				lista.add(linea_leida);
				linea_leida = br.readLine();
			}
		} 
		catch (Throwable e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("PETó por otra");
		}finally {//esto se ejecuto haya ido bien o no
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
		return lista;
	}
	
	
	public static void main(String[] args) {
		String nombre_fichero = "f1.txt";
		ArrayList<String> lista = 
				fichero2Array(nombre_fichero);
		System.out.println("MOSTRANDO LISTA");
		for (String str:lista)
		{
			System.out.println(str);
		}
		
	}
	
	
	
	/*
	public static void main(String[] args) {
		ArrayList<String> lista = null;
		FileReader fr = null;
		BufferedReader br = null;
		String linea_leida = null;
		
		try {
			
			fr = new FileReader("f1.txt");
			br = new BufferedReader(fr);
			linea_leida = br.readLine();
			lista = new ArrayList<String>();
			while (linea_leida != null)
			{
				System.out.println(linea_leida);
				lista.add(linea_leida);
				linea_leida = br.readLine();
			}
		} 
		catch (Throwable e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("PETó por otra");
		}finally {//esto se ejecuto haya ido bien o no
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
*/
}
