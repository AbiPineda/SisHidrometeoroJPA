package modelo.entidades;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.entidades.Hojavisitasestaciones;
import modelo.entidades.Lecturaestaciones;
import modelo.entidades.Municipios;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-11-07T11:30:53")
@StaticMetamodel(Estacionmeteorologica.class)
public class Estacionmeteorologica_ { 

    public static volatile ListAttribute<Estacionmeteorologica, Lecturaestaciones> lecturaestacionesList;
    public static volatile SingularAttribute<Estacionmeteorologica, String> codigoestacion;
    public static volatile ListAttribute<Estacionmeteorologica, Hojavisitasestaciones> hojavisitasestacionesList;
    public static volatile SingularAttribute<Estacionmeteorologica, Municipios> idmunicipio;
    public static volatile SingularAttribute<Estacionmeteorologica, Integer> idestacion;

}