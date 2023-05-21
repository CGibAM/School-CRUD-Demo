package com.example.demo.controladores;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Horario;
import com.example.demo.repositories.HorarioRepositorio;

@RestController
@RequestMapping("/schedule")
@Component
public class HorarioControlador {

	@Autowired
	private HorarioRepositorio repositorioHorario;

	@PostMapping("/create")
	public Horario crearHorario(@RequestBody Horario horario) {

		horario.setId(null);
		return horario;
	}

	@GetMapping("/{id}")
	public Horario mostrarHorario(@PathVariable Integer id) {

		Optional<Horario> horario = repositorioHorario.findById(id);
		return horario.get();
	}

	@PutMapping
	public Horario modificarHorario(@RequestBody Horario horario) {

		repositorioHorario.save(horario);
		return horario;
	}

	@PutMapping("/change-assignment/{id}")
	public Horario modificarMateria(@PathVariable Integer id, 
			@RequestParam(value = "materia") Integer materia) {
		Optional<Horario> opt = repositorioHorario.findById(id);
		Horario horario = opt.get();
		horario.setMateria(materia);
		repositorioHorario.save(horario);
		return horario;
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> borrarHorario(@PathVariable Integer id){
		Optional<Horario> horario = repositorioHorario.findById(id);
		Horario delete = horario.get();
		repositorioHorario.delete(delete);
		return ResponseEntity.ok("Horario Eliminado");
	}
}
