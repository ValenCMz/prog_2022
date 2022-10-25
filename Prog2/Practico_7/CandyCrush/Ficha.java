package CandyCrush;

public class Ficha {
	private int fortaleza;
	private int LugarOcupa;
	private int poderDeDestruccion;
	
	public Ficha(int fortaleza, int lugarOcupa, int poderDeDestruccion) {
		this.fortaleza = fortaleza;
		this.LugarOcupa = lugarOcupa;
		this.poderDeDestruccion = poderDeDestruccion;
	}

	public int getFortaleza() {
		return fortaleza;
	}

	public int getLugarOcupa() {
		return LugarOcupa;
	}

	public int getPoderDeDestruccion() {
		return poderDeDestruccion;
	}
	
	
}
