package local.learning.jpa.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import local.learning.jpa.entities.Usuario;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2019-01-31T18:27:27")
@StaticMetamodel(TipoDocumento.class)
public class TipoDocumento_ { 

    public static volatile ListAttribute<TipoDocumento, Usuario> usuarioList;
    public static volatile SingularAttribute<TipoDocumento, String> descripcion;
    public static volatile SingularAttribute<TipoDocumento, Integer> Id;

}