package SistemaDeAlquiler;

import java.util.ArrayList;

public class SistemaUnificadoDeAlquiler {
	private ArrayList<Item>items;
	private ArrayList<Cliente>clientes;
	
	public SistemaUnificadoDeAlquiler() {
		this.items = new ArrayList<>();
		this.clientes = new ArrayList<>();
	}
	
	public boolean alquilarItem(Item item, Cliente cliente) {
		if(item.sePuedeAlquilar()) {
			cliente.alquilarItem(item);
			item.actualizar();
			return true;
		}
		else {
			return false;
		}
	}
	
	public ArrayList<Item> itemsAlquiladosPorCliente(Cliente cliente){
		return cliente.getItemsAlquilados();
	}
}
