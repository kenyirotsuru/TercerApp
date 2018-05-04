/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.tercerapp.model;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Francisco
 */
@Entity
@Table(name = "formularioss")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Formularioss.findAll", query = "SELECT f FROM Formularioss f"),
    @NamedQuery(name = "Formularioss.findById", query = "SELECT f FROM Formularioss f WHERE f.id = :id"),
    @NamedQuery(name = "Formularioss.findByCreacion", query = "SELECT f FROM Formularioss f WHERE f.creacion = :creacion"),
    @NamedQuery(name = "Formularioss.findByLastUpdated", query = "SELECT f FROM Formularioss f WHERE f.lastUpdated = :lastUpdated"),
    @NamedQuery(name = "Formularioss.findByNombre", query = "SELECT f FROM Formularioss f WHERE f.nombre = :nombre"),
    @NamedQuery(name = "Formularioss.findByEdad", query = "SELECT f FROM Formularioss f WHERE f.edad = :edad"),
    @NamedQuery(name = "Formularioss.findByDispositivos", query = "SELECT f FROM Formularioss f WHERE f.dispositivos = :dispositivos"),
    @NamedQuery(name = "Formularioss.findByDispMayorUso", query = "SELECT f FROM Formularioss f WHERE f.dispMayorUso = :dispMayorUso"),
    @NamedQuery(name = "Formularioss.findByFrecuencia", query = "SELECT f FROM Formularioss f WHERE f.frecuencia = :frecuencia"),
    @NamedQuery(name = "Formularioss.findByActividadesUso", query = "SELECT f FROM Formularioss f WHERE f.actividadesUso = :actividadesUso"),
    @NamedQuery(name = "Formularioss.findByUsosFavorecer", query = "SELECT f FROM Formularioss f WHERE f.usosFavorecer = :usosFavorecer"),
    @NamedQuery(name = "Formularioss.findByDiagnosis", query = "SELECT f FROM Formularioss f WHERE f.diagnosis = :diagnosis")})
public class Formularioss implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "creacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date creacion;
    @Column(name = "lastUpdated")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUpdated;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Column(name = "edad")
    private int edad;
    @Size(max = 50)
    @Column(name = "dispositivos")
    private String dispositivos;
    @Size(max = 50)
    @Column(name = "dispMayorUso")
    private String dispMayorUso;
    @Size(max = 50)
    @Column(name = "frecuencia")
    private String frecuencia;
    @Size(max = 50)
    @Column(name = "actividadesUso")
    private String actividadesUso;
    @Size(max = 50)
    @Column(name = "usosFavorecer")
    private String usosFavorecer;
    @Size(max = 50)
    @Column(name = "diagnosis")
    private String diagnosis;
    @OneToMany(mappedBy = "idformularioSS")
    private Collection<Pacientes> pacientesCollection;

    public Formularioss() {
    }

    public Formularioss(Integer id) {
        this.id = id;
    }

    public Formularioss(Integer id, Date creacion, String nombre, int edad) {
        this.id = id;
        this.creacion = creacion;
        this.nombre = nombre;
        this.edad = edad;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getCreacion() {
        return creacion;
    }

    public void setCreacion(Date creacion) {
        this.creacion = creacion;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDispositivos() {
        return dispositivos;
    }

    public void setDispositivos(String dispositivos) {
        this.dispositivos = dispositivos;
    }

    public String getDispMayorUso() {
        return dispMayorUso;
    }

    public void setDispMayorUso(String dispMayorUso) {
        this.dispMayorUso = dispMayorUso;
    }

    public String getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(String frecuencia) {
        this.frecuencia = frecuencia;
    }

    public String getActividadesUso() {
        return actividadesUso;
    }

    public void setActividadesUso(String actividadesUso) {
        this.actividadesUso = actividadesUso;
    }

    public String getUsosFavorecer() {
        return usosFavorecer;
    }

    public void setUsosFavorecer(String usosFavorecer) {
        this.usosFavorecer = usosFavorecer;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    @XmlTransient
    public Collection<Pacientes> getPacientesCollection() {
        return pacientesCollection;
    }

    public void setPacientesCollection(Collection<Pacientes> pacientesCollection) {
        this.pacientesCollection = pacientesCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Formularioss)) {
            return false;
        }
        Formularioss other = (Formularioss) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sistema.tercerapp.model.Formularioss[ id=" + id + " ]";
    }
    
}
