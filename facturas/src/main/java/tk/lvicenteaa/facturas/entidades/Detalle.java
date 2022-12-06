package tk.lvicenteaa.facturas.entidades;

public class Detalle {

	private String articulo;
	private Integer cantidad;
	private Double valor;
	private Factura factura;

	public Detalle(String articulo, Integer cantidad, Double valor, Factura factura) {
		super();
		this.articulo = articulo;
		this.cantidad = cantidad;
		this.valor = valor;
		this.factura = factura;
	}

	public Detalle() {
		super();
	}

	public String getArticulo() {
		return articulo;
	}

	public void setArticulo(String articulo) {
		this.articulo = articulo;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Factura getFactura() {
		return factura;
	}

	public void setFactura(Factura factura) {
		this.factura = factura;
	}

}
