package ar.edu.utn.frba.dds;

public class PagoEfectivo implements TipoPago {

	@Override
	public double calcularGanancia(Venta venta) {
		return venta.getPrendasVendidas().stream().mapToDouble(prenda -> prenda.getPrecio()).sum();
	}

}
