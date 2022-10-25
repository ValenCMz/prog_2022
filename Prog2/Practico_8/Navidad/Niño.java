package Navidad;

public class Niño {
	private int dni;
	
	public Niño(int dni) {
		this.dni = dni;
	}
	
	public int getDni() {
		return this.dni;
	}
	
	@Override
	public boolean equals(Object obj) {
		try {
			Niño ninio = (Niño)obj;
			return ninio.getDni() == this.getDni();
		}catch(Exception e) {
			return false;
		}
	}
}
