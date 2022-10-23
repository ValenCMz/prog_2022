package SistemaElectoral;

import java.util.ArrayList;

import SistemaElectoral.Filtros.Filtro;

public class EstablecimientoEducativo extends Establecimiento{
	private ArrayList<Establecimiento>mesas;
	
	public EstablecimientoEducativo() {
		this.mesas = new ArrayList<>();
	}
	
	//tambien son iguales, se podrian juntar?
	
	@Override
	public double getPorcDeVotosPorCandidato(Filtro f1) {
		double res = 0;
		for(Establecimiento e : mesas) {
			res += e.getPorcDeVotosPorCandidato(f1);
		}
		return res;
	}
	
	@Override
	public double getPorcDeVotosEnBlanco(Filtro f1) {
		double res = 0;
		for(Establecimiento e:mesas) {
			res += e.getPorcDeVotosEnBlanco(f1);
		}
		return res;	
	}
	
	@Override
	public double getPorcDeVotosEntreHorarios(Filtro f1) {
		double res = 0;
		for(Establecimiento e:mesas) {
			res += e.getPorcDeVotosEnBlanco(f1);
		}
		return res;	
	}
	
	
	//este no es igual
	@Override
	public double getCantidadDeVotosEmitidos() {
		double res = 0;
		for(Establecimiento e:mesas) {
			res += e.getCantidadDeVotosEmitidos();
		}
		return res;	
	}
}
