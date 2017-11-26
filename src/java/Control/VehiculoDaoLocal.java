/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Modelo.VehiculoPojo;
import javax.ejb.Local;

/**
 *
 * @author jairo
 */
@Local
public interface VehiculoDaoLocal {

    void anadirVehiculo(VehiculoPojo vehiculo);

    void editarVehiculo(VehiculoPojo vehiculo);

    VehiculoPojo leerVehiculo(String id);

    void borrarVehiculo(String id);

    
}
