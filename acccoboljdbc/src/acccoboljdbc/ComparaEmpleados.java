package acccoboljdbc;

import java.util.Comparator;

public class ComparaEmpleados implements Comparator<Empleado> {

	@Override
	public int compare(Empleado o1, Empleado o2) {
		int ndev = 0;
		
		ndev = (int)(o1.getSalario()-o2.getSalario());
		
		return ndev;
	}

}
