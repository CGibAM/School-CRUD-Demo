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

import com.example.demo.entities.Materia;
import com.example.demo.repositories.MateriaRepositorio;

@RestController
@RequestMapping("/assignment")
@Component
public class MateriasControlador {
	
	@Autowired
	private MateriaRepositorio repositorioMaterias;
	
	@PostMapping("/create-materia")
	public Materia crearMateria(@RequestBody Materia materia) {
		materia.setId(null);
		materia.setActivo(true);
		return materia;
	}
	
	@GetMapping("/{id}")
	public Materia mostrarMateria(@PathVariable Integer id) {
		Optional<Materia> materia= repositorioMaterias.findById(id);
		return materia.get();
	}
	
	@PutMapping
	public Materia cambiarMateria(@RequestBody Materia materia) {
		repositorioMaterias.save(materia);
		return materia;
	}
	
	@PatchMapping("/set-active/{id}")
	public Materia actualizarMateria(@PathVariable Integer id,
			@RequestParam (value="activo") Boolean activo) {
		
		Optional<Materia> opt = repositorioMaterias.findById(id);
		Materia materia = opt.get();
		materia.setActivo(activo);
		repositorioMaterias.save(materia);
		return materia;
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> borrarMateria(@PathVariable Integer id){
		Optional<Materia> opt = repositorioMaterias.findById(id);
		Materia delete = opt.get();
		repositorioMaterias.delete(delete);
		return ResponseEntity.ok("MateriaEliminada");
	}
}
