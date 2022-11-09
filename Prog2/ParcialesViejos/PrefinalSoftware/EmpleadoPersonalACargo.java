package PrefinalSoftware;

import java.util.ArrayList;
import java.util.Collections;


public class EmpleadoPersonalACargo extends ElementoEmpleado {
	private int aniosAntiguedad;
	private ArrayList<ElementoEmpleado>elementos;
	
	public EmpleadoPersonalACargo(String nombre, String apellido, int edad,int aniosAntiguedad) {
		super(nombre,apellido,edad);
		this.aniosAntiguedad = aniosAntiguedad;
		this.elementos = new ArrayList<>();
	}

	@Override
	public double getSueldo(Programador p) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList<String> getEspecialidades() {
		ArrayList<String>especialidades = new ArrayList<>();
		for(ElementoEmpleado e:elementos) {
			ArrayList<String>aux = e.getEspecialidades();
			for(String s:aux) {
				if(!especialidades.contains(s)) {
					especialidades.add(s);
				}
			}
		}
		return especialidades;	
	}

	@Override
	public ArrayList<ElementoEmpleado> getEmpleados() {
		ArrayList<ElementoEmpleado>empleados = new ArrayList<ElementoEmpleado>();
		empleados.add(this);
		for(ElementoEmpleado e:empleados) {
			empleados.addAll(e.getEmpleados());
		}
		Collections.sort(empleados);
		return empleados;
	}

	@Override
	public int getCantEmpleados() {
		int sum = 0;
		for(ElementoEmpleado e:elementos) {
			sum+= e.getCantEmpleados();
		}
		return sum;
	}



}
