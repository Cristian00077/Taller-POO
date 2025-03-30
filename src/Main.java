/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import core.PetHealth;
import core.person.Doctor;
import core.mascota.*;
import core.person.Dueño;
import core.tratamiento.*;
import java.util.ArrayList;
import java.time.LocalDateTime;
/**
 *
 * @author User
 */
public class Main {
    public static void main(String[] args){

        PetHealth vet = new PetHealth();
        
        ArrayList<Doctor> listDoc = new ArrayList<>();
        ArrayList<Mascota> listMasc = new ArrayList<>();
        ArrayList<Tratamiento> listTrat = new ArrayList<>();
        LocalDateTime today = LocalDateTime.now();
        
        vet.addDoctor(new Doctor("Eduardo"));
        vet.addDoctor(new Doctor("Camilo"));
        vet.addDoctor(new Doctor("Gerardo"));
        vet.addDoctor(new Doctor("Luis"));
        
        vet.addMascota(new Gato("Cindy","naranja",1, 0.40f,2,new Dueño("Mateo")));
        vet.addMascota(new Gato("Oliva","naranja",1, 0.40f,2,new Dueño("Mateo")));
        vet.addMascota(new Gato("Trueno","naranja",1, 0.40f,2,new Dueño("Mateo")));
        vet.addMascota(new Gato("Flipi","naranja",1, 0.40f,2,new Dueño("Mateo")));
        vet.addMascota(new Gato("Krippi","naranja",1, 0.40f,2,new Dueño("Mateo")));
        vet.addMascota(new Gato("Keko","naranja",1, 0.40f,2,new Dueño("Mateo")));
        vet.addMascota(new Gato("Tierro","naranja",1, 0.40f,2,new Dueño("Mateo")));
        
        Tratamiento trat1 = new ChequeoGeneral(today,vet.getDoctor(0),vet.getMascota(0));
        Tratamiento trat2 = new ChequeoGeneral(today,vet.getDoctor(0),vet.getMascota(0));
        Tratamiento trat3 = new ChequeoGeneral(today,vet.getDoctor(0),vet.getMascota(0));
        
        System.out.println(vet.docMaxGatosTratamiento(new Vacunacion(today)).getNombre());
        
    }
}
