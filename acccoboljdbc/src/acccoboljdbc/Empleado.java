package acccoboljdbc;


//Defino el orden natural, 
//implementando Comparable
public class Empleado implements Comparable<Empleado> {
	
	private int id;
	private String nombre;
	private double salario;
	
	/**
	 * si this es mayor, devuelvo un nº positivo
	 * si this es menor, devuelvo un nº negativo
	 * si son iguales, devuelvo 0
	 */
	@Override
	public int compareTo(Empleado o) {
		int ndev = 0;
			//ndev = (int)(o.salario-this.salario);
			ndev = this.nombre.compareTo(o.nombre);
		return ndev;
	}
	
	/*
	@Override
	public boolean equals(Object obj) {
		boolean soniguales = false;
		
			Empleado e = (Empleado)obj;
			if (e.getId()==this.getId())
			{
			//	if (e.getSalario()==this.getSalario())
			//	{
				//	if (e.getNombre().equals(this.getNombre()))
					//		{
							soniguales = true;
			//				}
				//}
						
			}
		
		// TODO comparar los empleados y decir si
		//son iguales
		
		return soniguales;
	}*/
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "ID = " + this.id + " Nombre = " 
				+this.nombre 
				+ " Salario = " + this.salario;
	}
	
	public Empleado()
	{
		this.id = 5;
	}
	
	public Empleado(int id, String nombre, double salario) {
		//super();
		this.id = id;
		this.nombre = nombre;
		this.salario = salario;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}

	
	
	

}
