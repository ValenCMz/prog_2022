package RegistroEmpresa;

import java.util.ArrayList;

import RegistroEmpresa.PersonaAsociada.PersonaAsociada;

public class Empresa {
	private ArrayList<PersonaAsociada>personas;
	
	public Empresa() {
		this.personas = new ArrayList<PersonaAsociada>();
	}
	
	public String getListadoPersonas() {
		String listado = "";
		for(PersonaAsociada i : personas) {
			listado += "Cargo: " + i.getCargoDeLaPersona()+ "Nombre: " +  i.getNombre()+ "Apellido: " +  i.getApellido()+ "Edad: " + i.getEdad() + "\n";
		}
		return listado;
	}
}
