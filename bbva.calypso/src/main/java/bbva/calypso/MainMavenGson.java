package bbva.calypso;

import com.google.gson.Gson;

public class MainMavenGson {
	
	public static void main(String[] args) {
		
		Persona p = new Persona("JULIO", "74-Z", 5);
		
		Gson objeto_gson = new Gson();
		String str_json = objeto_gson.toJson(p);
		
		System.out.println(str_json);
		Persona p1 = objeto_gson.fromJson
				(str_json, Persona.class);
		
	
	}

}
