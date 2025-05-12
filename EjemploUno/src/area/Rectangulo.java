package area;


public class Rectangulo {
    private int base;
    private int altura;
    private int area;

    public Rectangulo (int base, int altura){
        this.base = base;
        this.altura = altura;
    }

    public void CalculoArea(){
        area = base * altura;
    }

    public void Imprimir(){
        CalculoArea();
        System.out.println("El area es: " + area);
    }
   
}
