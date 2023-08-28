import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner(System.in);

    double altura;
    double Area, Volumen;

    System.out.println("Ingrese la altura");
    altura = lector.nextDouble();

    Area = 2*(altura*altura)*1.73;
    System.out.println("El area es " + Area);
    
    //======================================

    Volumen = (1.41/3)*(altura*altura*altura);
    System.out.println("El volumen es " + Volumen);
    }
}
