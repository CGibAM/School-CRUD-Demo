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

import com.example.demo.entities.Kardex;
import com.example.demo.repositories.KardexRepositorio;

@RestController
@RequestMapping("/kardex")
@Component
public class KardexControlador {
	
	@Autowired
	private KardexRepositorio repositorioKardex;
	
	@PostMapping("/createKardex")
	public Kardex crearKardex(@RequestBody Kardex kardex) {
		kardex.setId(null);
		return kardex;
	}
	
	@GetMapping("/{id}")
	public Kardex consultarKardex(@PathVariable Integer id) {
		Optional<Kardex> kardex = repositorioKardex.findById(id);
		return kardex.get();
	}
	
	@PutMapping
	public Kardex modificarKardex(@RequestBody Kardex kardex) {
		repositorioKardex.save(kardex);
		return kardex;
	}
	
	@PatchMapping("/change-assignment/{id}")
	public Kardex modificarMateria(@RequestParam Integer id,
			@PathVariable(value="materia") Integer materia) {
		Optional<Kardex> opt = repositorioKardex.findById(id);
		Kardex kardex = opt.get();
		kardex.setMateria(materia);
		repositorioKardex.save(kardex);
		return kardex;
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> borrarKardex(@PathVariable Integer id){
		Optional<Kardex> kardex = repositorioKardex.findById(id);
		Kardex delete = kardex.get();
		repositorioKardex.delete(delete);
		return ResponseEntity.ok("KardexEliminado");
	}
	
}
