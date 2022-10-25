package CandyCrush;

public class FichaEspecial extends Ficha{

	public FichaEspecial(int fortaleza, int lugarOcupa, int poderDeDestruccion) {
		super(fortaleza, lugarOcupa, poderDeDestruccion);
	}
	
	public int getPoderDeDestruccion() {
		return this.getFortaleza()/this.getLugarOcupa();
	}
	
}
