package Tema1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import Filtro.Filtro;

public class Empresa {
	//en este caso la empresa tiene un criterio default, va a cambiar dependiendo el periodo(la politica puede cambiar a futuro, con un set)
	private Comparator<Vendedor>comparador;
	private ArrayList<Vendedor>vendedores;

	//el q arma la empresa decide como se van a ordenar, cuando lo arma
	public Empresa(Comparator<Vendedor>comparador) {
		this.comparador = comparador;
		this.vendedores = new ArrayList<>();
	}
	
	public void addVendedor(Vendedor v) {
		this.vendedores.add(v);
	}
	
	//a la lista de vendedores vamos a ordenar dependiendo el criterio q la empresa tiene para generar el ranking
	//aca es donde puedo cambiar en tiempo de ejecucion ya que el criterio llega por parametro
	public ArrayList<Vendedor> armarRanking() {
		ArrayList<Vendedor>ranking = new ArrayList<>(vendedores);
		Collections.sort(ranking, this.comparador);
		return ranking;
	}
	
	public ArrayList<Vendedor> buscar(Filtro f){
		ArrayList<Vendedor>cumple = new ArrayList<>();
		for(Vendedor vendedor:vendedores) {
			if(f.cumple(vendedor)) {
				cumple.add(vendedor);
			}
		}
		Collections.sort(cumple);//si no le paso un comparador usa el ComparableTo de vendedor en este caso
		return cumple;
	}

	public Comparator<Vendedor> getComparador() {
		return comparador;
	}

	public void setComparador(Comparator<Vendedor> comparador) {
		this.comparador = comparador;
	}

	public void setVendedores(ArrayList<Vendedor> vendedores) {
		this.vendedores = vendedores;
	}


}
