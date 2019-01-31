/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package local.learning.jpa.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author moises.silva
 */
@Embeddable
public class UsuariosHasRolesPK implements Serializable{
   
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_usuario")
    private int usuario;

    @Basic(optional = false)
    @NotNull
    @Column(name = "id_rol")
    private int rol;

    public UsuariosHasRolesPK() {
    }

    public UsuariosHasRolesPK(int usuario, int rol) {
        this.usuario = usuario;
        this.rol = rol;
    }

    public int getUsuario() {
        return usuario;
    }

    public void setUsuario(int usuario) {
        this.usuario = usuario;
    }

    public int getRol() {
        return rol;
    }

    public void setRol(int rol) {
        this.rol = rol;
    }


    
    
}
