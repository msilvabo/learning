package local.learning.jpa.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import local.learning.jpa.entities.Rol;
import local.learning.jpa.entities.Usuario;
import local.learning.jpa.entities.UsuariosHasRolesPK;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2019-01-31T18:27:27")
@StaticMetamodel(UsuariosHasRoles.class)
public class UsuariosHasRoles_ { 

    public static volatile SingularAttribute<UsuariosHasRoles, Usuario> usuario;
    public static volatile SingularAttribute<UsuariosHasRoles, Rol> rol;
    public static volatile SingularAttribute<UsuariosHasRoles, UsuariosHasRolesPK> usuariosHasRolesPK;
    public static volatile SingularAttribute<UsuariosHasRoles, Boolean> activo;

}