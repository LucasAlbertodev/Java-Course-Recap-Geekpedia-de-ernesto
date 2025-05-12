package polimorfismo;

import java.util.Scanner;

public abstract class Operaciones_ClasePadre {
    protected int valor1, valor2, resultado;
    Scanner sc = new Scanner(System.in);

    public void PedirDatos(){
        System.out.println("Dame el primer valor: ");
        valor1 = sc.nextInt();

        System.out.println("Dame el segundo valor: ");
        valor2 = sc.nextInt();
    }

     public abstract void Operaciones();

     public void MostrarResultado(){
        System.out.println(resultado);
     }

}
