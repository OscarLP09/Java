package modulo2.src;
import java.util.Scanner;
public class Actividad2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        float descuento = 0;
        float precio_final = 0;

        System.out.print("Introduzca su nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese el valor de la compra: ");
        float compra = sc.nextFloat();

        if (compra < 80){
            descuento = 0;
        
        }else if (compra >= 80 && compra < 170){
            descuento = (float) 0.1;

        
        }else if (compra >= 170 && compra < 350 ){
            descuento = (float) 0.15;
        
        }else if (compra >= 350 && compra < 600){
            descuento = (float) 0.2;
        
        }else{
            System.out.println("Introduzca una compra válida");
        }
        precio_final = compra - (compra * descuento);
        System.out.println(
            "Nombre del cliente: " + nombre + "\n" +
            "Valor de la compra: " + compra + "\n" +
            "Valor de la compra con descuento: " + precio_final
        );
    }

}
