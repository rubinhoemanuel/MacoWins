package ar.edu.utn.frba.dds;

public class PromocionPrenda implements EstadoPrenda {

	private int valorFijo;

	public PromocionPrenda(int valorFijo) {
		this.valorFijo = valorFijo;
	}

	@Override
	public double getPrecio(double precioPropio) {
		return precioPropio - this.valorFijo;
	}

	public int getValorFijo() {
		return valorFijo;
	}

	public void setValorFijo(int valorFijo) {
		this.valorFijo = valorFijo;
	}

}
