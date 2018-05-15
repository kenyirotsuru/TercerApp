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
@Table(name = "formulariogeneral")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Formulariogeneral.findAll", query = "SELECT f FROM Formulariogeneral f"),
    @NamedQuery(name = "Formulariogeneral.findById", query = "SELECT f FROM Formulariogeneral f WHERE f.id = :id"),
    @NamedQuery(name = "Formulariogeneral.findByCreacion", query = "SELECT f FROM Formulariogeneral f WHERE f.creacion = :creacion"),
    @NamedQuery(name = "Formulariogeneral.findByLastUpdated", query = "SELECT f FROM Formulariogeneral f WHERE f.lastUpdated = :lastUpdated"),
    @NamedQuery(name = "Formulariogeneral.findByNombre", query = "SELECT f FROM Formulariogeneral f WHERE f.nombre = :nombre"),
    @NamedQuery(name = "Formulariogeneral.findByEdad", query = "SELECT f FROM Formulariogeneral f WHERE f.edad = :edad"),
    @NamedQuery(name = "Formulariogeneral.findByEscolaridad", query = "SELECT f FROM Formulariogeneral f WHERE f.escolaridad = :escolaridad"),
    @NamedQuery(name = "Formulariogeneral.findByEstadoCivil", query = "SELECT f FROM Formulariogeneral f WHERE f.estadoCivil = :estadoCivil"),
    @NamedQuery(name = "Formulariogeneral.findByAfiliacion", query = "SELECT f FROM Formulariogeneral f WHERE f.afiliacion = :afiliacion"),
    @NamedQuery(name = "Formulariogeneral.findByPadecimientos", query = "SELECT f FROM Formulariogeneral f WHERE f.padecimientos = :padecimientos"),
    @NamedQuery(name = "Formulariogeneral.findByCohabitacion", query = "SELECT f FROM Formulariogeneral f WHERE f.cohabitacion = :cohabitacion"),
    @NamedQuery(name = "Formulariogeneral.findByEmail", query = "SELECT f FROM Formulariogeneral f WHERE f.email = :email"),
    @NamedQuery(name = "Formulariogeneral.findByAmai", query = "SELECT f FROM Formulariogeneral f WHERE f.amai = :amai"),
    @NamedQuery(name = "Formulariogeneral.findByKartz", query = "SELECT f FROM Formulariogeneral f WHERE f.kartz = :kartz"),
    @NamedQuery(name = "Formulariogeneral.findByMental", query = "SELECT f FROM Formulariogeneral f WHERE f.mental = :mental"),
    @NamedQuery(name = "Formulariogeneral.findByBarthel", query = "SELECT f FROM Formulariogeneral f WHERE f.barthel = :barthel"),
    @NamedQuery(name = "Formulariogeneral.findByLawtonBrody", query = "SELECT f FROM Formulariogeneral f WHERE f.lawtonBrody = :lawtonBrody"),
    @NamedQuery(name = "Formulariogeneral.findByEscalaDepresion", query = "SELECT f FROM Formulariogeneral f WHERE f.escalaDepresion = :escalaDepresion"),
    @NamedQuery(name = "Formulariogeneral.findByNutricional", query = "SELECT f FROM Formulariogeneral f WHERE f.nutricional = :nutricional"),
    @NamedQuery(name = "Formulariogeneral.findByPerdidaPeso", query = "SELECT f FROM Formulariogeneral f WHERE f.perdidaPeso = :perdidaPeso"),
    @NamedQuery(name = "Formulariogeneral.findByResistencia", query = "SELECT f FROM Formulariogeneral f WHERE f.resistencia = :resistencia"),
    @NamedQuery(name = "Formulariogeneral.findByVelocidad", query = "SELECT f FROM Formulariogeneral f WHERE f.velocidad = :velocidad"),
    @NamedQuery(name = "Formulariogeneral.findByDebilitamiento", query = "SELECT f FROM Formulariogeneral f WHERE f.debilitamiento = :debilitamiento"),
    @NamedQuery(name = "Formulariogeneral.findByActividad", query = "SELECT f FROM Formulariogeneral f WHERE f.actividad = :actividad"),
    @NamedQuery(name = "Formulariogeneral.findByDiagnostico", query = "SELECT f FROM Formulariogeneral f WHERE f.diagnostico = :diagnostico")})
