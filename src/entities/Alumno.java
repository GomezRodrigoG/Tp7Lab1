/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.ArrayList;
import java.util.HashSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Rodrigo
 */
public class Alumno {
    private int legajo;
    private String apellido;
    private String nombre;
    private HashSet<Materia> materias = new HashSet<>();

    public Alumno(int legajo, String apellido, String nombre) {
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = nombre;
    }

    /* tiene un método agregarMateria que permite inscribir al Alumno en
       una materia determinada (implementar de manera tal que no deje inscribir un alumno en dos
       materias iguales.)
    */
    public void agregarMateria(Materia materia){
        if(materias.add(materia)){
            JOptionPane.showMessageDialog(null, "Inscripcion realizada con éxito.");
        } else {
            JOptionPane.showMessageDialog(null, "No se puede crear inscripcion. El alumno ya estaba inscripto en esta materia");
        }
    }
    
    /*
        otro método cantidadMaterias que devuelve la cantidad de materias a las
        que está inscripto el alumno.
    */
    public int cantidadMaterias(){
        return materias.size();
    }
    
    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int hashCode() {
        return this.legajo;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Alumno other = (Alumno) obj;
        if (this.legajo != other.legajo) {
            return false;
        }
        return true;
    }
    
}
