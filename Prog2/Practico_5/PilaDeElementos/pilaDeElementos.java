package PilaDeElementos;

import java.util.ArrayList;

public class pilaDeElementos {
	ArrayList<Object>elementos;
	
	public pilaDeElementos() {
		this.elementos = new ArrayList<>();
	}
	
	public void push(Object o) {
		elementos.add(o);
	}
	
	public void pop() {
		int i = elementos.size() - 1;
		elementos.remove(i);
	}
	
	public int top() {
		return elementos.size()-1;
	}
	
	public int size() {
		return elementos.size();
	}
	
	public ArrayList<Object> copy(){
		return new ArrayList<Object>(elementos);
	}
	
	public ArrayList<Object> reverse(){
		ArrayList<Object> reverse = new ArrayList<>();
		for(int i = elementos.size()-1; i>=0 ;i--) {
			reverse.add(elementos.get(i));
		}
		return reverse;
	}

}
