package ejemplos;
public class Conversiones {
    public static void main(String[] args) {
       double anguloEnGrados = 45;

       double anguloEnRadianes = Math.toRadians(anguloEnGrados);
       System.out.println("Deg a Rad: " + anguloEnGrados + " = " + anguloEnRadianes + " Rad");


       anguloEnGrados = Math.toRadians(anguloEnRadianes);
       System.out.println("Rad a Deg: " +anguloEnRadianes + " = " + anguloEnGrados + " Deg");
    }

}
