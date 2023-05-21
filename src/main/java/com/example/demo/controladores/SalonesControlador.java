package com.example.demo.controladores;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entities.Salones;
import com.example.demo.repositories.SalonesRepositorio;

@RestController
@RequestMapping("/salones")
@Component
public class SalonesControlador {
	@Autowired
	SalonesRepositorio salonRepositorio;
	
	@PostMapping("/new")
	public Salones nuevoSalon(@RequestBody Salones salones) {
		salones.setId(null);
		salones.setActivo(true);
		return salones;
	}
	
	@GetMapping("/{id}")
	public Salones obtenerSalon(@PathVariable Integer id) {
		Optional<Salones> salon= salonRepositorio.findById(id); 
		return salon.get();
	}
	
	@PutMapping
	public Salones actualizarSalon (@RequestBody Salones salon) {
		salonRepositorio.save(salon);
		return salon;
	}
	
	@PatchMapping("/{id}")
	public Salones cambioMateria(@PathVariable Integer id, @RequestParam(value="materia") Integer materia) {
		Optional<Salones> opt = salonRepositorio.findById(id);
		Salones salones = opt.get();
		salones.setMateria(materia);
		salonRepositorio.save(salones);
		return salones;
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> borrarSalon(@PathVariable Integer id){
		Optional<Salones> salon = salonRepositorio.findById(id);
		Salones delete = salon.get();
		salonRepositorio.delete(delete);
		return ResponseEntity.ok("Salon eliminado");
	}
	
	
	

}
