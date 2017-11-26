/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author jairo
 */
@Entity
@Table
@NamedQueries(@NamedQuery(name="ConductorPojo.getAll",query="SELECT e FROM Conductor e"))
public class ConductorPojo implements Serializable {
    @Id
    private String id;
    @Column
    private String fechaEntradaPeaje;
    @Column
    private String horaEntradaPeaje;
    @Column
    private String pagoPeaje;
    @Column
    private int tipoPago;
    @Column
    private String nombre;
    @Column
    private String cedula;

    public ConductorPojo(String id, String fechaEntradaPeaje, String horaEntradaPeaje, String pagoPeaje, int tipoPago, String nombre, String cedula) {
        this.id = id;
        this.fechaEntradaPeaje = fechaEntradaPeaje;
        this.horaEntradaPeaje = horaEntradaPeaje;
        this.pagoPeaje = pagoPeaje;
        this.tipoPago = tipoPago;
        this.nombre = nombre;
        this.cedula = cedula;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFechaEntradaPeaje() {
        return fechaEntradaPeaje;
    }

    public void setFechaEntradaPeaje(String fechaEntradaPeaje) {
        this.fechaEntradaPeaje = fechaEntradaPeaje;
    }

    public String getHoraEntradaPeaje() {
        return horaEntradaPeaje;
    }

    public void setHoraEntradaPeaje(String horaEntradaPeaje) {
        this.horaEntradaPeaje = horaEntradaPeaje;
    }

    public String getPagoPeaje() {
        return pagoPeaje;
    }

    public void setPagoPeaje(String pagoPeaje) {
        this.pagoPeaje = pagoPeaje;
    }

    public int getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(int tipoPago) {
        this.tipoPago = tipoPago;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

}  
