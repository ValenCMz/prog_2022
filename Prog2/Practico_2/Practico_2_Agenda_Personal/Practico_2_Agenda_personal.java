package Practico_2_Agenda_Personal;

import java.time.LocalDate;
import java.time.LocalTime;

public class Practico_2_Agenda_personal {

	public static void main(String[] args) {
		Agenda a1 = new Agenda();
		Reuniones r1 = new Reuniones("Tandil", "Juan Manuel y Barbara", "Encapsulamiento", 3, LocalDate.of(2022, 8, 28), LocalTime.of(11, 12));
		Reuniones r2 = new Reuniones("Tandil", "Juan Manuel y Barbara", "Encapsulamiento", 3, LocalDate.of(2022, 8, 28), LocalTime.of(11, 12));
		Reuniones r3 = new Reuniones("Tandil", "Juan Manuel y Barbara", "Encapsulamiento", 3, LocalDate.of(2022, 8, 26), LocalTime.of(11, 12));

		a1.addReunion(r1);
		a1.addReunion(r2);
		a1.addReunion(r3);


	}

}
