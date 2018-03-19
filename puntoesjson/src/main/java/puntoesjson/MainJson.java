package puntoesjson;

import com.google.gson.Gson;

public class MainJson {
	
	
	public static void main(String[] args) {
		
		Famoso famoso = new Famoso("Los Javis", false);
		
		//vamos a pasarlo a JSON
		Gson gson = new Gson();
		String str_json = gson.toJson(famoso);//serializar
		System.out.println(str_json);
		
		//vamos a Deserializarlo
		Famoso famoso2 = gson.fromJson(str_json, Famoso.class);
		System.out.println(famoso2);
		
		
		
		
		
		
		
		
	}

}
