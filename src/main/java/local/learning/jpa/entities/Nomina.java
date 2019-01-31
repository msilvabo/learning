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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
/**
 *
 * @author moises.silva
 */
@Entity
@Table(name="nominas")
public class Nomina implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    @Size(min=1,max=4)
    private Integer id;
    
    @Basic(optional = false)
    @NotNull
    @Column(name = "descripcion")
    @Size(min=1,max=60)
    private String descripcion;
    
    @Basic(optional=false)
    @NotNull
    @Column(name="mes")
    private int mes;

    @OneToMany(mappedBy = "nomina")
    private List<DetalleNomina> detalleNominaList;
    
    public Nomina() {
    }

    public Nomina(Integer id) {
        this.id = id;
    }

    public Nomina(Integer id, String descripcion, Integer mes) {
        this.id = id;
        this.descripcion = descripcion;
        this.mes = mes;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }
    
    @Override
    public String toString() {
        return "Nomina{" + "id=" + id + '}';
    }

    public List<DetalleNomina> getDetalleNominaList() {
        return detalleNominaList;
    }

    public void setDetalleNominaList(List<DetalleNomina> detalleNominaList) {
        this.detalleNominaList = detalleNominaList;
    }
    
    
}
