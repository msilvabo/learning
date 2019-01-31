/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package local.learning.jpa.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author moises.silva
 */
@Entity
@Table(name="paises")
public class Pais implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    @Size(min=1, max=4)
    private String id;
    
    @Basic(optional = false)
    @NotNull
    @Column(name="nombre")
    @Size(min=1, max=60)    
    private String nombre;

    // Relacion OneToMany con Departamentos
    @OneToMany(mappedBy = "pais")
    private List<Departamento> departamentosList;
    
    public Pais() {
    }

    public Pais(String id) {
        this.id = id;
    }

    public Pais(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }   

    @Override
    public String toString() {
        return "Pais{" + "nombre=" + nombre + '}';
    }

    public List<Departamento> getDepartamentosList() {
        return departamentosList;
    }

    public void setDepartamentosList(List<Departamento> departamentosList) {
        this.departamentosList = departamentosList;
    }

    
    
}