public class Formulariogeneral implements Serializable {

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
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "escolaridad")
    private String escolaridad;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "estadoCivil")
    private String estadoCivil;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "afiliacion")
    private String afiliacion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "padecimientos")
    private String padecimientos;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cohabitacion")
    private boolean cohabitacion;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "email")
    private String email;
    @Size(max = 50)
    @Column(name = "amai")
    private String amai;
    @Size(max = 50)
    @Column(name = "kartz")
    private String kartz;
    @Size(max = 50)
    @Column(name = "mental")
    private String mental;
    @Size(max = 50)
    @Column(name = "barthel")
    private String barthel;
    @Size(max = 50)
    @Column(name = "lawtonBrody")
    private String lawtonBrody;
    @Column(name = "escalaDepresion")
    private Integer escalaDepresion;
    @Size(max = 50)
    @Column(name = "nutricional")
    private String nutricional;
    @Column(name = "perdidaPeso")
    private Integer perdidaPeso;
    @Size(max = 50)
    @Column(name = "resistencia")
    private String resistencia;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "velocidad")
    private Double velocidad;
    @Column(name = "debilitamiento")
    private Double debilitamiento;
    @Column(name = "actividad")
    private Boolean actividad;
    @Size(max = 50)
    @Column(name = "diagnostico")
    private String diagnostico;
    @OneToMany(mappedBy = "idformularioGeneral")
    private Collection<Pacientes> pacientesCollection;

    public Formulariogeneral() {
    }

    public Formulariogeneral(Integer id) {
        this.id = id;
    }

    public Formulariogeneral(Integer id, Date creacion, String nombre, int edad, String escolaridad, String estadoCivil, String afiliacion, String padecimientos, boolean cohabitacion, String email) {
        this.id = id;
        this.creacion = creacion;
        this.nombre = nombre;
        this.edad = edad;
        this.escolaridad = escolaridad;
        this.estadoCivil = estadoCivil;
        this.afiliacion = afiliacion;
        this.padecimientos = padecimientos;
        this.cohabitacion = cohabitacion;
        this.email = email;
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

    public String getEscolaridad() {
        return escolaridad;
    }

    public void setEscolaridad(String escolaridad) {
        this.escolaridad = escolaridad;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getAfiliacion() {
        return afiliacion;
    }

    public void setAfiliacion(String afiliacion) {
        this.afiliacion = afiliacion;
    }

    public String getPadecimientos() {
        return padecimientos;
    }

    public void setPadecimientos(String padecimientos) {
        this.padecimientos = padecimientos;
    }

    public boolean getCohabitacion() {
        return cohabitacion;
    }

    public void setCohabitacion(boolean cohabitacion) {
        this.cohabitacion = cohabitacion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAmai() {
        return amai;
    }

    public void setAmai(String amai) {
        this.amai = amai;
    }

    public String getKartz() {
        return kartz;
    }

    public void setKartz(String kartz) {
        this.kartz = kartz;
    }

    public String getMental() {
        return mental;
    }

    public void setMental(String mental) {
        this.mental = mental;
    }

    public String getBarthel() {
        return barthel;
    }

    public void setBarthel(String barthel) {
        this.barthel = barthel;
    }

    public String getLawtonBrody() {
        return lawtonBrody;
    }

    public void setLawtonBrody(String lawtonBrody) {
        this.lawtonBrody = lawtonBrody;
    }

    public Integer getEscalaDepresion() {
        return escalaDepresion;
    }

    public void setEscalaDepresion(Integer escalaDepresion) {
        this.escalaDepresion = escalaDepresion;
    }

    public String getNutricional() {
        return nutricional;
    }

    public void setNutricional(String nutricional) {
        this.nutricional = nutricional;
    }

    public Integer getPerdidaPeso() {
        return perdidaPeso;
    }

    public void setPerdidaPeso(Integer perdidaPeso) {
        this.perdidaPeso = perdidaPeso;
    }

    public String getResistencia() {
        return resistencia;
    }

    public void setResistencia(String resistencia) {
        this.resistencia = resistencia;
    }

    public Double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(Double velocidad) {
        this.velocidad = velocidad;
    }

    public Double getDebilitamiento() {
        return debilitamiento;
    }

    public void setDebilitamiento(Double debilitamiento) {
        this.debilitamiento = debilitamiento;
    }

    public Boolean getActividad() {
        return actividad;
    }

    public void setActividad(Boolean actividad) {
        this.actividad = actividad;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
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
        if (!(object instanceof Formulariogeneral)) {
            return false;
        }
        Formulariogeneral other = (Formulariogeneral) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sistema.tercerapp.model.Formulariogeneral[ id=" + id + " ]";
    }
    
}
