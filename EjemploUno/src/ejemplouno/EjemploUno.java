package ejemplouno;

import java.util.Scanner;

public class EjemploUno {

    public static void main(String[] args) {
        String palabra = "", palabraInvertida = "";
        int longitudPalabra = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe tu palabra o frase: ");
        palabra = sc.nextLine();

        longitudPalabra  = palabra.length();


        while (longitudPalabra != 0) {            
            palabraInvertida += palabra.substring(longitudPalabra - 1, longitudPalabra);
            longitudPalabra --;
        }

        System.out.print("Palabra invertida: " + palabraInvertida);
        System.out.println("");



        

        //me tiene que retornar un substring
        //con un ciclo for recorro la palabra desde palabra.lenght i--
        //returno la palabraInvertida



    }

}
