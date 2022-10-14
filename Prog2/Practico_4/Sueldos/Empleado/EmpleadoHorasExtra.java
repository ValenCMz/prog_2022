package Sueldos.Empleado;

//Salario fijo semanal + monto
public class EmpleadoHorasExtra extends Empleado {
	private static final double MONTOEXTRA = 400;
	private int horas;
	
	public EmpleadoHorasExtra(String nombre, long dni) {
		super(nombre, dni);
		this.horas = 0;
	}
	
	public void setHoras(int horas) {
		this.horas += horas;
	}
	
	@Override
	public double cuantoCobra() {
		return MONTOFIJO + (MONTOEXTRA * this.horas);		
	}
}
