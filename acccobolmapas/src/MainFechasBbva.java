import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MainFechasBbva {
	
	public static void main(String[] args) {
		
		//Esto me da una la fecha actual según Calendario Gregoriano (por el idioma (locale) en que estamos)
		Calendar c = Calendar.getInstance();
		System.out.println(c);
		
		//Esto me da la fecha actual. Sólo para representar, no para operar
		Date date_util = new Date();
		System.out.println(date_util);
		
		//Si necesito operar, trasteo en Calendar
		//pej quiero poner la fecha de mañana
		c.set(2018, 2, 17, 12, 0, 0);
		System.out.println(c);
		
		//Y luego lo paso a date así, obteniendo milisegundos
		date_util.setTime(c.getTimeInMillis());
		System.out.println(date_util);
		
		//me voy a mañana
		c.add(Calendar.DATE, 1);
		
		//actualizo fecha
		date_util.setTime(c.getTimeInMillis());
		System.out.println(date_util);
		
		//me voy un mes para atrás
		c.add(Calendar.MONTH, -1);
		
		//actualizo
		date_util.setTime(c.getTimeInMillis());
		System.out.println(date_util);
		
		//obtengo dia
		int dia = date_util.getDate();
		System.out.println("dia from Date " + dia + " (deprecado)");
		
		//obtendo dia mejor
		dia = c.get(Calendar.DATE);
		System.out.println("dia from Calendar " + dia);
	
		//esto no me da el tiempo.Es para leer una fecha de la BD Represento la hora actual nada más
		java.sql.Date fecha_sql = new java.sql.Date(System.currentTimeMillis());
		System.out.println("Date = " + fecha_sql);
		
		//esto además me da la hora, además de la fecha
		java.sql.Timestamp time_stamp = new java.sql.Timestamp(System.currentTimeMillis());
		System.out.println("Date = " + time_stamp);
		

		//para pasar de Strings a Fechas y viceversa
		//Defino formato con SimpleDateFormat --> https://docs.oracle.com/javase/7/docs/api/java/text/SimpleDateFormat.html
		//Ejemplos sencillos --> http://chuwiki.chuidiang.org/index.php?title=SimpleDateFormat
		//Date <-- SimpleDateFormat.Parse (String)
		//String<--SimpleDateFormat.Format (date)
		//Date date;
		try {
			//FORMAT
			Date date = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'").parse("2012-05-20T09:00:00.000Z");
			String formattedDate = new SimpleDateFormat("dd/MM/yyyy, Ka").format(date);
			System.out.println(formattedDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}

}
