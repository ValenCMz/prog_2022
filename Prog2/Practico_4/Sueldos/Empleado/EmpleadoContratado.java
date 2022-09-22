package Sueldos.Empleado;

//Salario fijo semanal
public class EmpleadoContratado extends Empleado{
	
	public EmpleadoContratado(String nombre, long dni) {
		super(nombre, dni);
	}
	
	@Override
	public double cuantoCobra() {
		return MONTOFIJO;
	}
}
