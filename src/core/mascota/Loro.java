
package core.mascota;

import core.person.Dueño;

public class Loro extends Mascota{
    
    public Loro(String nombre, String raza, int edad, float altura, float peso, Dueño dueño) {
        super(nombre, raza, edad, altura, peso, dueño);
        this.especie = "Loro";
    }
    
}
