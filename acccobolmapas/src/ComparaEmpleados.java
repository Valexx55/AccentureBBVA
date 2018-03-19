

import java.util.Comparator;

public class ComparaEmpleados implements Comparator<EmpleadoMapa> {

	@Override
	public int compare(EmpleadoMapa o1, EmpleadoMapa o2) {
		int ndev = 0;
		
		ndev = (int)(o1.getSalario()-o2.getSalario());
		
		return ndev;
	}

}
