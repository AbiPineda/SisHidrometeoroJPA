package modelo.entidades;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.entidades.Hojavisitasestaciones;
import modelo.entidades.Hojavisitaspozos;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-11-07T11:30:53")
@StaticMetamodel(Visitantes.class)
public class Visitantes_ { 

    public static volatile SingularAttribute<Visitantes, Integer> idvisitante;
    public static volatile ListAttribute<Visitantes, Hojavisitasestaciones> hojavisitasestacionesList;
    public static volatile SingularAttribute<Visitantes, String> tipovisitante;
    public static volatile SingularAttribute<Visitantes, String> duivisitante;
    public static volatile SingularAttribute<Visitantes, String> nombrevisitante;
    public static volatile SingularAttribute<Visitantes, String> sexovisitante;
    public static volatile ListAttribute<Visitantes, Hojavisitaspozos> hojavisitaspozosList;

}