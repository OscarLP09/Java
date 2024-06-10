package Actividad5;

//Clase Hija
public class CuentaAhorros extends Cuenta {
    private boolean activa;

    public CuentaAhorros(float saldo){
        super(saldo);
        //Si el saldo es mayor o igual a 10000, entonces estará activo
        activa = saldo > 10000;
    }

    @Override
    public void Consignar(float cantidad) {
        if (activa){
            super.Consignar(cantidad);
        }
        
    }

    @Override
    public void Retirar(float cantidad) {
        if(activa){
            super.Retirar(cantidad);
        }
       
    }

    public void Imprimir(){
        System.out.println("Saldo = $ " + saldo);
        System.out.println("Número de transacciones = " + numero_consignaciones + numero_retiros);
    }
    

}
