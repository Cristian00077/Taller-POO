package core;

import core.mascota.Mascota;
import core.person.Doctor;
import core.tratamiento.Tratamiento;
import java.util.*;

public class PetHealth {

    private ArrayList<Doctor> doctores = new ArrayList<>();
    private ArrayList<Mascota> mascotas = new ArrayList<>();

    public PetHealth() {
    }

    public void addDoctor(Doctor doctor) {
        this.doctores.add(doctor);
    }

    public void addMascota(Mascota mascota) {
        this.mascotas.add(mascota);
    }

    public Doctor docMaxGatosTratamiento(Tratamiento tratamientoBusqueda) {
        int maxTratCumple = -1;
        int indexDocMax = 0;
        int indexDoc = 0;
        for (Doctor doctor : this.doctores) {
            int tratamientoCumple = 0;
            ArrayList<Tratamiento> tratamientosDoc = doctor.getTratamientos();
            for (Tratamiento tratamientoDoc : tratamientosDoc) {
                if (tratamientoDoc.equals(tratamientoBusqueda)) {
                    ArrayList<Mascota> mascotasTrat = tratamientoDoc.getMascotas();
                    for (Mascota mascotaTrat : mascotasTrat) {
                        if (mascotaTrat.getEspecie().equals("Gato")) {
                            tratamientoCumple++;
                        }
                    } 
               }
            }
            if (tratamientoCumple > maxTratCumple) {
                indexDocMax = indexDoc;
            }
            indexDoc++;
        }

        return this.doctores.get(indexDocMax);
    }
}
