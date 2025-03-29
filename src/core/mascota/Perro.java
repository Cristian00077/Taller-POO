
package core.mascota;

import core.person.Dueño;

public class Perro extends Mascota{
    
    public Perro(String nombre, String raza, int edad, float altura, float peso, Dueño dueño) {
        super(nombre, raza, edad, altura, peso, dueño);
        this.especie = "Perro";
    }
    
}
