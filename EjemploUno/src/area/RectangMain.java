package area;

import java.util.Scanner;

public class RectangMain {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Dame el valor de la base: ");
    int base = sc.nextInt();

    System.out.println("Dame el valor de la altura: ");
    int altura = sc.nextInt();


    Rectangulo mensajero = new Rectangulo(base, altura);
    mensajero.Imprimir();

    sc.close();


    }
}
