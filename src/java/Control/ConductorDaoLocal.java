/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Modelo.ConductorPojo;
import javax.ejb.Local;

/**
 *
 * @author jairo
 */
@Local
public interface ConductorDaoLocal {
    void anadirConductor(ConductorPojo conductor);

    void editarConductor(ConductorPojo conductor);

    ConductorPojo leerConductor(String id);

    void borrarConductor(String id);
}
