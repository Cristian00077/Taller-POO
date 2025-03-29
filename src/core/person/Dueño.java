
package core.person;

import core.mascota.Mascota;
import java.util.ArrayList;

public class Dueño extends Persona{
    
    private ArrayList<Mascota> mascotas = new ArrayList<>();
    public Dueño(String nombre) {
        super(nombre);
    }

    public String getNombre() {
        return nombre;
    }
    
    public void addMascota(Mascota mascota){
        mascotas.add(mascota);  
    }
}
