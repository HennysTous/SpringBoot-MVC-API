package com.app.web.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.web.entidad.Asignatura;
import com.app.web.repositorio.AsignaturaRepositorio;

@Service
public class AsignaturaServicioImpl implements AsignaturaServicio {

	@Autowired
	private AsignaturaRepositorio repositorio;
	
	@Override
	public List<Asignatura> listarTodasLasAsignaturas() {
		// TODO Auto-generated method stub
		return repositorio.findAll();
	}
	
	@Override
	public Asignatura guardarAsignatura(Asignatura asignatura) {
		return repositorio.save(asignatura);
	}

	@Override
	public Asignatura obtenerAsignaturaPorId(Integer id) {
		return repositorio.findById(id).get();
	}

	@Override
	public Asignatura actualizarAsignatura(Asignatura asignatura) {
		return repositorio.save(asignatura);
	}

	@Override
	public void eliminarAsignatura(Integer id) {
		repositorio.deleteById(id);

	}

	@Override
	public List<Asignatura> filtrarAsignaturaPorNombre(String filtrar) {
		// TODO Auto-generated method stub
		return repositorio.filtrarPorNombre(filtrar);
	}

}
