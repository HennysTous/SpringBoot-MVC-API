package com.app.web.repositorio;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.app.web.entidad.Asignatura;

@Repository
public interface AsignaturaRepositorio extends JpaRepository<Asignatura, Integer>{

	@Query(value = "Select * from asignaturas a where a.nombre like %:filtrar%", nativeQuery = true)
	List<Asignatura> filtrarPorNombre(@Param("filtrar") String filtrar);

}
