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
@NamedQueries(@NamedQuery(name="VehiculoPojo.getAll",query="SELECT e FROM Vehiculo e"))
public class VehiculoPojo implements Serializable{
    @Id
    private String id;
    @Column
    private  String matricula;
    @Column
    private  String claseVehiculo;

    public VehiculoPojo(String matricula, String claseVehiculo) {
        this.matricula = matricula;
        this.claseVehiculo = claseVehiculo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getClaseVehiculo() {
        return claseVehiculo;
    }

    public void setClaseVehiculo(String claseVehiculo) {
        this.claseVehiculo = claseVehiculo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
}
