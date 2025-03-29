
package core.mascota;

import core.person.Dueño;

public class Gato extends Mascota{
    
    public Gato(String nombre, String raza, int edad, float altura, float peso, Dueño dueño) {
        super(nombre, raza, edad, altura, peso, dueño);
        this.especie = "Gato";
    }
    
}
