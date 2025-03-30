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
    public Tratamiento(){
    }

    public ArrayList<Doctor> getDoctores() {
        return doctores;
    }

    public ArrayList<Mascota> getMascotas() {
        return mascotas;
    }

    public void setDoctores(ArrayList<Doctor> doctores) {
        this.doctores = doctores;
    }

    public void setMascotas(ArrayList<Mascota> mascotas) {
        this.mascotas = mascotas;
    }

    public void addDoctor(Doctor doctor) {
        if (!doctores.contains(doctor)) {
            doctores.add(doctor);
            doctor.addTratamiento(this);
        }
    }

    public void addMascota(Mascota mascota) {
        if (!mascotas.contains(mascota)) {
            mascotas.add(mascota);
            mascota.addTratamiento(this);
        }
    }
}
