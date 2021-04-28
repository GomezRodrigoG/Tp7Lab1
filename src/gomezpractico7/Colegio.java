/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gomezpractico7;

import entities.Alumno;
import entities.Materia;

/**
 *
 * @author Rodrigo
 * 
 * En el método main de una clase de nombre Colegio:
 */
public class Colegio {
    public static void main(String[] args) {
        /*
        a) Crear las materias:
            i. Ingles I de primer año.
            ii. Matemáticas de primer año.
            iii. Laboratorio 1 de primer año 
        */
        Materia inglesI = new Materia(1, "Ingles I", 1);
        Materia matematicas = new Materia(2, "Matematicas", 1);
        Materia laboratorio1 = new Materia(3, "Laboratorio 1", 1);
        
        /*
            b) Crear 2 alumnos.
                a. López Martin con legajo 1001.
                b. Martínez Brenda con legajo 1002.
        */
        Alumno lopez = new Alumno(1001, "Lopez", "Martin");
        Alumno martinez = new Alumno(1002, "Martinez", "Brenda");
        
        //c) Inscribir a López en las 3 materias.
        lopez.agregarMateria(matematicas);
        lopez.agregarMateria(inglesI);
        lopez.agregarMateria(laboratorio1);
        
        //d) Inscribir a Martínez en las 3 materias y volver a inscribirlo en Laboratorio 1.
        martinez.agregarMateria(matematicas);
        martinez.agregarMateria(inglesI);
        martinez.agregarMateria(laboratorio1);
        martinez.agregarMateria(laboratorio1);
        
        //e) Visualizar la cantidad de materias a las que está inscripto cada alumno.
        System.out.println("Materias en las que esta inscripto Lopez: " + lopez.cantidadMaterias());
        System.out.println("Materias en las que esta inscripta Martinez: " + martinez.cantidadMaterias());
    }
}
