package tk.lvicenteaa.facturas.servicios;

import java.util.List;

import tk.lvicenteaa.facturas.entidades.Factura;

public interface FacturaServicio {

	public Factura agregarFactura(Factura factura);
	
	public List<Factura> mostrarFacturas();
	
	public Factura mostrarFactura(Integer id);
	
	public String eliminarFactura(Integer id);
	
	public Factura modificarFactura(Integer id);
	
}
