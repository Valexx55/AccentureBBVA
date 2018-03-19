
public class DepartmentMapa {
	
	private int id;
	private String nombre;

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 1;
	}
	
	@Override
	public boolean equals(Object obj) {
		DepartmentMapa d = (DepartmentMapa)obj;
		return ((this.id == d.id)&&(d.nombre.equals(this.nombre)));
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.id + " " +this.nombre;
	}
	
	public DepartmentMapa(int id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	

}
