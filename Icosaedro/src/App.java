  import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner(System.in);

    double altura;
    double Area, Volumen;

    System.out.println("Ingrese la altura");
    altura = lector.nextDouble();

    Area = (altura*altura)*1.73;
    System.out.println("El area es " + Area);

    Area = 5*(altura*altura)*1.73;
    System.out.println("El area es " + Area);

    //===================================
    Volumen = (5/12)*5.23*altura*altura*altura;
    System.out.println("El Volumen es " + Volumen);
  }
}
