package Practico_1_persona;
import java.time.LocalDate;

public class Practico_1_Persona {
	
	public static void main(String[] args) {
		Persona p1 = new Persona(43512842, "Valentin", "Caminos", LocalDate.of(2001,8,23));
		Persona p2 = new Persona(43512842, "Valentin", "Caminos", LocalDate.of(2001,8,24));

		//p1.calculoIMC();
		System.out.println(p1.estaEnForma());
		System.out.println(p1.esElCumple());
		System.out.println(p1.esMayorDeEdad());
		System.out.println(p1.getInfo());
	}

}
