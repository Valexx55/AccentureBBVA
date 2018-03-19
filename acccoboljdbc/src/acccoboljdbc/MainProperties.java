package acccoboljdbc;

import java.io.FileReader;
import java.util.Properties;

import oracle.net.aso.p;

public class MainProperties {
	
	public static void main(String[] args) {
		
		try{
			Properties prop = new Properties();
			prop.load(new FileReader("param.properties"));
			String valor = prop.getProperty("dir_serv");
			System.out.println(valor);
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

}
