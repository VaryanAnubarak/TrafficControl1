package Modelo;



import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;


public abstract class Persona {


    

    /**
     * Default constructor.
     */
    public Persona() {
        this(null, null);
    }

    /**
     * Constructor with some initial data.
     *
     * @param firstName
     * @param lastName
     */
    public Persona(String nombre, String cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
        
    }



    public String getCedula() {
        return cedula;
    }
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
