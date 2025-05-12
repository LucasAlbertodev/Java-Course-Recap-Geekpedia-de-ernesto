package lista_tipo_pila;

public class Pila {
    private Nodo UltimoValorIngresado;
    int tamano = 0;
    String Lista = "";

    public Pila(){
        UltimoValorIngresado = null;
        tamano = 0;
    }

    //metodo para saber cuando la pila esta vacia
    public boolean PilaVacia(){
        return UltimoValorIngresado == null;
    }

    //metodo para insertar un nodo en la pila 
    public void InsertarNodo(int nodo){
        Nodo nuevo_nodo = new Nodo(nodo);
        nuevo_nodo.siguiente = UltimoValorIngresado;
        UltimoValorIngresado = nuevo_nodo;
        tamano++;
    }

    //metodo para eliminar un nodo de la pila
    public int EliminarNodo(){
        int aux = UltimoValorIngresado.informacion;
        UltimoValorIngresado = UltimoValorIngresado.siguiente;
        tamano--;
        return aux;
    }

    //metodo para conocer cual es el ultimo valor ingresado
    public int MostrarUltimoValorIngresado(){
        return UltimoValorIngresado.informacion;
    }

    //mostrar tamano de la pila
    public int TananoPila(){
        return tamano;
    }

    //metodo para vaciar la pila
    public void VaciarPila(){
        while (!PilaVacia()) {
            EliminarNodo();
        }
    }

    //metodo para mostrar conteido de la pila
    public void MostrarValores(){
        Nodo recorrido = UltimoValorIngresado;

        while (recorrido != null) {
            Lista += recorrido.informacion + "\n";
            recorrido = recorrido.siguiente;
        }
        
        System.out.println(Lista);
        Lista = "";
    }



}
