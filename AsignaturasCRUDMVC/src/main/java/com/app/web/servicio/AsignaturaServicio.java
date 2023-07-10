package com.app.web.servicio;

import java.util.List;

import com.app.web.entidad.Asignatura;

public interface AsignaturaServicio {

	public List<Asignatura> listarTodasLasAsignaturas();
	
	public Asignatura guardarAsignatura(Asignatura asignatura);
	
	public Asignatura obtenerAsignaturaPorId(Integer id);
	
	public Asignatura actualizarAsignatura(Asignatura asignatura);
	
	public void eliminarAsignatura(Integer id);
	
	public List<Asignatura> filtrarAsignaturaPorNombre (String filtrar);
}
