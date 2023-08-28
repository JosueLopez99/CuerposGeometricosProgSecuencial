import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner(System.in);

        double altura;
        double Area, Volumen;

        System.out.println("Ingrese la altura");
        altura = lector.nextDouble();


        Area = 6*(altura*altura);

        Volumen = (altura*altura*altura);

        
        System.out.println("El area es " + Area);

        System.out.println("EL volumen es " + Volumen);

    }
}



