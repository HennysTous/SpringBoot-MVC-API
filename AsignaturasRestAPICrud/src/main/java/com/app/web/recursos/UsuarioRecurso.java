package com.app.web.recursos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.web.entidad.Asignatura;
import com.app.web.entidad.Usuario;
import com.app.web.repositorio.AsignaturaRepositorio;
import com.app.web.repositorio.UsuarioRepositorio;

@RestController
@RequestMapping("/apiasignaturas/v0.1")
public class UsuarioRecurso {

	@Autowired
	private UsuarioRepositorio usuarioRepositorio;
	
	@GetMapping("api/usuarios/all")
	public List<Usuario> encontrarTodasLosUsuarios(){
		return usuarioRepositorio.findAll();
	}
	
	@GetMapping("api/usuarios/findbycc/{cc}")
	public Usuario encontrarPorCc(@PathVariable Integer cc){
		return usuarioRepositorio.findById(cc).get();
	}
	
	@GetMapping("api/usuarios/findbyname/{nombre}")
	public List<Usuario> encontrarPorNombre(@PathVariable String nombre){
		return usuarioRepositorio.filtrarPorNombre(nombre);
	}
	
	@PostMapping("api/usuarios/create")
	public Usuario crearUusario(@RequestBody Usuario usuario) {
		return usuarioRepositorio.save(usuario);
	}
	
	@PutMapping("api/usuarios/edit/{cc}")
	public Usuario actualizarUsuario(@RequestBody Usuario usuario ,@PathVariable Integer cc){
		Usuario usuarioExistente = usuarioRepositorio.findById(cc).get();
		usuarioExistente.setCc(cc);
		usuarioExistente.setNombre(usuario.getNombre());
		usuarioExistente.setApellido(usuario.getApellido());
		usuarioExistente.setGenero(usuario.getGenero());
		usuarioExistente.setEmail(usuario.getEmail());
		usuarioExistente.setPass(usuario.getPass());
		usuarioExistente.setRespuesta(usuario.getRespuesta());
		
		
		return usuarioRepositorio.save(usuarioExistente);
	}
	
	@DeleteMapping("api/usuarios/remove/{cc}")
	public void eliminarUsuario(@PathVariable Integer cc) {
		usuarioRepositorio.deleteById(cc);
	}
	
	
}