package clases;

public class Pila {

    private Nodo UltimoValorIngresado;

    public Pila() {
        UltimoValorIngresado = null;
    }

    //metodo para insertar dentro de la pila
    public void Insertar(char valor) {
        Nodo nuevo_nodo = new Nodo();
        nuevo_nodo.informacion = valor;

        if (UltimoValorIngresado == null) {

            nuevo_nodo.siguiente = null;
            UltimoValorIngresado = nuevo_nodo;

        } else {

            nuevo_nodo.siguiente = UltimoValorIngresado;
            UltimoValorIngresado = nuevo_nodo;

        }
    }

    //metodo para extraer una pila
    
}
