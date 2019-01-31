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
@Table(name="tipos_documento")
public class TipoDocumento implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;
    
    @Basic(optional=false)
    @NotNull
    @Column(name="descripcion")
    @Size(min=3, max=45)
    private String descripcion;

    @OneToMany(mappedBy = "tipodocumento")
    private List<Usuario> usuarioList;
    
    public TipoDocumento() {
    }

    public TipoDocumento(Integer Id) {
        this.Id = Id;
    }

    public TipoDocumento(Integer Id, String descripcion) {
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

    public List<Usuario> getUsuarioList() {
        return usuarioList;
    }

    public void setUsuarioList(List<Usuario> usuarioList) {
        this.usuarioList = usuarioList;
    }
    
    @Override
    public String toString() {
        return "TipoDocumento{" + "Id=" + Id + '}';
    }
      
}
