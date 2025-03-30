
package core.person;

import core.mascota.Mascota;
import java.util.ArrayList;

public class Doctor extends Persona{
    
    private ArrayList<Mascota> mascotas = new ArrayList<>();
    public Doctor(String nombre) {
        super(nombre);
    }

    public ArrayList<Mascota> getMascotas() {
        return mascotas;
    }
    
    public void addMascota(Mascota mascota){
        this.mascotas.add(mascota);
    }
}
