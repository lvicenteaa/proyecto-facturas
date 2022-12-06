package tk.lvicenteaa.facturas.entidades;

import java.util.ArrayList;
import java.util.Date;

public class Factura {

	private Integer numero;
	private String nombreCliente;
	private Date fecha;
	private Double subTotal;
	private Double iva;
	private Double total;
	private ArrayList<Detalle> detalles;

	public Factura(Integer numero, String nombreCliente, Date fecha, Double subTotal, Double iva, Double total) {
		super();
		this.numero = numero;
		this.nombreCliente = nombreCliente;
		this.fecha = fecha;
		this.subTotal = subTotal;
		this.iva = iva;
		this.total = total;
	}

	public Factura() {
		super();
	}

	public Factura(String nombreCliente, Date fecha, Double subTotal, Double iva, Double total) {
		super();
		this.nombreCliente = nombreCliente;
		this.fecha = fecha;
		this.subTotal = subTotal;
		this.iva = iva;
		this.total = total;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Double getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(Double subTotal) {
		this.subTotal = subTotal;
	}

	public Double getIva() {
		return iva;
	}

	public void setIva(Double iva) {
		this.iva = iva;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	public ArrayList<Detalle> getDetalles() {
		return detalles;
	}

	public void setDetalles(ArrayList<Detalle> detalles) {
		this.detalles = detalles;
	}

}
