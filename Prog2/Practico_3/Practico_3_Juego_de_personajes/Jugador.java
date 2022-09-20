package Practico_3_Juego_de_personajes;

import java.util.ArrayList;

public class Jugador {

	private ArrayList<Personaje>personajes;
	
	public Jugador() {
		this.personajes = new ArrayList<Personaje>();
	}
	
	public void añadirPersonaje(Personaje p1) {
		this.personajes.add(p1);
	}
	
	public Personaje seleccionarPersonaje(String caracteristica) {
		if(this.personajes.size()>0) {
			Personaje mejor = new Personaje();
			for(int i = 0; i<personajes.size();i++) {
	//			this.personajes.get(i).ge
			}
		}
		return null;
	}

}
