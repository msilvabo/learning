package local.learning.jpa.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import local.learning.jpa.entities.Nomina;
import local.learning.jpa.entities.Usuario;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2019-01-31T18:27:27")
@StaticMetamodel(DetalleNomina.class)
public class DetalleNomina_ { 

    public static volatile SingularAttribute<DetalleNomina, Nomina> nomina;
    public static volatile SingularAttribute<DetalleNomina, Double> sueldoDevengado;
    public static volatile SingularAttribute<DetalleNomina, Double> netoPagar;
    public static volatile SingularAttribute<DetalleNomina, Integer> diasLaborados;
    public static volatile SingularAttribute<DetalleNomina, Double> otrosDescuentos;
    public static volatile SingularAttribute<DetalleNomina, Usuario> empleado;
    public static volatile SingularAttribute<DetalleNomina, Double> auxilioTransporte;
    public static volatile SingularAttribute<DetalleNomina, Double> descuentoPension;
    public static volatile SingularAttribute<DetalleNomina, Double> descuentoFondoSolidaridad;
    public static volatile SingularAttribute<DetalleNomina, Double> valorHorasExtras;
    public static volatile SingularAttribute<DetalleNomina, Double> totalDevengado;
    public static volatile SingularAttribute<DetalleNomina, Double> totalDescuento;
    public static volatile SingularAttribute<DetalleNomina, Double> descuentoSalud;
    public static volatile SingularAttribute<DetalleNomina, Integer> Id;

}