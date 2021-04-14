package ar.edu.utn.frba.dds;

import java.time.LocalDate;
import java.util.List;

public class Venta {

	private List<Prenda> prendasVendidas;
	private LocalDate fecha;
	private TipoPago tipoPago;

	public Venta(List<Prenda> prendasVendidas, LocalDate fecha, TipoPago tipoPago) {
		this.prendasVendidas = prendasVendidas;
		this.fecha = fecha;
		this.tipoPago = tipoPago;
	}

	public double calcularGanancia() {
		return this.tipoPago.calcularGanancia(this);
	}

	public List<Prenda> getPrendasVendidas() {
		return prendasVendidas;
	}

	public void setPrendasVendidas(List<Prenda> prendasVendidas) {
		this.prendasVendidas = prendasVendidas;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public TipoPago getTipoPago() {
		return tipoPago;
	}

	public void setTipoPago(TipoPago tipoPago) {
		this.tipoPago = tipoPago;
	}

}
