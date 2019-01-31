/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package local.learning.jpa.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author moises.silva
 */
@Entity
@Table(name = "usuarios")
public class Usuario implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;
    
    @Basic(optional = false)
    @NotNull
    @Size(min=3, max=20)
    @Column(name="nombre")
    private String nombres;
    
    @Basic(optional = false)
    @NotNull
    @Size(min=3, max=20)
    @Column(name="apellidos")
    private String apellidos;

    @Basic(optional = false)
    @NotNull
    @Size(min=8, max=15)
    @Column(name="num_documento")    
    private String num_documento;
    
    @Basic(optional = false)
    @NotNull
    @Size(min=6, max=50)
    @Column(name="email")      
    private String email;

    @Basic(optional = false)
    @NotNull
    @Size(min=8, max=100)
    @Column(name="password")      
    private String password;

    @Basic(optional = true)
    @NotNull
    @Size(min=5, max=40)
    @Column(name="direccion")      
    private String direccion;
    
    @Basic(optional = false)
    @NotNull
    @Column(name="sueldo_basico")    
    private double sueldo_basico;
    
    @Basic(optional = true)
    @Column(name="activo")
    private Boolean activo;
    
    @JoinColumn(name="id_cargo", referencedColumnName = "id")
    @OneToOne(optional=false, mappedBy = "usuario")
    private Cargo cargo;

    @JoinColumn(name="id_tipo_documento", referencedColumnName = "id")
    @ManyToOne(optional=false)
    private TipoDocumento tipodocumento;

    @JoinColumn(name="id_ciudad", referencedColumnName = "id")
    @ManyToOne(optional=false)
    private Ciudad ciudad; 
    
    //OneToMany
    @OneToMany(mappedBy = "jefeinmediato")
    private List<Usuario> usuariosList;
    
    //ManyToOne
    @JoinColumn(name = "id_jefe_inmediato",referencedColumnName = "id")
    @ManyToOne(optional = true)
    private Usuario jefeinmediato;

    @OneToMany(mappedBy = "empleado")
    private List<DetalleNomina> detalleNominaList;
    
    @OneToMany(mappedBy = "usuario")
    private List<UsuariosHasRoles> usuariosHasRolesList;
    
    public Usuario() {
    }

    public Usuario(Integer id) {
        this.id = id;
    }

    public Usuario(Integer id, String nombres, String apellidos, String num_documento, String email, String password, double sueldo_basico) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.num_documento = num_documento;
        this.email = email;
        this.password = password;
        this.sueldo_basico = sueldo_basico;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNum_documento() {
        return num_documento;
    }

    public void setNum_documento(String num_documento) {
        this.num_documento = num_documento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getSueldo_basico() {
        return sueldo_basico;
    }

    public void setSueldo_basico(double sueldo_basico) {
        this.sueldo_basico = sueldo_basico;
    }

    public Boolean isActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public TipoDocumento getTipodocumento() {
        return tipodocumento;
    }

    public void setTipodocumento(TipoDocumento tipodocumento) {
        this.tipodocumento = tipodocumento;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

    public List<Usuario> getUsuariosList() {
        return usuariosList;
    }

    public void setUsuariosList(List<Usuario> usuariosList) {
        this.usuariosList = usuariosList;
    }

    public Usuario getJefeinmediato() {
        return jefeinmediato;
    }

    public void setJefeinmediato(Usuario jefeinmediato) {
        this.jefeinmediato = jefeinmediato;
    }
    
    public List<DetalleNomina> getDetalleNominaList() {
        return detalleNominaList;
    }

    public void setDetalleNominaList(List<DetalleNomina> detalleNominaList) {
        this.detalleNominaList = detalleNominaList;
    }

    public List<UsuariosHasRoles> getUsuariosHasRolesList() {
        return usuariosHasRolesList;
    }

    public void setUsuariosHasRolesList(List<UsuariosHasRoles> usuariosHasRolesList) {
        this.usuariosHasRolesList = usuariosHasRolesList;
    }
        
    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + '}';
    }    
}
