package Herencia.operaciones;

import java.util.Scanner;

public class ClasePadre {
    protected int valorUno, valorDos, resultado;
    Scanner sc = new Scanner(System.in);

    public void PedirDatos () {
        System.out.print("Dame el primer valor: ");
        valorUno = sc.nextInt();

        System.out.println("Dame el segundo valor");
        valorDos = sc.nextInt();
    }
    
    public void MostrarResultado(){
        System.out.println(resultado);
    }

}
