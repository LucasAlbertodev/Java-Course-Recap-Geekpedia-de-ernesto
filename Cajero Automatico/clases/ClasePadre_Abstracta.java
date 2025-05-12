package clases;

import java.util.Scanner;

public abstract class ClasePadre_Abstracta {
    protected int transacciones, retiro, deposito;
    private static int saldo;

    Scanner sc = new Scanner(System.in);

    public void Operaciones(){
        int bandera = 0;
        int seleccion = 0;

        do {
            System.out.println("Por favor seleccione una opcion:");
            System.out.println("    1. Consulta de saldo");
            System.out.println("    2. Retiro de efectivo");
            System.out.println("    3. Deposito de efectivo");
            System.out.println("    4. Salir");
            seleccion =sc.nextInt();

            switch (seleccion) {
                case 1:
                    ClasePadre_Abstracta mensajero = new ClaseHija_Consulta();
                    mensajero.Operaciones();
                    break;
                case 2:
                    ClasePadre_Abstracta mensajero_retiro = new ClaseHija_Retiro();
                    mensajero_retiro.Transacciones();
                    break;
                case 3:
                ClasePadre_Abstracta mensajero_depostito = new ClaseHija_Deposito();
                mensajero_depostito.Transacciones();
                    break;
                case 4 :
                System.exit(seleccion);
                sc.close();
                break;
                default:
                System.out.println("---------------------------------");
                System.out.println("Opcion invalida");
                System.out.println("---------------------------------");
                    break;
            }
            
        } while (bandera == 0);
        
    }

    public void Retiro(){
        retiro = sc.nextInt();
    }

    public void Deposito(){
        deposito = sc.nextInt();
    }

    public abstract void Transacciones();

    public int getSaldo(){
        return saldo;
    }

    public void setSaldo(int saldo){
        this.saldo = saldo;
    }
}
