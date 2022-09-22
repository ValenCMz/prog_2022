package AlarmaSensorial;

public class Timbre {
	private boolean señalSonora;
	
	public Timbre() {
		this.señalSonora = false;
	}
	
	public boolean isSeñalSonora() {
		return señalSonora;
	}
	
	public void setSeñalSonora(boolean señalSonora) {
		this.señalSonora = señalSonora;
	}
	
	private void encenderSeñalSonora() {
		this.setSeñalSonora(true);
	}
	private void apagarSeñalSonora() {
		this.setSeñalSonora(false);
	}
	
	public boolean hacerSonarSeñal() {
		this.encenderSeñalSonora();
		return true;
	}
}
