package Practico_2_Agenda_Personal;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Agenda {
	ArrayList<Reuniones>reuniones;
	ArrayList<Asistentes>asistentes;
	
	public Agenda() {
		this.reuniones = new ArrayList<Reuniones>();
		this.asistentes = new ArrayList<Asistentes>();
	}
	
//	Agregar reunion a la agenda
	public void addReunion(Reuniones r1) {
		boolean hayConflicto = false;
		for(int i = 0; i < reuniones.size(); i++) {//recorro todas las reuniones
			if(this.reuniones.get(i).getFecha().equals(r1.getFecha()) || 
					(this.reuniones.get(i).equals(r1.getHora()))) {
				System.out.println("Ya tiene ocupada el dia ");
				hayConflicto = true;
			}
		}
		if(!hayConflicto) {
			this.reuniones.add(r1);
			System.out.println("Reunion registrada");
		}
		
	}

}
