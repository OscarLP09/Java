package modulo3;
import java.util.Scanner;
public class Actividad3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float nota = 0.0f, promedio = 0.0f, sumatoria = 0.0f;

        System.out.print("Ingrese su nombre completo: ");
        String nombre = sc.nextLine();

        for (int i = 1; i <= 5; i++){
            //Solicitar calificaciones
            System.out.println("Calificación obtenida en la materia " + i);
            nota = sc.nextFloat();

            //Sumar las notas ingresadas
            sumatoria = sumatoria + nota;

            //Promedio
            promedio = sumatoria/5;
            
        }

        //Resultado
        if (promedio >= 5.0){
            System.out.println(
            "Buenas tardes " + nombre + "\n" +
            "Su promedio en este semestre ha sido de: " + promedio + "\n" + 
            "Enhorabuena"
        );
        }
        else
        System.out.println(
        "Buenas tardes " + nombre + "\n" +
        "Su promedio en este semestre ha sido de: " + promedio + "\n" +
        "Puede hacerlo mejor"
        );
    
    }

}
