package lista_tipo_pila;

import java.util.Scanner;

public class ClasePrincipal {

    public static void main(String[] args) {

        int opcion = 0, nodo = 0;
        Pila pila = new Pila();

        Scanner sc = new Scanner(System.in);

        do {
            try {

                System.out.print("Menu de Opciones:\n\n");
                System.out.print("1. Insertar un nodo\n");
                System.out.print("2. Eliminar un nodo\n");
                System.out.print("3. La pila esta vacia?\n");
                System.out.print("4. Cual es el ultimo valor ingresado en la pila\n");
                System.out.print("5. Cuantos nodos tiene la pila?\n");
                System.out.print("6. Vaciar Pila\n");
                System.out.print("7. Mostrar contenido de la pila\n");
                System.out.print("8. Salir\n");
                opcion = sc.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Por favor ingresa el valor a guardar en el nodo");
                        nodo = sc.nextInt();
                        pila.InsertarNodo(nodo);
                        break;
                    case 2:
                        if (!pila.PilaVacia()) {
                            System.out.println("Se ha eliminado un nodo con el valor: "
                                    + pila.EliminarNodo());
                        } else {
                            System.out.println("La pila no esta vacia");
                        }

                        break;
                    case 3:
                        if (pila.PilaVacia()) {
                            System.out.println("La pila esta vacia");
                        } else {
                            System.out.println("La pila no esta vacia");
                        }

                        break;
                    case 4:
                        if (!pila.PilaVacia()) {
                            System.out.println("El ultimo valor ingresado en la pila es: "
                                    + pila.MostrarUltimoValorIngresado());
                        } else {
                            System.out.println("La pila esta vacia");
                        }

                        break;
                    case 5:
                        System.out.println("La pila contiene: " + pila.TananoPila() + " nodos.");

                        break;
                    case 6:
                        if (!pila.PilaVacia()) {
                            pila.VaciarPila();
                            System.out.println("La pila se va vaciado correctamente");
                        } else {
                            System.out.println("La pila esta vacia");
                        }

                        break;
                    case 7:
                        pila.MostrarValores();
                        break;
                    case 8:
                        System.out.println("---------------------");
                        System.out.println("Saliendo del programa");
                        System.out.println("---------------------");
                        opcion = 8;
                        sc.close();
                        break;

                    default:
                        System.out.println("Opcion invalida");
                        break;
                }

            } catch (Exception e) {
                // TODO: handle exception
                sc.close();
            }

        } while (opcion != 8);
    }
}
