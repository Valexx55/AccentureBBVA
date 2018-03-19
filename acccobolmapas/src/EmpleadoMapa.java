import java.sql.Date;

//Defino el orden natural, 
//implementando Comparable
public class EmpleadoMapa implements Comparable<EmpleadoMapa> {
	
	private int id;
	private String nombre;
	private double salario;
	private Date fecha_contratacion;
	
	
	public Date getFecha_contratacion() {
		return fecha_contratacion;
	}

	public void setFecha_contratacion(Date fecha_contratacion) {
		this.fecha_contratacion = fecha_contratacion;
	}

	public void subirSalario (double nuevo_salario) throws SalarioException
	{
		SalarioException se = new SalarioException();
		throw se;
	}
	
	/**
	 * si this es mayor, devuelvo un nº positivo
	 * si this es menor, devuelvo un nº negativo
	 * si son iguales, devuelvo 0
	 */
	@Override
	public int compareTo(EmpleadoMapa o) {
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
				+ " Salario = " + this.salario + " FECHA " +this.fecha_contratacion;
	}
	
	public EmpleadoMapa()
	{
		this.id = 5;
	}
	
	public EmpleadoMapa(int id, String nombre, double salario, Date fecha) {
		//super();
		this.id = id;
		this.nombre = nombre;
		this.salario = salario;
		this.fecha_contratacion = fecha;
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
