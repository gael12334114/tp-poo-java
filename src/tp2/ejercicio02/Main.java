package tp2.ejercicio02;

public class Main {
    public static void main(String[] args) {
        Auto hatchback = new Auto("Volkswagen", "Gol", 5);
        hatchback.setModelo("Gol Trend");
        hatchback.mostrarInformacion();
    }
}

class Vehiculo {
    private String marca;
    private String modelo;

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }
}

class Auto extends Vehiculo {
    private int cantPuertas;

    public Auto(String marca, String modelo, int cantPuertas) {
        super(marca, modelo);
        setCantPuertas(cantPuertas);
    }

    public void setCantPuertas(int cantPuertas) {
        if (cantPuertas < 1) {
            throw new IllegalArgumentException("El auto debe tener al menos una puerta.");
        }
        this.cantPuertas = cantPuertas;
    }

    public int getCantPuertas() {
        return cantPuertas;
    }

    public void mostrarInformacion() {
        System.out.printf("%s %s de %d puertas.%n", getMarca(), getModelo(), getCantPuertas());
    }
}
