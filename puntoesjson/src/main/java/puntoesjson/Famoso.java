package puntoesjson;

public class Famoso {
	
	private String nombre;
	private boolean super_famoso;
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "NOMBRE " + this.nombre + " SFAMOSO " + this.super_famoso;
	}
	public Famoso() {
		super();
	}
	public Famoso(String nombre, boolean super_famoso) {
		super();
		this.nombre = nombre;
		this.super_famoso = super_famoso;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public boolean isSuper_famoso() {
		return super_famoso;
	}
	public void setSuper_famoso(boolean super_famoso) {
		this.super_famoso = super_famoso;
	}
	
	

}
