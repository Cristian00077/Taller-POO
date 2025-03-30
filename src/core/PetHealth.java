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

    public Doctor getDoctor(int i) {
        return doctores.get(i);
    }

    public Mascota getMascota(int i) {
        return mascotas.get(i);
    }
    
    /**Busca al doctor especifico con el mayor numero de un tipo de tratamiento especifico a realizar en gatos
     * 
     * @param tratamientoBusqueda Usado para identificar que tipo de tratamiento especifico sera buscado
     * 
     * @return Devuelve el doctor especifico que tiene el mayor numero de tratamientos especificos a gatos
     */
    public Doctor docMaxGatosTratamiento(Tratamiento tratamientoBusqueda) {
        int maxTratCumple = -1;
        int indexDocMax = 0;
        int indexDoc = 0;
        for (Doctor doctor : this.doctores) {
            int tratamientoCumple = 0;
            ArrayList<Tratamiento> tratamientosDoc = doctor.getTratamientos(); //Lista de tratamientos que tiene un doctor a recorrer
            for (Tratamiento tratamientoDoc : tratamientosDoc) {
                if (tratamientoDoc.getClass().equals(tratamientoBusqueda.getClass())) { //Se verifica que el tratamiento sea del mismo tipo que se busca (de la misma clase)
                    ArrayList<Mascota> mascotasTrat = tratamientoDoc.getMascotas(); //Lista de animales que tiene un tratamiento en especifico (ya que un tratamiento se le puede hacer a dos animales en una sola cita)
                    for (Mascota mascotaTrat : mascotasTrat) { 
                        if (mascotaTrat.getEspecie().equals("Gato")) { //Se verifica que la mascota sea un gato
                            tratamientoCumple++; //se cuentan cuantos gatos tiene este doctor atravez del tratamiento
                        }
                    } 
               }
            }
            if (tratamientoCumple > maxTratCumple) { //Se verifica si este doctor en especifico es el de mayor numero de gatos
                indexDocMax = indexDoc;
                maxTratCumple = tratamientoCumple;
            }
            indexDoc++;
        }
        return this.doctores.get(indexDocMax); //Se devuelve
    }
}
