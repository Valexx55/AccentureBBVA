

public class Persona {
	
	//BEANS JAVABEANS Plain Old Java Object
	
	private String nombre;
	private String dni;
	private int edad;
	private int id;
	
	private static int contador_personas;
	
	
	
	@Override
	public boolean equals(Object obj) {
		boolean iguales = false;
		
			if (obj instanceof Persona)
			{
				Persona p = (Persona)obj;
				if (p!=null)
				{
					iguales = (p.edad==this.edad) 
							&& (p.nombre.equals(this.nombre)) 
							&& (p.dni.equals(this.dni)); 
				}
			}
			
		
		
		return iguales;
	}
	
	public void actualizarContador()
	{
		contador_personas++;
	}
	
	public Persona(){}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public static int obtenerTotalPersonas ()
	{
		return contador_personas;
	}
	
	public void mostrarPersona()
	{
		System.out.println("NOMBRE " + this.nombre);
		System.out.println("DNI " +this.dni);
		System.out.println("EDAD " +this.edad);
		System.out.println("ID " +this.id);
		//System.out.println("TOTAL_PERSONAS = " +contador_personas);
	}
	
	
	public Persona(String nombre, String dni, int edad) {
		contador_personas++;
		this.id = contador_personas;
		this.nombre = nombre;
		this.dni = dni;
		this.edad = edad;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	@Override
	public String toString() {
		String str_persona = null;
		
			str_persona = this.dni + " "+ this.edad + " "+this.nombre;
		
		return str_persona;
	}
	
	
	
	

}
