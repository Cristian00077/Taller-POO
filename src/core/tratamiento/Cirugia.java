/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.tratamiento;
import core.mascota.Mascota;
import core.person.Doctor;
import java.time.LocalDateTime;
/**
 *
 * @author User
 */
public class Cirugia extends Tratamiento{
    public Cirugia(LocalDateTime fecha){
        super(fecha);
    }
    public Cirugia(){
        super();
    }
}
