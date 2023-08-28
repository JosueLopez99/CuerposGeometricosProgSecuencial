import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    
         Scanner lector = new Scanner(System.in);
        
        double radio, area, volumen;

        System.out.println("Ingrese el radio");
        radio = lector.nextDouble();

        area = (4 * 3.14)*(radio * radio);

       System.out.println("EL valor de area es " + area);

       //===================================================

      volumen = (4/3 * 3.14) * (radio * radio * radio);

      System.out.println("El valor de volumen es " + volumen);





    
    }
}
