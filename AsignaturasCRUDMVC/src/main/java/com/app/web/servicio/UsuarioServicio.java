package com.app.web.servicio;


import java.util.List;

import com.app.web.entidad.Asignatura;
import com.app.web.entidad.Usuario;

public interface UsuarioServicio {
	
	public Usuario encontrarUsuarioPorEmailYRespuesta (String email, String respuesta);
	
	public Usuario encontrarUsuarioPorEmailYContrasena (String email, String pass);
	
	public List<Usuario> listarTodosLosUsuarios();	
	
	public Usuario ActualizarUsuario(Usuario usuario);
}
