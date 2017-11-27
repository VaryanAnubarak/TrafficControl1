/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Modelo.ConductorPojo;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;

/**
 *
 * @author jairo
 */
@Stateless
public class ConductorDao implements ConductorDaoLocal {

    private EntityManager em;
    @Override
    public void anadirConductor(ConductorPojo conductor) {
        em.persist(conductor);
    }

    @Override
    public void editarConductor(ConductorPojo conductor) {
        em.merge(conductor);
    }

    @Override
    public ConductorPojo leerConductor(String id) {
        return em.find(ConductorPojo.class, id);
    }

    @Override
    public void borrarConductor(String id) {
        ConductorPojo conductor = leerConductor(id);
        em.remove(conductor);
    }
}
