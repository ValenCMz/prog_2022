package SistemaElectoral.Comparadores;

import java.util.Comparator;
import SistemaElectoral.Candidato;

public class ComparadorCompuesto implements Comparator<Candidato>{
	private Comparator<Candidato>com1;
	private Comparator<Candidato>com2;
	private Comparator<Candidato>com3;
	
	public ComparadorCompuesto(Comparator<Candidato>com1,Comparator<Candidato>com2,Comparator<Candidato>com3) {
		this.com1 = com1;
		this.com2 = com2;
		this.com3 = com3;
	}
	
	@Override
	public int compare(Candidato o1, Candidato o2) {
		int res = com1.compare(o1, o2);
		if(res==0) {
			res = com2.compare(o1, o2);
			if(res==0) {
				res = com3.compare(o1, o2);
			}
		}
		return res;
	}
}
