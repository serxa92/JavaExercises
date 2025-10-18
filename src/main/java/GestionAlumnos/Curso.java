package GestionAlumnos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Curso {
    List<Alumno> alumnos = new ArrayList<>();

    //AGREGAR ALUMNOS
    public void agregarAlumno(Alumno alumno) {
        alumnos.add(alumno);

    }

    //BORRAR ALUMNO POR NOMBRE
    public void eliminarAlumnoPorNombre(String nombre) {

        Iterator<Alumno> iter = alumnos.iterator();

        while (iter.hasNext()) {
            Alumno alumno = iter.next();
            if (alumno.getNombre().equals(nombre)) {
                iter.remove();
                break;
            }
        }
    }

    //MOSTRAR ALUMNOS
    public void mostrarAlumnos() {
        System.out.println("-----Lista de alumnos-----");
        for (Alumno alumno : alumnos) {
            System.out.println("Nombre: " + alumno.getNombre());
            System.out.println("Apellido: " + alumno.getApellido());
            System.out.println("DNI: " + alumno.getDni());
            System.out.println("Nota: " + alumno.getNota());
            System.out.println("Nota en texto: " + alumno.getNotaLetra());
            System.out.println("-------------------");
        }
    }
}//class
