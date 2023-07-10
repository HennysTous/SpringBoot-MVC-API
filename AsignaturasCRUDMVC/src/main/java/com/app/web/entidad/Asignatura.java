package com.app.web.entidad;

import jakarta.persistence.*;

@Entity
@Table(name = "asignaturas", catalog = "asignaturascrud", schema = "")
public class Asignatura {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Basic(optional = false)
    @Column(name = "nombre", nullable = false, length = 20)
    private String nombre;
    @Basic(optional = false)
    @Column(name = "nombreCompleto", nullable = false, length = 20)
    private String nombreCompleto;
    @Basic(optional = false)
    @Column(name = "descripcion", nullable = false, length = 40)
    private String descripcion;
    @Basic(optional = false)
    @Column(name = "areaConocimiento", nullable = false, length = 20)
    private String areaConocimiento;
    @Basic(optional = false)
    @Column(name = "carrera", nullable = false, length = 20)
    private String carrera;
    @Basic(optional = false)
    @Column(name = "creditos", nullable = false)
    private int creditos;
    @Basic(optional = false)
    @Column(name = "contenidoTematico", nullable = false, length = 40)
    private String contenidoTematico;
    @Basic(optional = false)
    @Column(name = "semestre", nullable = false)
    private int semestre;
    @Basic(optional = false)
    @Column(name = "profesor", nullable = false, length = 60)
    private String profesor;

    public Asignatura() {
    }

    public Asignatura(Integer id) {
        this.id = id;
    }

    public Asignatura(Integer id, String nombre, String nombreCompleto, String descripcion, String areaConocimiento, String carrera, int creditos, String contenidoTematico, int semestre, String profesor) {
        this.id = id;
        this.nombre = nombre;
        this.nombreCompleto = nombreCompleto;
        this.descripcion = descripcion;
        this.areaConocimiento = areaConocimiento;
        this.carrera = carrera;
        this.creditos = creditos;
        this.contenidoTematico = contenidoTematico;
        this.semestre = semestre;
        this.profesor = profesor;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getAreaConocimiento() {
        return areaConocimiento;
    }

    public void setAreaConocimiento(String areaConocimiento) {
        this.areaConocimiento = areaConocimiento;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public String getContenidoTematico() {
        return contenidoTematico;
    }

    public void setContenidoTematico(String contenidoTematico) {
        this.contenidoTematico = contenidoTematico;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Asignatura)) {
            return false;
        }
        Asignatura other = (Asignatura) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.udec.devweb.actividad2.hennys_tous.modelo.entidades.Asignaturas[ id=" + id + " ]";
    }
    
}
