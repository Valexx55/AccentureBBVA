package accinterfaz;

public class MainAjustes {
	
	
	public static void main(String[] args) {
		
		//Object objeto = new AjustesSusana();
		InterfazContabilidad ic = new AjustesSusana();
		boolean resultado = ic.ajustarCuentas(new Cuenta(), new Operacion());
	}

}
