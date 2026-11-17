package tp1.ejercicio03;

public class Main {
    public static void main(String[] args) {
        Auto[] garage = {
            new Auto("Ford", "Ka", "azul"),
            new Auto("Honda", "Fit", "negro"),
            new Auto("Chevrolet", "Onix", "plata")
        };

        for (Auto auto : garage) {
            auto.mostrarDatos();
        }
    }
}

class Auto {
    private String marca;
    private String modelo;
    private String color;

    public Auto(String marca, String modelo, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }

    public void mostrarDatos() {
        System.out.printf("Tengo un %s modelo %s de color %s.%n", marca, modelo, color);
    }
}
