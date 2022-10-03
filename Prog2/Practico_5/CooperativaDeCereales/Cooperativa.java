package CooperativaDeCereales;

import java.util.ArrayList;

public class Cooperativa {
	ArrayList<Cereal>cereales;
	ArrayList<Lote>lotes;
	ArrayList<String>mineralesInteresPrimario;
	
	public Cooperativa() {
		this.cereales = new ArrayList<>();
		this.lotes = new ArrayList<>();
	}
	
	public ArrayList<Cereal> cerealesQuePuedenSembrarseEnLote(Lote lote) {
		ArrayList<Cereal>cerealesQueCumplen = new ArrayList<>();
		for(Cereal cereal : cereales) {
			//tengo q verificar que el cereal pueda ser sembrado en un determinado lote
				//lo mejor a mi criterio es que el lote tenga q verificar que cumpla los requerimientos del cereal
			if(lote.loteCumple(cereal)) {
				cerealesQueCumplen.add(cereal);
			}
		}
		
		if(cerealesQueCumplen.size() != 0) {
			return cerealesQueCumplen;
		}
		else {
			return null;
		}
		
	}
	
	public ArrayList<Lote> lotesPuedeSerUtilizadosParaSembrarUnCereal(Cereal cereal) {
		ArrayList<Lote>lotesQueCumplen = new ArrayList<>();
		for(Lote lote : lotes) {
			if(cereal.cerealCumple(lote)) {
				lotesQueCumplen.add(lote);
			}
		}
		
		if(lotesQueCumplen.size()!=0) {
			return lotesQueCumplen;
		}
		else {
			return null;
		}
	
	}
}
