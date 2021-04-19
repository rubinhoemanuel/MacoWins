package ar.edu.utn.frba.dds;

public class Item {

	private Prenda prenda;
	private int cantidad;
	
	public Item(Prenda prenda, int cantidad) {
		this.prenda = prenda;
		this.cantidad = cantidad;
	}
	
	public double importe() {
		return this.prenda.getPrecio() * this.cantidad;
	}
	
}
