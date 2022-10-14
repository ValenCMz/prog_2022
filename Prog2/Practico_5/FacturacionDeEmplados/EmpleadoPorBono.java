package FacturacionDeEmplados;

import java.util.ArrayList;

public class EmpleadoPorBono extends Empleado {
	private ArrayList<Venta>ventas;
	private int bonoPorVentas;
	private double porcVentas;

	public EmpleadoPorBono(String nombre, String apellido, long dni, double sueldoMensual,int bonoPorVentas,double porcVentas) {
		super(nombre, apellido, dni, sueldoMensual);
		this.ventas = new ArrayList<Venta>();
		this.bonoPorVentas = bonoPorVentas;
		this.porcVentas=porcVentas;
	}
	
	@Override
	public double getSueldoMensual() {
		double sumaVentas = 0;
		for(Venta venta : ventas) {
			sumaVentas += venta.getValor();
		}
		double sueldo = super.getSueldoMensual() + (sumaVentas*this.porcVentas);
		if(this.ventas.size()>=bonoPorVentas) {
			sueldo+=this.bonoPorVentas;
		}
		return sueldo;
	}
}
