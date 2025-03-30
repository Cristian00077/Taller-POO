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
        vet.addMascota(new Loro("Krippi","naranja",1, 0.40f,2,new Dueño("Mateo")));
        vet.addMascota(new Perro("Keko","naranja",1, 0.40f,2,new Dueño("Mateo")));
        vet.addMascota(new Gato("Tierro","naranja",1, 0.40f,2,new Dueño("Mateo")));
        
        listTrat.add(new ChequeoGeneral(today));
        listTrat.add(new Desparacitacion(today));
        listTrat.add(new Vacunacion(today));
        listTrat.add(new Vacunacion(today));
        listTrat.add(new Cirugia(today));
        listTrat.add(new Cirugia(today));
        listTrat.add(new Cirugia(today));
        
        
        vet.getMascota(0).addTratamiento(listTrat.get(0));
        vet.getMascota(1).addTratamiento(listTrat.get(1));
        vet.getMascota(2).addTratamiento(listTrat.get(2));
        vet.getMascota(3).addTratamiento(listTrat.get(3));
        vet.getMascota(4).addTratamiento(listTrat.get(4));
        vet.getMascota(5).addTratamiento(listTrat.get(5));
        vet.getMascota(6).addTratamiento(listTrat.get(6));
        
        vet.getDoctor(0).addTratamiento(listTrat.get(0));
        vet.getDoctor(0).addTratamiento(listTrat.get(1));
        vet.getDoctor(1).addTratamiento(listTrat.get(2));
        vet.getDoctor(1).addTratamiento(listTrat.get(3));
        vet.getDoctor(2).addTratamiento(listTrat.get(4));
        vet.getDoctor(2).addTratamiento(listTrat.get(5));
        vet.getDoctor(3).addTratamiento(listTrat.get(5));
        vet.getDoctor(3).addTratamiento(listTrat.get(6));
        
        
        System.out.println(vet.docMaxGatosTratamiento(new Cirugia(today)).getNombre());
        
        /* 
        
        Eduardo :   Chequeo - Gato
                    Desparacitacion - Gato
                    
        Camilo :    Vacuna - Gato
                    Vacuna - Gato
        
        Gerardo :   Cirugia - Loro
                    Cirugia - Perro
        
        Luis :      Cirugia - Gato
                    Vacuna - Gato
        
         */ 
    }
}
