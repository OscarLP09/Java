package modulo1;
import java.util.Scanner;
public class Actividad1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int primer_numero;
        int segundo_numero;

        System.out.print("Ingrese el primer número: ");
        primer_numero = sc.nextInt();

        System.out.print("Ingrese el segundo número: ");
        segundo_numero = sc.nextInt();

        //Suma
        System.out.println("La suma es: " + (primer_numero + segundo_numero));

        // Resta
        System.out.println("La resta es: " + (primer_numero - segundo_numero));

        // Multiplicación
        System.out.println("La multiplicación es: " + (primer_numero * segundo_numero));

        // Comparación
        System.out.println("¿Son iguales? " + (primer_numero == segundo_numero));

        // Menor
        System.out.println("¿El primer numero es menor? " + (primer_numero <= segundo_numero));

        // Mayor
        System.out.println("¿Es mayor el segundo? " + (segundo_numero >= primer_numero));
    }

}
