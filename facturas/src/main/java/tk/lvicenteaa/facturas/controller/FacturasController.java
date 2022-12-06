package tk.lvicenteaa.facturas.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tk.lvicenteaa.facturas.entidades.Factura;

@RestController
@RequestMapping("api/factura")
public class FacturasController {

	@GetMapping
	public List<Factura> mostrarFacturas(){
		return null;
	}
	
	@GetMapping("/{id}")
	public Factura mostrarFactura() {
		return null;
	}
	
	@PostMapping
	public Factura guardarFactura(@RequestBody Factura factura) {
		return null;
	}
	
	@PutMapping("/{id}")
	public Factura modificarFactura(@RequestBody Factura factura, @PathVariable(name = "id") Integer id) {
		return null;
	}
	
	@DeleteMapping("/{id}")
	public String eliminarFactura(@PathVariable(name = "id") Integer id) {
		return null;
	}
	
}
