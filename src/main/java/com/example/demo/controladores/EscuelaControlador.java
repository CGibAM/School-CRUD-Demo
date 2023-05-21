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

import com.example.demo.entities.Escuela;
import com.example.demo.repositories.EscuelaRepositorio;

@RestController
@RequestMapping("/school")
@Component
public class EscuelaControlador {
	
	@Autowired
	private EscuelaRepositorio repositorioEscuela;
	
	@PostMapping("/create")
	public Escuela crearEscuela(@RequestBody Escuela escuela) {
		escuela.setId(null);
		escuela.setActivo(true);
		return escuela;
		
	}
	
	@GetMapping("/{id}")
	public Escuela obtenerEscuela (@PathVariable Integer id) {
		Optional <Escuela> escuela= repositorioEscuela.findById(id);
		return escuela.get();
	}
	
	@PutMapping
	public Escuela actualizarEscuela(@RequestBody Escuela escuela) {
		repositorioEscuela.save(escuela);
		return escuela;
	}
	
	@PatchMapping("/active/{id}")
	public Escuela activa (@PathVariable Integer id, @RequestParam(value="activo")Boolean activo) {
		Optional <Escuela> escOpt= repositorioEscuela.findById(id); 
		Escuela escuela = escOpt.get();
		escuela.setActivo(activo);
		repositorioEscuela.save(escuela);
		return escuela;
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> borrarEscuela(@PathVariable Integer id){
		Optional <Escuela> delete= repositorioEscuela.findById(id); 
		Escuela escuela = delete.get();
		repositorioEscuela.delete(escuela);
		return ResponseEntity.ok("Escuela eliminada");
	}

}
