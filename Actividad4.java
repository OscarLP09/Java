package modulo4;
import java.util.Scanner;

/*En la empresa “Tecnología Rex” necesitan obtener cierta información de los empleados para generar el reporte de nómina mensual. Por eso, te piden que codifiques un programa con las siguientes características:
Debe pedir el nombre completo y el sueldo de cada empleado.
Debe mostrar cuál es el empleado con mayor y menor sueldo.
Debe mostrar el promedio de sueldos en la empresa.

La información que deberás utilizar es la siguiente:
Empleado        Sueldo (usd)
Hugo                2000

Josefina            1000

Elías               2300

Daniela             1100

Juan                1450

Recuerda que la fórmula para calcular el promedio es: 

Promedio = (Sueldo1 + Sueldo2 + Sueldo3 + Sueldo4 + Sueldo5) / Cantidad de sueldos */

public class Actividad4 {
    public static void main(String[] args) {
        //Crear dos arrays
        Scanner sc = new Scanner(System.in);
        String[] empleados = new String [5];
        double[] sueldos = new double[5];

        //Definir variables
        double sumatoria=0.0, promedio = 0.0, mayor = 0.0, menor = 0.0;
        int posicion = 0;

        //Solicitar datos
        for (int i = 0; i < 5; i++){
            System.out.print("Ingrese un nombre: ");
            empleados[i] = sc.next();

            System.out.print("Ingrese el sueldo del empleado/a " + empleados[i]);
            sueldos[i]= sc.nextDouble();

            //Sumar los números ingresados

            sumatoria = sumatoria + sueldos[i];

            promedio = sumatoria / 5;

            //Suponer que el número mayor es el primero que se ingresó

            mayor = sueldos[0];

            for (int r = 0; r < sueldos.length; r++){

                //Obtener número mayor
                if (sueldos[r] > mayor){
                    mayor = sueldos[r];
                    posicion = r;
                }
            }
 

            menor = sueldos[2];

            for (int y = 0; y < sueldos.length; y++){

                if (sueldos[y] < menor){
                    menor = sueldos[y];
                    posicion = y;
                }
            }

            System.out.println(empleados[posicion] + " es el empleado con mayor sueldo y gana " + mayor);
            System.out.println(empleados[posicion] + " es el empleado con menor sueldo y gana " + menor);
            System.out.println("El promedio de sueldos es: " + promedio);
        }

        
    }

}
