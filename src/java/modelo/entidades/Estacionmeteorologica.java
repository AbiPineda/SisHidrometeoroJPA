/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.entidades;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Abi
 */
@Entity
@Table(name = "estacionmeteorologica")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Estacionmeteorologica.findAll", query = "SELECT e FROM Estacionmeteorologica e")
    , @NamedQuery(name = "Estacionmeteorologica.findByIdestacion", query = "SELECT e FROM Estacionmeteorologica e WHERE e.idestacion = :idestacion")
    , @NamedQuery(name = "Estacionmeteorologica.findByCodigoestacion", query = "SELECT e FROM Estacionmeteorologica e WHERE e.codigoestacion = :codigoestacion")})
public class Estacionmeteorologica implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idestacion")
    private Integer idestacion;
    @Size(max = 10)
    @Column(name = "codigoestacion")
    private String codigoestacion;
    @JoinColumn(name = "idmunicipio", referencedColumnName = "idmunicipio")
    @ManyToOne
    private Municipios idmunicipio;
    @OneToMany(mappedBy = "idestacion")
    private List<Hojavisitasestaciones> hojavisitasestacionesList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idestacion")
    private List<Lecturaestaciones> lecturaestacionesList;

    public Estacionmeteorologica() {
    }

    public Estacionmeteorologica(Integer idestacion) {
        this.idestacion = idestacion;
    }

    public Integer getIdestacion() {
        return idestacion;
    }

    public void setIdestacion(Integer idestacion) {
        this.idestacion = idestacion;
    }

    public String getCodigoestacion() {
        return codigoestacion;
    }

    public void setCodigoestacion(String codigoestacion) {
        this.codigoestacion = codigoestacion;
    }

    public Municipios getIdmunicipio() {
        return idmunicipio;
    }

    public void setIdmunicipio(Municipios idmunicipio) {
        this.idmunicipio = idmunicipio;
    }

    @XmlTransient
    public List<Hojavisitasestaciones> getHojavisitasestacionesList() {
        return hojavisitasestacionesList;
    }

    public void setHojavisitasestacionesList(List<Hojavisitasestaciones> hojavisitasestacionesList) {
        this.hojavisitasestacionesList = hojavisitasestacionesList;
    }

    @XmlTransient
    public List<Lecturaestaciones> getLecturaestacionesList() {
        return lecturaestacionesList;
    }

    public void setLecturaestacionesList(List<Lecturaestaciones> lecturaestacionesList) {
        this.lecturaestacionesList = lecturaestacionesList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idestacion != null ? idestacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Estacionmeteorologica)) {
            return false;
        }
        Estacionmeteorologica other = (Estacionmeteorologica) object;
        if ((this.idestacion == null && other.idestacion != null) || (this.idestacion != null && !this.idestacion.equals(other.idestacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.entidades.Estacionmeteorologica[ idestacion=" + idestacion + " ]";
    }
    
}
