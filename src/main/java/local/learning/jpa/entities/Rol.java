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
@Table(name="roles")
public class Rol implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    @Size(min=1,max=4)
    private String id;
    
    @Basic(optional=false)
    @NotNull
    @Column(name="descripcion")
    @Size(min=5,max=40)
    private String descripcion;

    @OneToMany(mappedBy = "rol")
    private List<UsuariosHasRolesPK> usuariosHasRolesList;
    
    public Rol() {
    }

    public Rol(String id) {
        this.id = id;
    }

    public Rol(String id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<UsuariosHasRolesPK> getUsuariosHasRolesList() {
        return usuariosHasRolesList;
    }

    public void setUsuariosHasRolesList(List<UsuariosHasRolesPK> usuariosHasRolesList) {
        this.usuariosHasRolesList = usuariosHasRolesList;
    }
    
    @Override
    public String toString() {
        return "Rol{" + "id=" + id + '}';
    }
    
}
