package Futbol5;

import java.time.LocalDate;

public class AlquilerDeCancha {
	private LocalDate fecha;
	private int idCancha;
	private int precio;
	
	public AlquilerDeCancha(LocalDate fecha, int idCancha, int precio) {
		this.fecha = fecha;
		this.idCancha = idCancha;
		this.precio = precio;
	}
	
	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	
	public int getIdCancha() {
		return idCancha;
	}

	public void setIdCancha(int idCancha) {
		this.idCancha = idCancha;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}



	@Override
	public boolean equals(Object obj) {
		try {
			AlquilerDeCancha cancha = (AlquilerDeCancha)obj;
			return this.getIdCancha()==(cancha.getIdCancha());
		}catch(Exception e) {
			return false;
		}
	}
	
}
