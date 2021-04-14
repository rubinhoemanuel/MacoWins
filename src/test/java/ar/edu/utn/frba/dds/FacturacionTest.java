package ar.edu.utn.frba.dds;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FacturacionTest {
	
	private Prenda saco;
	private Prenda pantalon;
	private Prenda camisa;

	private NuevaPrenda nuevaPrenda;
	private PromocionPrenda promocionPrenda;
	private LiquidacionPrenda liquidacionPrenda;
	
	private PagoEfectivo pagoEfectivo;
	private PagoTarjeta pagoTarjeta;
	
	private List<Prenda> prendas;
	private List<Venta> ventas;

	private Venta primeraVenta20210405;
	private Venta segundaVenta20210405;
	private Venta terceraVenta20210405;
	private Venta primeraVenta20210406;
	private Venta segundaVenta20210406;
	
	private Facturacion facturacion;
	
	@Before
	public void setUp() {

		nuevaPrenda = new NuevaPrenda();
		promocionPrenda = new PromocionPrenda(500);
		liquidacionPrenda = new LiquidacionPrenda();

		saco = new Prenda(8000, nuevaPrenda);
		pantalon = new Prenda(4000, promocionPrenda);
		camisa = new Prenda(2500, liquidacionPrenda);
		
		pagoEfectivo = new PagoEfectivo();
		pagoTarjeta = new PagoTarjeta(6, 10);
		
		prendas = new ArrayList<Prenda>();
		prendas.add(this.saco);
		prendas.add(this.pantalon);
		prendas.add(this.camisa);
		
		ventas = new ArrayList<Venta>();

		primeraVenta20210405 = new Venta(prendas, LocalDate.of(2021, 04, 05), pagoEfectivo);
		segundaVenta20210405 = new Venta(prendas, LocalDate.of(2021, 04, 05), pagoEfectivo);
		terceraVenta20210405 = new Venta(prendas, LocalDate.of(2021, 04, 05), pagoEfectivo);
		primeraVenta20210406 = new Venta(prendas, LocalDate.of(2021, 04, 06), pagoTarjeta);
		segundaVenta20210406 = new Venta(prendas, LocalDate.of(2021, 04, 06), pagoTarjeta);
		
		ventas.add(primeraVenta20210405);
		ventas.add(segundaVenta20210405);
		ventas.add(terceraVenta20210405);
		ventas.add(primeraVenta20210406);
		ventas.add(segundaVenta20210406);
		
		facturacion = new Facturacion(ventas);
		
	}
	
	@Test
	public void calcularGananciaDeUnDia() {		
		Assert.assertTrue(facturacion.calcularGananciasVentasPorFecha(LocalDate.of(2021, 04, 05)) == 38250);	
		Assert.assertTrue(facturacion.calcularGananciasVentasPorFecha(LocalDate.of(2021, 04, 06)) == 25875);
	}
	
}
