package Alarma;

public class AlarmaLuminosa extends Alarma {
	private Timbre timbre;
	private Luz luz;
	
	public boolean activar() {
		this.timbre.hacerSonarSeñal();
		this.luz.prenderLuz();
		return true;
	}
}
