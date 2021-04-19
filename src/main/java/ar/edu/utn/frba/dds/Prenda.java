package ar.edu.utn.frba.dds;

public class Prenda {

	private double precioPropio;
	private EstadoPrenda estado;
	private TipoPrenda tipo;

	public Prenda(double precioPropio, EstadoPrenda estado, TipoPrenda tipo) {
		this.precioPropio = precioPropio;
		this.estado = estado;
		this.tipo = tipo;
	}

	public double getPrecio() {
		return estado.getPrecio(this.precioPropio);
	}

	public double getPrecioPropio() {
		return precioPropio;
	}

	public void setPrecioPropio(double precioPropio) {
		this.precioPropio = precioPropio;
	}

	public EstadoPrenda getEstado() {
		return estado;
	}

	public void setEstado(EstadoPrenda estado) {
		this.estado = estado;
	}

	public TipoPrenda getTipo() {
		return tipo;
	}

	public void setTipo(TipoPrenda tipo) {
		this.tipo = tipo;
	}

}
