package AlarmaSensorial;

public class Luz {
	private boolean luz;
	
	public Luz() {
		super();
		this.luz = false;
	}

	public boolean isLuz() {         
		return luz;
	}

	public void setLuz(boolean luz) {
		this.luz = luz;
	}
	
	private void encenderLuz() {
		this.setLuz(true);
	}
	private void apagarLuz() {
		this.setLuz(false);
	}
	
	public boolean prenderLuz() {
		this.encenderLuz();
		return true;
	}
	
}
