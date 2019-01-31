package local.learning.jpa.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import local.learning.jpa.entities.Cargo;
import local.learning.jpa.entities.Ciudad;
import local.learning.jpa.entities.DetalleNomina;
import local.learning.jpa.entities.TipoDocumento;
import local.learning.jpa.entities.Usuario;
import local.learning.jpa.entities.UsuariosHasRoles;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2019-01-31T18:27:27")
@StaticMetamodel(Usuario.class)
public class Usuario_ { 

    public static volatile SingularAttribute<Usuario, String> direccion;
    public static volatile SingularAttribute<Usuario, Ciudad> ciudad;
    public static volatile SingularAttribute<Usuario, String> apellidos;
    public static volatile ListAttribute<Usuario, DetalleNomina> detalleNominaList;
    public static volatile ListAttribute<Usuario, UsuariosHasRoles> usuariosHasRolesList;
    public static volatile SingularAttribute<Usuario, String> password;
    public static volatile SingularAttribute<Usuario, Cargo> cargo;
    public static volatile SingularAttribute<Usuario, String> num_documento;
    public static volatile SingularAttribute<Usuario, Boolean> activo;
    public static volatile SingularAttribute<Usuario, Integer> id;
    public static volatile SingularAttribute<Usuario, String> nombres;
    public static volatile SingularAttribute<Usuario, TipoDocumento> tipodocumento;
    public static volatile SingularAttribute<Usuario, String> email;
    public static volatile SingularAttribute<Usuario, Usuario> jefeinmediato;
    public static volatile ListAttribute<Usuario, Usuario> usuariosList;
    public static volatile SingularAttribute<Usuario, Double> sueldo_basico;

}