package Empleados;

public class SueldoFijo extends TipoSueldo{
	private int fijo;
	public SueldoFijo(int fijo) {
		this.fijo = fijo;
	}
	
	public int calcSueldo() {
		return this.fijo;
	}

}
