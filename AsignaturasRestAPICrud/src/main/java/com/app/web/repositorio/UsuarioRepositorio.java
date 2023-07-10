package com.app.web.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.app.web.entidad.Asignatura;
import com.app.web.entidad.Usuario;

public interface UsuarioRepositorio extends JpaRepository<Usuario, Integer> {


	@Query(value = "Select * from usuarios u where u.nombre like %:filtrar%", nativeQuery = true)
	List<Usuario> filtrarPorNombre(@Param("filtrar") String filtrar);
}
