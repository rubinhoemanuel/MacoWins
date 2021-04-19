package ar.edu.utn.frba.dds;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FacturacionTest {
	
	private VentaEnEfectivo ventaEnEfectivo;
	private VentaConTarjeta ventaConTarjeta;
	
	private List<Venta> ventas;

	private Venta primeraVenta20210405;
	private Venta segundaVenta20210405;
	private Venta terceraVenta20210405;
	private Venta primeraVenta20210406;
	private Venta segundaVenta20210406;
	
	private Facturacion facturacion;
	
	@Before
	public void setUp() {

		List<Item> items;
		
		items = new ArrayList<Item>();
		items.add(new Item(new Prenda(8000, new NuevaPrenda(), TipoPrenda.SACO), 1));
		items.add(new Item(new Prenda(4000, new PromocionPrenda(500), TipoPrenda.PANTALON), 1));
		items.add(new Item(new Prenda(2500, new LiquidacionPrenda(), TipoPrenda.CAMISA), 1));
		
		ventaEnEfectivo = new VentaEnEfectivo(items, LocalDate.now());
		ventaConTarjeta = new VentaConTarjeta(items, LocalDate.now(), 6, 10);
		
		ventas = new ArrayList<Venta>();

		primeraVenta20210405 = new VentaEnEfectivo(items, LocalDate.of(2021, 04, 05));
		segundaVenta20210405 = new VentaEnEfectivo(items, LocalDate.of(2021, 04, 05));
		terceraVenta20210405 = new VentaEnEfectivo(items, LocalDate.of(2021, 04, 05));
		
		primeraVenta20210406 = new VentaEnEfectivo(items, LocalDate.of(2021, 04, 06));
		segundaVenta20210406 = new VentaEnEfectivo(items, LocalDate.of(2021, 04, 06));
		
		ventas.add(primeraVenta20210405);
		ventas.add(segundaVenta20210405);
		ventas.add(terceraVenta20210405);
		ventas.add(primeraVenta20210406);
		ventas.add(segundaVenta20210406);
		
		facturacion = new Facturacion(ventas);
		
	}
	
	@Test
	public void calcularGananciaDeUnDia() {
		Assert.assertTrue(facturacion.calcularGananciasVentasPorFecha(LocalDate.of(2021, 04, 05)) == 38250.0);
		Assert.assertTrue(facturacion.calcularGananciasVentasPorFecha(LocalDate.of(2021, 04, 06)) == 25500.0);
	}
	
}
