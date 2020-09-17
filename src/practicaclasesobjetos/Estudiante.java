/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaclasesobjetos;

/**
 *
 * @author tavoGeek
 */
public class Estudiante {

    private String nombre;
    private String carrera;
    private Integer edad;

    /**
     *
     * @param nombre Nombre del estudiante
     * @param carrera Carrera del estudiante
     * @param edad Edad del estudiante
     * @return Una instancia de Estudiante
     */
    public Estudiante(String nombre, String carreram, Integer edad) {
        this.nombre = nombre;
        this.carrera = carrera;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String estudiar() {
        return this.nombre + " esta estudiando...";
    }

    public String hacerTarea(String materia) {
        return this.nombre + " esta haciendo tarea de " + materia;
    }

    public String irEscuela() {
        return this.nombre + " va camino a la escuela...";
    }

    @Override
    public String toString() {
        return "Estudiante{" + "nombre=" + nombre + ", carrera=" + carrera + ", edad=" + edad + '}';
    }
}
