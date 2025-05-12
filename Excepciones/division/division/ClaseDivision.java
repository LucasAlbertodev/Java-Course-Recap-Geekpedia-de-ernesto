package division;

import java.util.Scanner;

public class ClaseDivision {
    public static void main(String[] args) {

        try {
            int valor1, valor2, resultado;
            Scanner sc = new Scanner(System.in);
    
            System.out.println("Dame el primer valor");
            valor1 = sc.nextInt();
    
            System.out.println("Dame el segundo valor");
            valor2 = sc.nextInt();
    
    
            resultado = valor1/valor2;
    
            System.out.println("Division es igual a : "+resultado);
    
            sc.close();
            
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Error!! " + e);
        }
       
    }

}
