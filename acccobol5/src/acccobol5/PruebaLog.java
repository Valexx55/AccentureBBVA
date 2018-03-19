package acccobol5;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.log4j.Logger;

public class PruebaLog {
	
	private final static Logger log = Logger.getLogger("mylog");

	
	public static void main(String[] args) {
		Persona p = null;
		try {
			p = new Persona("VALE", "33", 28);
			//String str_persona = p.toString();
			//System.out.println(str_persona);
			FileReader fw = new FileReader("f");
			//FileWriter fw = new FileWriter("f4");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			log.error("Error tratando la persona " +
			p, e);//
			/**
			 * void org.apache.log4j.Category.error(Object message, Throwable t)
			 */
		}
		
	}
}
