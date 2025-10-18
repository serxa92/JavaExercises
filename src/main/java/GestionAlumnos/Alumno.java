package GestionAlumnos;

public class Alumno {

    String nombre;
    String apellido;
    int dni;
    int nota;
    String notaLetra;

    public Alumno(String nombre, String apellido, int dni, int nota, String notaLetra) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.nota = nota;
        this.notaLetra = notaLetra;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getDni() {
        return dni;
    }

    public int getNota() {
        return nota;
    }

    public String getNotaLetra() {
        return notaLetra;
    }

    public void setNotaLetra(String notaLetra) {
        this.notaLetra = notaLetra;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
}//class
