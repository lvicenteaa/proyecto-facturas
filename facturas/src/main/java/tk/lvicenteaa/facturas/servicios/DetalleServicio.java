package tk.lvicenteaa.facturas.servicios;

import java.util.List;

import tk.lvicenteaa.facturas.entidades.Detalle;

public interface DetalleServicio {

	public Detalle agregarDetalle(Detalle detalle);
	
	public List<Detalle> mostrarDetalles();
	
	public Detalle mostrarDetalle(Integer id);
	
	public Detalle modificarDetalle(Detalle detalle);
	
	public String eliminarDetalle(Integer id);
	
}
