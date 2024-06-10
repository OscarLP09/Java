package Actividad5;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("-----Cuenta de Ahorros-----");

        System.out.println("Ingrese el saldo inicial: ");
        float saldo_inicial = sc.nextFloat();

        CuentaAhorros cuenta1 = new CuentaAhorros(saldo_inicial);

        System.out.println("Ingrese la cantidad a consignar: ");
        float cantidad_depositar = sc.nextFloat();
        cuenta1.Consignar(cantidad_depositar);

        System.out.println("Ingrese la cantidad a retirar: ");
        float cantidad_retirar = sc.nextFloat();
        cuenta1.Retirar(cantidad_retirar);

        cuenta1.Imprimir();
    }

}
