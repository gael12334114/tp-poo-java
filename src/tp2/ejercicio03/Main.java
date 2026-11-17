package tp2.ejercicio03;

public class Main {
    public static void main(String[] args) {
        Perro perro = new Perro("Toto", 3, "Caniche");
        System.out.printf("%s, %d años, raza %s.%n", perro.getNombre(), perro.getEdad(), perro.getRaza());
        perro.ladrar();
    }
}

class Animal {
    private String nombre;
    private int edad;

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        setEdad(edad);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setEdad(int edad) {
        if (edad < 0) {
            throw new IllegalArgumentException("La edad no puede ser negativa.");
        }
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }
}

class Perro extends Animal {
    private String raza;

    public Perro(String nombre, int edad, String raza) {
        super(nombre, edad);
        setRaza(raza);
    }

    public void setRaza(String raza) {
        if (raza == null || raza.isBlank()) {
            throw new IllegalArgumentException("Ingresá una raza.");
        }
        this.raza = raza.strip();
    }

    public String getRaza() {
        return raza;
    }

    public void ladrar() {
        System.out.println("el perro está ladrando");
    }
}
