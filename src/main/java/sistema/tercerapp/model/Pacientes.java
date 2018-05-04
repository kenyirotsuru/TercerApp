/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.tercerapp.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Francisco
 */
@Entity
@Table(name = "pacientes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pacientes.findAll", query = "SELECT p FROM Pacientes p"),
    @NamedQuery(name = "Pacientes.findById", query = "SELECT p FROM Pacientes p WHERE p.id = :id"),
    @NamedQuery(name = "Pacientes.findByCreacion", query = "SELECT p FROM Pacientes p WHERE p.creacion = :creacion"),
    @NamedQuery(name = "Pacientes.findByLastUpdated", query = "SELECT p FROM Pacientes p WHERE p.lastUpdated = :lastUpdated"),
    @NamedQuery(name = "Pacientes.findByTelefono", query = "SELECT p FROM Pacientes p WHERE p.telefono = :telefono"),
    @NamedQuery(name = "Pacientes.findByNombre", query = "SELECT p FROM Pacientes p WHERE p.nombre = :nombre"),
    @NamedQuery(name = "Pacientes.findByApellidoPaterno", query = "SELECT p FROM Pacientes p WHERE p.apellidoPaterno = :apellidoPaterno"),
    @NamedQuery(name = "Pacientes.findByApellidoMaterno", query = "SELECT p FROM Pacientes p WHERE p.apellidoMaterno = :apellidoMaterno"),
    @NamedQuery(name = "Pacientes.findByEmail", query = "SELECT p FROM Pacientes p WHERE p.email = :email"),
    @NamedQuery(name = "Pacientes.findByDireccion", query = "SELECT p FROM Pacientes p WHERE p.direccion = :direccion"),
    @NamedQuery(name = "Pacientes.findByEdad", query = "SELECT p FROM Pacientes p WHERE p.edad = :edad"),
    @NamedQuery(name = "Pacientes.findByCohabitacion", query = "SELECT p FROM Pacientes p WHERE p.cohabitacion = :cohabitacion"),
    @NamedQuery(name = "Pacientes.findByAfiliacion", query = "SELECT p FROM Pacientes p WHERE p.afiliacion = :afiliacion"),
    @NamedQuery(name = "Pacientes.findByEstadoCivil", query = "SELECT p FROM Pacientes p WHERE p.estadoCivil = :estadoCivil"),
    @NamedQuery(name = "Pacientes.findByActivo", query = "SELECT p FROM Pacientes p WHERE p.activo = :activo"),
    @NamedQuery(name = "Pacientes.findByIdFitbit", query = "SELECT p FROM Pacientes p WHERE p.idFitbit = :idFitbit")})
public class Pacientes implements Serializable {

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
    @Basic(optional = false)
    @NotNull
    @Column(name = "LastUpdated")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUpdated;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "telefono")
    private String telefono;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Apellido Paterno")
    private String apellidoPaterno;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Apellido Materno")
    private String apellidoMaterno;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "direccion")
    private String direccion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "edad")
    private int edad;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cohabitacion")
    private boolean cohabitacion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "afiliacion")
    private boolean afiliacion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "estadoCivil")
    private String estadoCivil;
    @Basic(optional = false)
    @NotNull
    @Column(name = "activo")
    private boolean activo;
    @Column(name = "id_Fitbit")
    private Integer idFitbit;
    @JoinColumn(name = "id_grafica", referencedColumnName = "id")
    @ManyToOne
    private Graficas idGrafica;
    @JoinColumn(name = "id_formularioMovilidad", referencedColumnName = "id")
    @ManyToOne
    private Formulariomovilidad idformularioMovilidad;
    @JoinColumn(name = "id_formularioGeneral", referencedColumnName = "id")
    @ManyToOne
    private Formulariogeneral idformularioGeneral;
    @JoinColumn(name = "id_formularioSS", referencedColumnName = "id")
    @ManyToOne
    private Formularioss idformularioSS;
    @JoinColumn(name = "id_formularioNutricion", referencedColumnName = "id")
    @ManyToOne
    private Formularionutricion idformularioNutricion;

    public Pacientes() {
    }

    public Pacientes(Integer id) {
        this.id = id;
    }

    public Pacientes(Integer id, Date creacion, Date lastUpdated, String telefono, String nombre, String apellidoPaterno, String apellidoMaterno, String email, String direccion, int edad, boolean cohabitacion, boolean afiliacion, String estadoCivil, boolean activo) {
        this.id = id;
        this.creacion = creacion;
        this.lastUpdated = lastUpdated;
        this.telefono = telefono;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.email = email;
        this.direccion = direccion;
        this.edad = edad;
        this.cohabitacion = cohabitacion;
        this.afiliacion = afiliacion;
        this.estadoCivil = estadoCivil;
        this.activo = activo;
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean getCohabitacion() {
        return cohabitacion;
    }

    public void setCohabitacion(boolean cohabitacion) {
        this.cohabitacion = cohabitacion;
    }

    public boolean getAfiliacion() {
        return afiliacion;
    }

    public void setAfiliacion(boolean afiliacion) {
        this.afiliacion = afiliacion;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public boolean getActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public Integer getIdFitbit() {
        return idFitbit;
    }

    public void setIdFitbit(Integer idFitbit) {
        this.idFitbit = idFitbit;
    }

    public Graficas getIdGrafica() {
        return idGrafica;
    }

    public void setIdGrafica(Graficas idGrafica) {
        this.idGrafica = idGrafica;
    }

    public Formulariomovilidad getIdformularioMovilidad() {
        return idformularioMovilidad;
    }

    public void setIdformularioMovilidad(Formulariomovilidad idformularioMovilidad) {
        this.idformularioMovilidad = idformularioMovilidad;
    }

    public Formulariogeneral getIdformularioGeneral() {
        return idformularioGeneral;
    }

    public void setIdformularioGeneral(Formulariogeneral idformularioGeneral) {
        this.idformularioGeneral = idformularioGeneral;
    }

    public Formularioss getIdformularioSS() {
        return idformularioSS;
    }

    public void setIdformularioSS(Formularioss idformularioSS) {
        this.idformularioSS = idformularioSS;
    }

    public Formularionutricion getIdformularioNutricion() {
        return idformularioNutricion;
    }

    public void setIdformularioNutricion(Formularionutricion idformularioNutricion) {
        this.idformularioNutricion = idformularioNutricion;
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
        if (!(object instanceof Pacientes)) {
            return false;
        }
        Pacientes other = (Pacientes) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sistema.tercerapp.model.Pacientes[ id=" + id + " ]";
    }
    
}
