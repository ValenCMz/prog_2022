package PrefinalSoftware;

import java.util.ArrayList;

public class Programador extends ElementoEmpleado{
	private ArrayList<String>especialidades;
	//private TipoCobro tipo;
	private int horasExtras;

	public Programador(String nombre, String apellido, int edad, int horasExtras) {
		super(nombre,apellido,edad);
		this.especialidades = new ArrayList<>();
	//	this.tipo = tipo;
		this.horasExtras = horasExtras;
	}
	
	public ArrayList<String>getEspecialidades(){
		return new ArrayList<>(this.especialidades);
	}
	
	public ArrayList<ElementoEmpleado>getEmpleados(){
		ArrayList<ElementoEmpleado>empleados=new ArrayList<>();
		empleados.add(this);
		return empleados;
	}

	@Override
	public double getSueldo(Programador p) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getCantEmpleados() {
		return 1;
	}
	
	

}
