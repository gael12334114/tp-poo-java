package tp1.ejercicio02;

public class Main {
    public static void main(String[] args) {
        Libro[] biblioteca = {
            new Libro("Bestiario", "Julio Cortázar", 1951),
            new Libro("La invención de Morel", "Adolfo Bioy Casares", 1940)
        };

        for (Libro libro : biblioteca) {
            System.out.println(libro.ficha());
        }
    }
}

class Libro {
    private String titulo;
    private String autor;
    private int anio;

    public Libro(String titulo, String autor, int anio) {
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
    }

    public String ficha() {
        return String.format("%s, de %s (%d)", titulo, autor, anio);
    }
}
