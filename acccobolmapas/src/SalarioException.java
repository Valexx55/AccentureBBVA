
public class SalarioException extends Exception{
	
	public SalarioException() {
		// TODO Auto-generated constructor stub
		super();
		
	}
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Has superado el salario máximo";
	}
	
	

}
