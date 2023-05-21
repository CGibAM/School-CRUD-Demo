package com.example.demo.controladores;

//import java.util.Date;
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

import com.example.demo.entities.Usuarios;
import com.example.demo.repositories.UsuarioRepositorio;

@RestController
@RequestMapping("/user") /*
							 * Es el que la da la ruta a los request que va a contener(En singular, buenas
							 * practicas)
							 */
@Component // Auto-detección, usar lo que viene dentro
public class UsuarioControlador {

	@Autowired // Decirle a Spring que el objeto esta siendo manejado en el pool de spring
	/*
	 * pool de spring: Es una zona de la memoria donde spring inicializa los
	 * servicios, componentes, controladores,etc para usarlos cuando sea necesario
	 */
	private UsuarioRepositorio repositorioUsuario;// para mandar llamar al repositorio

	@PostMapping("/create") // Para crear un objeto desde cero
	public Usuarios crearUsuario(@RequestBody Usuarios usuario) {
		usuario.setId(null);// En un create hay que limpiar el id, con el setter **SIEMPRE**
		usuario.setActivo(true); // Cuando se crea un usuario nuevo estara como activo, aun que el JSON lo ignore
									// repositorioUsuario.save(usuario);// crea un request desde la entity
//		UsuariosPOJO usuarioPOJO = new UsuariosPOJO();
//		usuarioPOJO.setAge(usuario.getAge());
//		usuarioPOJO.setEmail(usuario.getEmail());
//		usuarioPOJO.setEscuelaId(usuario.getEscuelaId());
//		usuarioPOJO.setFechaIngreso(usuario.getFechaIngreso()); // new Date() es un Now
//		usuarioPOJO.setGenero(usuario.getGenero());
//		usuarioPOJO.setId(usuario.getId());
//		usuarioPOJO.setPerfil(usuario.getPerfil());
//		usuarioPOJO.setPsw(usuario.getPsw());
		return usuario;
	}

	@GetMapping("/{id}")
	public Usuarios obtenerUsuario(@PathVariable Integer id) {
		Optional<Usuarios> usuario = repositorioUsuario.findById(id); /*
																		 * obtener en un optional el usuario desde el
																		 * repositorio(puede que lo encuentre o no
																		 */
		return usuario.get();
	}

	@PutMapping
	public Usuarios actualizarUsuario(@RequestBody Usuarios usuario) {

		repositorioUsuario.save(usuario);
		return usuario;
	}

	@PatchMapping("/set-active/{id}")
	public Usuarios activo(@PathVariable Integer id,
			@RequestParam(value = "edad") Integer edad) {/*
													* Cambiar un valor en especifico, el value= "edad"
													* tiene el nombre de la variable que recibe el metodo y que se va a cambiar"
															 */
		Optional<Usuarios> opt = repositorioUsuario.findById(id);
		Usuarios usuario = opt.get();
		usuario.setAge(edad);
		repositorioUsuario.save(usuario);
		return usuario;
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<?> /* Tipo de dato de SpringBoot para armar una respuesta al request */
			deleteUsuario(@PathVariable Integer id) {
		Optional<Usuarios> usuario = repositorioUsuario.findById(id);
		Usuarios delete = usuario.get();
		repositorioUsuario.delete(delete);
		return ResponseEntity.ok("Eliminado");
	}

}
