
package core.tratamiento;

import core.mascota.Mascota;
import core.person.Doctor;
import java.time.LocalDateTime;
import java.util.ArrayList;

public abstract class Tratamiento {
    protected ArrayList<Doctor> doctores = new ArrayList<>();
    protected ArrayList<Mascota> mascotas = new ArrayList<>();
    protected LocalDateTime fecha;

    public Tratamiento(LocalDateTime fecha) {
        this.fecha = fecha;
    }
}
