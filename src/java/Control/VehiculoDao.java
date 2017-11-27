/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Modelo.VehiculoPojo;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;

/**
 *
 * @author jairo
 */
@Stateless
public class VehiculoDao implements VehiculoDaoLocal {
    
    private EntityManager em;
    public void anadirVehiculo(VehiculoPojo vehiculo) {
        em.persist(vehiculo);
    }

    @Override
    public void editarVehiculo(VehiculoPojo vehiculo) {
        em.merge(vehiculo);
    }

    @Override
    public VehiculoPojo leerVehiculo(String id) {
        return em.find(VehiculoPojo.class, id);
    }

    @Override
    public void borrarVehiculo(String id) {
        VehiculoPojo vehiculo = leerVehiculo(id);
        em.remove(vehiculo);
    }

    @Override
    public List<VehiculoPojo> getAllVehiculos() {
        return em.createNamedQuery("VehiculoPojo.getAll").getResultList();
    }
    
    
    

    
}
