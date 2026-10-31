package ClasesParametrizadasGenéricos;
/*
 * Autor: Cristopher Gerardo Villanueva Ramirez
 * Fecha: 30/10/2026
 * Descripción: Clase CajaGenerica<T>: caja que puede guardar un objeto de cualquier tipo (texto, número, etc.).
 */

public class CajaGenerica<T> {

    private T contenido;

    public CajaGenerica(T contenido) {
        this.contenido = contenido;
    }

    public T getContenido() {
        return contenido;
    }

    public void setContenido(T contenido) {
        this.contenido = contenido;
    }

    public boolean estaVacia() {
        return contenido == null;
    }

    public static void main(String[] args) {
        CajaGenerica<String> cajaTexto = new CajaGenerica<>("Hola");
        CajaGenerica<Integer> cajaNumero = new CajaGenerica<>(2026);

        System.out.println("Caja de texto: " + cajaTexto.getContenido());
        System.out.println("Caja de número: " + cajaNumero.getContenido());

        cajaTexto.setContenido("Adiós");
        System.out.println("Caja de texto ahora: " + cajaTexto.getContenido());
    }
}