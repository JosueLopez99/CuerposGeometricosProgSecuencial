import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        
        double generatriz, RadioMayor, radio,altura;
        double AreaBaseMayor, AreaBaseMenor;
        double AreaLateral, AreaTotal, Volumen;
        Scanner lector = new Scanner(System.in);

        System.out.println("Ingrese la generatriz");
        generatriz = lector.nextDouble();

    System.out.println("Ingrese el radio mayor");
    RadioMayor = lector.nextDouble();

    System.out.println("Ingrese el radio");
    radio = lector.nextDouble();

     System.out.println("Ingrese la altura");
    altura= lector.nextDouble();

    System.out.println("Ingrese el Area Base Mayor");
    AreaBaseMayor = lector.nextDouble();

     System.out.println("Ingrese el Area Base Menor");
    AreaBaseMenor = lector.nextDouble();

    AreaLateral = (3.14*generatriz)*(RadioMayor+radio);

    System.out.println("El area lateral es " + AreaLateral);

    //=========================================================
    AreaTotal = AreaLateral + AreaBaseMayor + AreaBaseMenor;

    System.out.println("El area total es " + AreaTotal);

    //====================================================
    

    Volumen = (1/3)*3.14*altura*(RadioMayor*RadioMayor)+(radio*radio)+RadioMayor*radio;

    System.out.println("El volumen es " +  Volumen);


       }    
    }
