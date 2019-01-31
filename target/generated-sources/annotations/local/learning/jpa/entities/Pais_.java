package local.learning.jpa.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import local.learning.jpa.entities.Departamento;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2019-01-31T18:27:27")
@StaticMetamodel(Pais.class)
public class Pais_ { 

    public static volatile SingularAttribute<Pais, String> id;
    public static volatile SingularAttribute<Pais, String> nombre;
    public static volatile ListAttribute<Pais, Departamento> departamentosList;

}