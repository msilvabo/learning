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
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
/**
 *
 * @author moises.silva
 */

@Entity
@Table(name = "cargos")
public class Cargo implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    @Size(min=1,max=4)
    private Integer Id;
    
    @Basic(optional=false)
    @NotNull
    @Column(name="descripcion")
    @Size(min=4, max=60)
    private String descripcion;

    @OneToOne(mappedBy = "cargo")
    private Usuario usuario;
    
    public Cargo() {
    }

    public Cargo(Integer Id) {
        this.Id = Id;
    }

    public Cargo(Integer Id, String descripcion) {
        this.Id = Id;
        this.descripcion = descripcion;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Cargo{" + "Id=" + Id + '}';
    }
    
}
