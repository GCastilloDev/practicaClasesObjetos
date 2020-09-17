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
public class Maestro {

    private String nombre;
    private String asignatura;
    private String gradoAcademico;

    public Maestro(String nombre, String asignatura, String gradoAcademico) {
        this.nombre = nombre;
        this.asignatura = asignatura;
        this.gradoAcademico = gradoAcademico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public String getGradoAcademico() {
        return gradoAcademico;
    }

    public void setGradoAcademico(String gradoAcademico) {
        this.gradoAcademico = gradoAcademico;
    }

    @Override
    public String toString() {
        return "Maestro{" + "nombre=" + nombre + ", asignatura=" + asignatura + ", gradoAcademico=" + gradoAcademico + '}';
    }

    public String prepararClase() {
        return "El maestro " + this.nombre + " esta preparando su clase de " + this.asignatura;
    }

    public String darClase(String grupo) {
        return "El maestro " + this.nombre + " esta dando clases al grupo " + grupo + " de la materia de " + this.asignatura;
    }

    public String dejarTarea(String grupo) {
        return "El maestro " + this.nombre + " ha dejado tarea :( al grupo " + grupo + " de la materia de " + this.asignatura;
    }

}
