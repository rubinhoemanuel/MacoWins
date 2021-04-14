package ar.edu.utn.frba.dds;

public class PagoTarjeta implements TipoPago {
	
	private int cantidadCuotas;
	private double coeficiente;
	
	public PagoTarjeta(int cantidadCuotas, double coeficiente) {
		this.cantidadCuotas = cantidadCuotas;
		this.coeficiente = coeficiente;
	}

	@Override
	public double calcularGanancia(Venta venta) {
		return venta.getPrendasVendidas().stream().mapToDouble(prenda -> prenda.getPrecio()).sum() + this.calcularRecargo(venta);
	}

	private double calcularRecargo(Venta venta) {
		return this.cantidadCuotas * this.coeficiente + venta.getPrendasVendidas().stream().mapToDouble(prenda -> prenda.getPrecio() * 0.01).sum();
	}

}
