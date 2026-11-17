package tp1.ejercicio05;

public class Main {
    public static void main(String[] args) {
        Rectangulo dibujo = new Rectangulo();
        dibujo.setBase(7.5);
        dibujo.setAltura(4);

        System.out.println("Base: " + dibujo.getBase());
        System.out.println("Altura: " + dibujo.getAltura());
        System.out.println("Área: " + dibujo.calcularArea());
    }
}

class Rectangulo {
    private double base;
    private double altura;

    public void setBase(double medida) {
        base = medida;
    }

    public double getBase() {
        return base;
    }

    public void setAltura(double medida) {
        altura = medida;
    }

    public double getAltura() {
        return altura;
    }

    public double calcularArea() {
        return base * altura;
    }
}
