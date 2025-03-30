
package core.tratamiento;

import core.mascota.Mascota;
import core.person.Doctor;
import java.time.LocalDateTime;
import java.util.ArrayList;

public abstract class Tratamiento {
    protected ArrayList<Doctor> doctores = new ArrayList<>();
    protected ArrayList<Mascota> mascotas = new ArrayList<>();
    protected LocalDateTime fecha;

    public Tratamiento(LocalDateTime fecha,Doctor doctor,Mascota mascota) {
        this.fecha = fecha;
        this.doctores.add(doctor);
        this.mascotas.add(mascota);
        
        mascota.addTratamiento(this);
        doctor.addTratamiento(this);
    }

    public ArrayList<Doctor> getDoctores() {
        return doctores;
    }

    public ArrayList<Mascota> getMascotas() {
        return mascotas;
    }
    
}
