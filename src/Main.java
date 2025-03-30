/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import core.PetHealth;
import core.person.Doctor;
import core.mascota.Gato;
/**
 *
 * @author User
 */
public class Main {
    public static void main(String[] args){
        PetHealth vet = new PetHealth();
        
        vet.addDoctor(new Doctor("Eduardo"));
        vet.addDoctor(new Doctor("Camilo"));
        vet.addDoctor(new Doctor("Gerardo"));
        vet.addDoctor(new Doctor("Lucho"));
        vet.addDoctor(new Doctor("James"));
    }
}
