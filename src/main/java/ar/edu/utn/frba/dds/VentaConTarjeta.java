package ar.edu.utn.frba.dds;

import java.time.LocalDate;
import java.util.List;

public class VentaConTarjeta extends Venta {

	private int cantidadCuotas;
	private double coeficiente;
	
	public VentaConTarjeta(List<Item> items, LocalDate fecha, int cantidadCuotas, double coeficiente) {
		super(items, fecha);
		this.cantidadCuotas = cantidadCuotas;
		this.coeficiente = coeficiente;
	}

	@Override
	protected double getRecargo() {
		return this.cantidadCuotas * this.coeficiente + this.items.stream().mapToDouble(item -> item.importe() * 0.01).sum();
	}

}
