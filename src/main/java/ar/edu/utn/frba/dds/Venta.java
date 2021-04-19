package ar.edu.utn.frba.dds;

import java.time.LocalDate;
import java.util.List;

public abstract class Venta {

	protected List<Item> items;
	protected LocalDate fecha;
	
	public Venta(List<Item> items, LocalDate fecha) {
		this.items = items;
		this.fecha = fecha;
	}

	protected double importe() {
		return this.getPrecioItems() + this.getRecargo();
	}

	protected double getPrecioItems() {
		return this.items.stream().mapToDouble(item -> item.importe()).sum();
	}
	
	protected abstract double getRecargo();

	public LocalDate getFecha() {
		return fecha;
	}
	
}
