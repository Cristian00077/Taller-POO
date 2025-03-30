
package core.mascota;

import core.tratamiento.Tratamiento;
import core.person.Dueño;
import java.util.*;


public abstract class Mascota {
    protected String nombre;
    protected String raza;
    protected int edad;
    protected float altura;
    protected float peso;
    protected ArrayList<Tratamiento> tratamientos = new ArrayList<>();
    protected Dueño dueño;
    protected String especie;

    public Mascota(String nombre, String raza, int edad, float altura, float peso, Dueño dueño) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
        this.dueño = dueño;
    }  

    public String getNombre() {
        return nombre;
    }

    public String getRaza() {
        return raza;
    }

    public int getEdad() {
        return edad;
    }

    public float getAltura() {
        return altura;
    }

    public float getPeso() {
        return peso;
    }

    public ArrayList<Tratamiento> getTratamientos() {
        return tratamientos;
    }

    public Dueño getDueño() {
        return dueño;
    }
    
    public void addTratamiento(Tratamiento tratamiento){
        tratamientos.add(tratamiento);
    }

    public String getEspecie() {
        return especie;
    }
    
}
