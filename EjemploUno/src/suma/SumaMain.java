package suma;

import java.util.Scanner;

public class SumaMain {
public static void main(String[] args) {
    Scanner en = new Scanner(System.in);

    System.err.println("Dame el primer valor");
    int valorUno = en.nextInt();

    System.err.println("Dame el segundo valor");
    int valorDos = en.nextInt();
    
    Suma valores = new Suma(valorUno,valorDos);
    valores.Imprimir();

    en.close();
    
}
}
