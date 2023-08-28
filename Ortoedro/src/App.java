import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner(System.in);

        double altura, longitud , profundidad;
         double Area,Volumen;

         System.out.println("Ingrese la altura");
         altura = lector.nextDouble();

        System.out.println("Ingrese la longitud");
        longitud = lector.nextDouble();

        System.out.println("Ingrese la profundidad");
        profundidad = lector.nextDouble();

        Area = 2*(altura*longitud+altura*profundidad+longitud*profundidad);

    System.out.println("El Area es " + Area);

    //========================================================
    Volumen = (altura*longitud*profundidad);
    System.out.println("El volumen es " + Volumen);


    }
}
