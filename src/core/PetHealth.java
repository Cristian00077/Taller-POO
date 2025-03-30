
package core;

import core.mascota.Mascota;
import core.person.Doctor;
import core.tratamiento.Tratamiento;
import java.util.*;

public class PetHealth {
    private ArrayList<Doctor> doctores = new ArrayList<>();
    private ArrayList<Mascota> mascotas = new ArrayList<>();
    
    public PetHealth(){
    }
    public void addDoctor(Doctor doctor){
        this.doctores.add(doctor);
    }
    public void addMascota(Mascota mascota){
        this.mascotas.add(mascota);
    }
    public Doctor docMaxGatosTratamiento(Tratamiento tratamientoBusqueda){
        int maxGatoCumple = -1;
        int indexDocMax = 0;
        int indexDoc = 0;
        for (Doctor doctor : this.doctores) {
            int gatoCumple = 0;
            ArrayList<Mascota> animalesDoc = doctor.getMascotas();
            for (Mascota mascota : animalesDoc) {
                
                if(mascota.getEspecie().equals("Gato")){
                    
                    ArrayList<Tratamiento> tratamientosGato = mascota.getTratamientos();
                    for (Tratamiento tratamiento : tratamientosGato) {
                        if(tratamiento.equals(tratamientoBusqueda)){
                            gatoCumple++;
                        }
                    }
                }
            }
            if(gatoCumple > maxGatoCumple){
                indexDocMax = indexDoc;
            }
            indexDoc++;
        }
        
        return this.doctores.get(indexDocMax);
    }
}
