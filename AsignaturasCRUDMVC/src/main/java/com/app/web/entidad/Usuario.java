package com.app.web.entidad;

import jakarta.persistence.*;

@Entity
@Table(name = "usuarios", catalog = "asignaturascrud", schema = "")
public class Usuario {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "cc", nullable = false)
    private Integer cc;
    @Basic(optional = false)
    @Column(name = "pass", nullable = false, length = 20)
    private String pass;
    @Basic(optional = false)
    @Column(name = "nombre", nullable = false, length = 20)
    private String nombre;
    @Basic(optional = false)
    @Column(name = "apellido", nullable = false, length = 20)
    private String apellido;
    @Basic(optional = false)
    @Column(name = "genero", nullable = false, length = 20)
    private String genero;
    @Basic(optional = false)
    @Column(name = "email", nullable = false, length = 30)
    private String email;
    @Column(name = "respuesta", length = 100)
    private String respuesta;

    public Usuario() {
    }

    public Usuario(Integer cc) {
        this.cc = cc;
    }

    public Usuario(Integer cc, String pass, String nombre, String apellido, String genero, String email) {
        this.cc = cc;
        this.pass = pass;
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.email = email;
    }

    public Integer getCc() {
        return cc;
    }

    public void setCc(Integer cc) {
        this.cc = cc;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cc != null ? cc.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        if ((this.cc == null && other.cc != null) || (this.cc != null && !this.cc.equals(other.cc))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.udec.devweb.actividad2.hennys_tous.modelo.entidades.Usuarios[ cc=" + cc + " ]";
    }
    
}