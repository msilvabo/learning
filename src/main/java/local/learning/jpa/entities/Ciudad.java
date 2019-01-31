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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author moises.silva
 */

@Entity
@Table(name="ciudades")
public class Ciudad implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer Id;
    
    @Basic(optional = false)
    @NotNull
    @Column(name = "nombre")
    @Size(min=3, max=45)
    private String Nombre;
    
    @JoinColumn(name="id_departamento", referencedColumnName = "id")
    @ManyToOne(optional=false)
    private Departamento departamento;

    @OneToMany(mappedBy = "ciudad")
    private List<Usuario> usuarioList;
    
    public Ciudad() {
    }

    public Ciudad(Integer Id) {
        this.Id = Id;
    }

    public Ciudad(Integer Id, String Nombre) {
        this.Id = Id;
        this.Nombre = Nombre;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public List<Usuario> getUsuarioList() {
        return usuarioList;
    }

    public void setUsuarioList(List<Usuario> usuarioList) {
        this.usuarioList = usuarioList;
    }
    
    @Override
    public String toString() {
        return "Ciudad{" + "Id=" + Id + '}';
    }
    
}
