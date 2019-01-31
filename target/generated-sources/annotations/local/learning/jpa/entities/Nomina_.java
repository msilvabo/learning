package local.learning.jpa.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import local.learning.jpa.entities.DetalleNomina;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2019-01-31T18:27:27")
@StaticMetamodel(Nomina.class)
public class Nomina_ { 

    public static volatile SingularAttribute<Nomina, Integer> id;
    public static volatile SingularAttribute<Nomina, Integer> mes;
    public static volatile SingularAttribute<Nomina, String> descripcion;
    public static volatile ListAttribute<Nomina, DetalleNomina> detalleNominaList;

}