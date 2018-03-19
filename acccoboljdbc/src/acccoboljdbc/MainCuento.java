package acccoboljdbc;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class MainCuento {

	public static void generarCuento(String nfp) {
		Properties properties = null;
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter = null;
		String start, body, end, outfile = null;

		try {
			// CARGO PROPIEDADES
			properties = new Properties();
			properties.load(new FileReader(nfp));
			// LAS LEO
			body = properties.getProperty("body");
			start = properties.getProperty("start");
			end = properties.getProperty("end");
			outfile = properties.getProperty("outfile");
			// ESCRIBIR FICH SALIDA
			fileWriter = new FileWriter(outfile);
			bufferedWriter = new BufferedWriter(fileWriter);
			bufferedWriter.write(start + System.lineSeparator()+ body + "\n" + end);
		} catch (Exception e) 
		{
			e.printStackTrace();
		} finally 
		{
			try 
				{
				// cierro libero recursos
				bufferedWriter.close();
				} catch (IOException e) 
				{
				// TODO Auto-generated catch block
				e.printStackTrace();
				}
		}
	}

	public static void main(String[] args) {
		String idioma = args[0];
		String nfp = "story_"+idioma.toLowerCase()+".properties";
		generarCuento(nfp);
		
		
		
		/*switch (idioma) {
		case "ES":
			System.out.println("ESPAÑOL");
			generarCuento("story_es.properties");
			break;
		case "IT":
			System.out.println("ITALIANO");
			generarCuento("story_it.properties");
			break;
		case "EN":
			System.out.println("INGLÉS");
			generarCuento("story_en.properties");
			break;
		default:
			System.out.println("NO SE SABE");
			break;
		}*/
	}
}
