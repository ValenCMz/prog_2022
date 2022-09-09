package Practico_2_Agenda_Personal;

import java.time.LocalDate;
import java.time.LocalTime;

public class Reuniones {
	private String lugar;
	private String participantes;
	private String tema;
	private double duracion;
	private LocalDate fecha;
	private LocalTime hora;
	
	
	public Reuniones(String lugar, String participantes, String tema, double duracion, LocalDate fecha, LocalTime hora) {
		this.lugar = lugar;
		this.participantes = participantes;
		this.tema = tema;
		this.duracion = duracion;
		this.fecha = fecha;
		this.hora = hora;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public LocalTime getHora() {
		return hora;
	}

	public void setHora(LocalTime hora) {
		this.hora = hora;
	}
	
	
}
