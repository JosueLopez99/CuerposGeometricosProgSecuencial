import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner lector = new Scanner(System.in);
        double radio, numgrados;
        double Area, Volumen;

        System.out.println("Ingrese el radio");
        radio = lector.nextDouble();

        System.out.println("Ingrese el numero de grados");
        numgrados = lector.nextDouble();

        Area = (4*3.14) * (radio*radio)*(numgrados)/360;

    System.out.println("El Area del Huso Esferico es " + Area);

    //========================================================

    Volumen = (4/3) * (3.14*(radio*radio*radio)*numgrados)/360;
    System.out.println("El Volumen de la cuña Esferica es " + Volumen);

    }
}
