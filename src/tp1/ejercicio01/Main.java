package tp1.ejercicio01;

public class Main {
    public static void main(String[] args) {
        Persona una = new Persona();
        una.nombre = "Bruno";
        una.edad = 19;

        Persona otra = new Persona();
        otra.nombre = "Camila";
        otra.edad = 21;

        Persona[] personas = {una, otra};
        for (Persona persona : personas) {
            System.out.printf("%s tiene %d años.%n", persona.nombre, persona.edad);
        }
    }
}

class Persona {
    public String nombre;
    public int edad;
}
