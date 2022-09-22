package AlarmaSensorial;

public class Sensor {
	private String nombreZona;
	private boolean seRompioVidrio;
	private boolean seAbrioPuertaOVentana;
	private boolean movimientoEnDomicilio;
	
	public Sensor(String nombreZona) {
		this.nombreZona = nombreZona;
		this.seRompioVidrio = false;
		this.movimientoEnDomicilio = false;
		this.seAbrioPuertaOVentana = false;
	}
	
	public String getNombreZona() {
		return this.nombreZona;
	}
	
	public boolean isSeRompioVidrio() {
		return seRompioVidrio;
	}

	public void setSeRompioVidrio(boolean seRompioVidrio) {
		this.seRompioVidrio = seRompioVidrio;
	}

	public boolean isSeAbrioPuertaOVentana() {
		return seAbrioPuertaOVentana;
	}

	public void setSeAbrioPuertaOVentana(boolean seAbrioPuertaOVentana) {
		this.seAbrioPuertaOVentana = seAbrioPuertaOVentana;
	}

	public boolean isMovimientoEnDomicilio() {
		return movimientoEnDomicilio;
	}

	public void setMovimientoEnDomicilio(boolean movimientoEnDomicilio) {
		this.movimientoEnDomicilio = movimientoEnDomicilio;
	}

	@Override
	public boolean equals(Object obj) {
		try{
			Sensor s1 = (Sensor)obj;
			return this.getNombreZona().equals(s1.getNombreZona());
		}
		catch(Exception e) {
			return false;
		}	
		
	}
	
}
