package tp1.ejercicio04;

public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria();
        cuenta.setSaldo(2400);
        System.out.println("Saldo cargado: " + cuenta.getSaldo());

        cuenta.setSaldo(1850.25);
        System.out.println("Saldo actualizado: " + cuenta.getSaldo());
    }
}

class CuentaBancaria {
    private double saldo;

    public void setSaldo(double nuevoSaldo) {
        saldo = nuevoSaldo;
    }

    public double getSaldo() {
        return saldo;
    }
}
