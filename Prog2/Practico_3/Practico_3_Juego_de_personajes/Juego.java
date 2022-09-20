package Practico_3_Juego_de_personajes;

import java.util.ArrayList;

public class Juego {
	private ArrayList<Jugador>jugadores;
	private ArrayList<Jugador>tablaDePosiciones;
	
	public Juego() {
		this.jugadores = new ArrayList<Jugador>();
		this.tablaDePosiciones = new ArrayList<Jugador>();
	}
	
	public void jugar() {
		//declaro 2 jugadores
			//jugador1
			//jugador2
		
		//se sortea una cualidad
		//al jugador1 se le dice q saque una carta de su mazo
		//al jugador2 se le dice q saque una carta de su mazo
		
		//(!se compara carta.jugador1.equals(carta.jugador2))
				//se compara cual es mayor, dependiendo la cualidad
					//gana el mayor
		
		//son iguales las cartas(empate)
			//se sortea una cualidad nueva
			//si es igual a la anterior
				//termina en empate
			//si no
				//se compara cual es mayor, dependiendo la cualidad
				//gana el mayor
	}

}






