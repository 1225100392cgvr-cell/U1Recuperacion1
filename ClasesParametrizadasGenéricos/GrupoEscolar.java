package ClasesParametrizadasGenéricos;
/*
 * Autor: Cristopher Gerardo Villanueva Ramirez
 * Fecha de creación / última modificación: 30/10/2026
 * Descripción: Clase GrupoEscolar<T>: representa un grupo con nombre y una lista de integrantes de cualquier tipo.
 */

import java.util.ArrayList;

public class GrupoEscolar<T> {

    private String nombreGrupo;
    private ArrayList<T> integrantes;

    public GrupoEscolar(String nombreGrupo) {
        this.nombreGrupo = nombreGrupo;
        this.integrantes = new ArrayList<>();
    }

    public void agregarIntegrante(T integrante) {
        integrantes.add(integrante);
    }

    public boolean eliminarIntegrante(T integrante) {
        return integrantes.remove(integrante);
    }

    public int totalIntegrantes() {
        return integrantes.size();
    }

    public void mostrarGrupo() {
        System.out.println("Grupo " + nombreGrupo + " con " + totalIntegrantes() + " integrantes:");
        for (T integrante : integrantes) {
            System.out.println(" - " + integrante);
        }
    }

    public static void main(String[] args) {
        GrupoEscolar<String> grupo = new GrupoEscolar<>("3A");
        grupo.agregarIntegrante("Sofía");
        grupo.agregarIntegrante("Carlos");
        grupo.agregarIntegrante("Valeria");
        grupo.mostrarGrupo();

        grupo.eliminarIntegrante("Carlos");
        grupo.mostrarGrupo();
    }
}