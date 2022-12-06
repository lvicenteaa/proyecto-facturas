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

import tk.lvicenteaa.facturas.entidades.Detalle;

@RestController
@RequestMapping("api/detalle")
public class DetalleController {

	@GetMapping
	public List<Detalle> mostrarDetalles(){
		return null;
	}
	
	@GetMapping("/{id}")
	public Detalle obtenerDetalle(@PathVariable(name = "id") Integer id) {
		return null;
	}
	
	@PostMapping
	public Detalle guardarDetalle(@RequestBody Detalle detalle) {
		return null;
	}
	
	@PutMapping("/{id}")
	public Detalle modificarDetalle(@RequestBody Detalle detalle, @PathVariable(name = "id") Integer id) {
		return null;
	}
	
	@DeleteMapping("/{id}")
	public String eliminarDetalle(@PathVariable(name = "id") Integer id) {
		return null;
	}
	
	
}
