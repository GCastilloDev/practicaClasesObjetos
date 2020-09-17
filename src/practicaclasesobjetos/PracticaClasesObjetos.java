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
public class PracticaClasesObjetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Estudiante estudiante = new Estudiante("Gustavo", "TI", 32);

        System.out.println("********* Propiedades del estudiante *********");
        System.out.println(estudiante.toString());
        System.out.println("********* Acciones del estudiante *********");
        System.out.println(estudiante.estudiar());
        System.out.println(estudiante.irEscuela());
        System.out.println(estudiante.hacerTarea("Programación de aplicaciones"));
        System.out.println("");
        System.out.println("");
        
        Maestro maestro = new Maestro("Arturo Alegría", "Programación de aplicaciones", "Master en programación");

        System.out.println("********* Propiedades del maestro *********");
        System.out.println(maestro.toString());
        System.out.println("********* Acciones del maestro *********");
        System.out.println(maestro.prepararClase());
        System.out.println(maestro.darClase("702"));
        System.out.println(maestro.dejarTarea("702"));
        System.out.println("");
        System.out.println("");
        
        
        Smartphone smartphone = new Smartphone("Xiaomi", "Mi8 Lite", "android");
        
        System.out.println("********* Propiedades del smartphone *********");
        System.out.println(smartphone.toString());
        System.out.println("********* Acciones del smartphone *********");
        System.out.println(smartphone.llamar("novia"));
        System.out.println(smartphone.instalarApp("ClassRoom"));
        System.out.println(smartphone.bloquear());
        

    }

}
