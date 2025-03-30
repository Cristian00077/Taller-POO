
package core.person;

import core.tratamiento.Tratamiento;
import java.util.ArrayList;

public class Doctor extends Persona{
    
    private ArrayList<Tratamiento> tratamientos = new ArrayList<>();
    public Doctor(String nombre){
        super(nombre);
    }

    public ArrayList<Tratamiento> getTratamientos() {
        return tratamientos;
    }
}
