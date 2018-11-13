package modelo.entidades;

import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.entidades.Hojavisitaspozos;
import modelo.entidades.Lecturapozos;
import modelo.entidades.Municipios;
import modelo.entidades.Propietario;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-11-07T11:30:53")
@StaticMetamodel(Pozos.class)
public class Pozos_ { 

    public static volatile SingularAttribute<Pozos, String> pozo;
    public static volatile SingularAttribute<Pozos, String> latitud;
    public static volatile SingularAttribute<Pozos, String> estadopozo;
    public static volatile ListAttribute<Pozos, Lecturapozos> lecturapozosList;
    public static volatile SingularAttribute<Pozos, Integer> idpozo;
    public static volatile SingularAttribute<Pozos, String> tipopozo;
    public static volatile ListAttribute<Pozos, Hojavisitaspozos> hojavisitaspozosList;
    public static volatile SingularAttribute<Pozos, String> longitud;
    public static volatile SingularAttribute<Pozos, Date> fechacreacionpozo;
    public static volatile SingularAttribute<Pozos, BigDecimal> altura;
    public static volatile SingularAttribute<Pozos, String> geologia;
    public static volatile SingularAttribute<Pozos, BigDecimal> profundidad;
    public static volatile SingularAttribute<Pozos, BigDecimal> niveldepozo;
    public static volatile SingularAttribute<Pozos, Municipios> idmunicipio;
    public static volatile SingularAttribute<Pozos, Propietario> idpropietario;
    public static volatile SingularAttribute<Pozos, String> observacion;

}