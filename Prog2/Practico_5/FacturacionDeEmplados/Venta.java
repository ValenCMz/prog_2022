package FacturacionDeEmplados;

public class Venta {
	private Empleado empleado; //la venta esa asignada a un empleado en particular
	private double valor;
	private double porcVenta;
	
	public Venta(Empleado empleado, double valor, double porcVentas) {
		this.empleado = empleado;
		this.valor = valor;
		this.porcVenta = porcVentas;
	}

	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public double getPorcVenta() {
		return porcVenta;
	}
	
	
}
