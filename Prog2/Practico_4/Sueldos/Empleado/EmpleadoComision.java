package Sueldos.Empleado;


//Sueldo fijo + % de ventas realizados
public class EmpleadoComision extends Empleado {
	private int ventas;
	private double porcentaje;
	
	public EmpleadoComision(String nombre, long dni, double porcentaje) {
		super(nombre, dni);
		this.ventas = 0;
		this.porcentaje = porcentaje;
	}
	
	public void agregarVentas(int ventas) {
		this.ventas += ventas;
	}
	
	public int getVentas() {
		return ventas;
	}

	public double getPorcentaje() {
		return porcentaje;
	}

	public void setPorcentaje(double porcentaje) {
		this.porcentaje = porcentaje;
	}

	@Override
	public double cuantoCobra() {
		return MONTOFIJO + (this.getPorcentaje()/100*this.getVentas());
	}
}
