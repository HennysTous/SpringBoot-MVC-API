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
import com.app.web.repositorio.AsignaturaRepositorio;

@RestController
@RequestMapping("/apiasignaturas/v0.1")
public class AsignaturaRecurso {

	@Autowired
	private AsignaturaRepositorio asignaturaRepositorio;
	
	@GetMapping("api/asignaturas/all")
	public List<Asignatura> encontrarTodasLasAsignaturas(){
		return asignaturaRepositorio.findAll();
	}
	
	@GetMapping("api/asignaturas/find/{id}")
	public Asignatura encontrarPorID(@RequestBody Asignatura asignatura ,@PathVariable Integer id){
		return asignaturaRepositorio.findById(id).get();
	}
	
	@GetMapping("api/asignaturas/find/{nombre}")
	public List<Asignatura> encontrarPorNombre(@RequestBody Asignatura asignatura ,@PathVariable String nombre){
		return asignaturaRepositorio.filtrarPorNombre(nombre);
	}
	
	@PostMapping("api/asignaturas/create")
	public Asignatura crearAsignatura(@RequestBody Asignatura asignatura) {
		return asignaturaRepositorio.save(asignatura);
	}
	
	@PutMapping("api/asignaturas/edit/{id}")
	public Asignatura actualizarAsignatura(@RequestBody Asignatura asignatura ,@PathVariable Integer id){
		Asignatura asignaturaExistente = asignaturaRepositorio.findById(id).get();
		asignaturaExistente.setId(id);
		asignaturaExistente.setNombre(asignatura.getNombre());
		asignaturaExistente.setNombreCompleto(asignatura.getNombreCompleto());
		asignaturaExistente.setDescripcion(asignatura.getDescripcion());
		asignaturaExistente.setAreaConocimiento(asignatura.getAreaConocimiento());
		asignaturaExistente.setCarrera(asignatura.getCarrera());
		asignaturaExistente.setCreditos(asignatura.getCreditos());
		asignaturaExistente.setContenidoTematico(asignatura.getContenidoTematico());
		asignaturaExistente.setSemestre(asignatura.getSemestre());
		asignaturaExistente.setProfesor(asignatura.getProfesor());
		
		return asignaturaRepositorio.save(asignaturaExistente);
	}
	
	@DeleteMapping("api/asignaturas/remove/{id}")
	public void eliminarAsignatura(@PathVariable Integer id) {
		asignaturaRepositorio.deleteById(id);
	}
	
	
}
