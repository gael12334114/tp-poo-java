package tp2.ejercicio01;

public class Main {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Martina", 25, 680000);
        empleado.mostrarDatos();
    }
}

class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        setNombre(nombre);
        setEdad(edad);
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException("Ingresá un nombre.");
        }
        this.nombre = nombre.strip();
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

class Empleado extends Persona {
    private double salario;

    public Empleado(String nombre, int edad, double salario) {
        super(nombre, edad);
        setSalario(salario);
    }

    public void setSalario(double salario) {
        if (!Double.isFinite(salario) || salario < 0) {
            throw new IllegalArgumentException("Ingresá un salario finito y no negativo.");
        }
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void mostrarDatos() {
        System.out.printf("%s, %d años | Salario: %.2f%n", getNombre(), getEdad(), getSalario());
    }
}
