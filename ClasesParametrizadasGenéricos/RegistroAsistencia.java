package ClasesParametrizadasGenéricos;
/*
 * Autor: Cristopher Gerardo Villanueva Ramirez
 * Fecha: 30/10/2026
 * Descripción: Clase RegistroAsistencia<T>: guarda quiénes asistieron a clase; T puede ser nombre, matrícula, etc.
 */

import java.util.ArrayList;

public class RegistroAsistencia<T> {

    private String nombreClase;
    private ArrayList<T> asistentes;

    public RegistroAsistencia(String nombreClase) {
        this.nombreClase = nombreClase;
        this.asistentes = new ArrayList<>();
    }

    public void registrar(T alumno) {
        if (!asistentes.contains(alumno)) {
            asistentes.add(alumno);
        }
    }

    public boolean asistio(T alumno) {
        return asistentes.contains(alumno);
    }

    public void mostrarRegistro() {
        System.out.println("Asistencia de " + nombreClase + " (" + asistentes.size() + " alumnos):");
        for (T alumno : asistentes) {
            System.out.println(" - " + alumno);
        }
    }

    public static void main(String[] args) {
        RegistroAsistencia<String> registro = new RegistroAsistencia<>("Programación");
        registro.registrar("Ana");
        registro.registrar("Luis");
        registro.registrar("Ana"); // Repetido: no se agrega otra vez
        registro.mostrarRegistro();
        System.out.println("¿Luis asistió? " + registro.asistio("Luis"));
        System.out.println("¿Marta asistió? " + registro.asistio("Marta"));
    }
}