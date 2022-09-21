package Alarma;

public class Alarma {
	private boolean seRompioVidrio;
	private boolean seAbrioPuertaOVentana;
	private boolean movimientoEnDomicilio;
	private AlarmaLuminosa alarma;
	
	public Alarma() {
		this.seRompioVidrio = false;
		this.movimientoEnDomicilio = false;
		this.seAbrioPuertaOVentana = false;
	}
	
	public Alarma(boolean seRompioVidrio) {
		this.seRompioVidrio = seRompioVidrio;
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

	public boolean comprobar() {
		if(this.isSeAbrioPuertaOVentana()||this.isSeRompioVidrio()||this.isMovimientoEnDomicilio()) {
			return this.alarma.activar();
		}
		else {
			return false;
		}
	}
}
