package Actividad5;

//Clase Padre

public class Cuenta {
    //Atributos
    protected float saldo;
    protected int numero_consignaciones;
    protected int numero_retiros;

    //Constructor inicializando saldo
    public Cuenta(float saldo){
        this.saldo = saldo;
    }

    //Método Consignar
    public void Consignar(float cantidad){
       saldo = saldo + cantidad;
       //Actualizar numero de consignaciones
       numero_consignaciones = numero_consignaciones + 1;
    }

    public void Retirar(float cantidad){
        float nuevo_saldo = saldo - cantidad;

        if (nuevo_saldo >= 0){
            saldo -= cantidad;
            numero_retiros += 1;
        }else{
            System.out.println("La cantidad excede el saldo actual");
        }
        
        
    }

}
