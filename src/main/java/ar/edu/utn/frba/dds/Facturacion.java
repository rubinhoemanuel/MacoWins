package ar.edu.utn.frba.dds;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class Facturacion {

	private List<Venta> ventas;
	
	public Facturacion (List<Venta> ventas) {
		this.ventas = ventas;
	}
	
	public double calcularGananciasVentasPorFecha(LocalDate fecha) {
		List<Venta> ventasFiltradasPorFecha = this.ventas.stream().filter(venta -> venta.getFecha().compareTo(fecha) == 0).collect(Collectors.toList());
		return ventasFiltradasPorFecha.stream().mapToDouble(venta -> venta.importe()).sum();
	}
	
}
