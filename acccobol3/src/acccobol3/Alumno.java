package acccobol3;

public class Alumno extends Persona{

	private int nota;
	
	
	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

	public Alumno(String nombre, String dni, int edad) 
	{
		super(nombre, dni, edad);
	}
	
	public Alumno ()
	{
		
	}
	public Alumno(int nota, String nombre, String dni, int edad) 
	{
		super(nombre, dni, edad);
		this.nota = nota;
		this.getDni();
		this.getEdad();
		this.getNombre();
	}

}
