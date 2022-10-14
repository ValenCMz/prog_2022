package CooperativaDeCereales;

public class CerealPastura extends Cereal{
	private int minHectareas;
	public CerealPastura(String nombre, int minHectaereas) {
		super(nombre);
		this.minHectareas = minHectaereas;
	}

	@Override
	public boolean cerealCumple(Lote lote) {
		return super.cerealCumple(lote) && (lote.getSuperficie()>this.minHectareas);
	}
	

	
}
