package local.learning.jpa.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import local.learning.jpa.entities.Departamento;
import local.learning.jpa.entities.Usuario;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2019-01-31T18:27:27")
@StaticMetamodel(Ciudad.class)
public class Ciudad_ { 

    public static volatile SingularAttribute<Ciudad, Departamento> departamento;
    public static volatile ListAttribute<Ciudad, Usuario> usuarioList;
    public static volatile SingularAttribute<Ciudad, Integer> Id;
    public static volatile SingularAttribute<Ciudad, String> Nombre;

}