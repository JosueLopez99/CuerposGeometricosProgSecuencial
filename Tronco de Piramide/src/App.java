import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        
        double altura,ApotemaP,PerimetroBaseMayor, PerimetroBaseMenor;
        double AreaBaseMayor, AreaBaseMenor;
        double AreaLateral, AreaTotal, Volumen;
        Scanner lector = new Scanner(System.in);

        System.out.println("Ingrese el Perimetro Base Mayor");
      PerimetroBaseMayor = lector.nextDouble();

    System.out.println("Ingrese el Apotema de la Piramide");
    ApotemaP = lector.nextDouble();

     System.out.println("Ingrese la altura");
    altura= lector.nextDouble();

    System.out.println("Ingrese el Area Base Mayor");
    AreaBaseMayor = lector.nextDouble();

     System.out.println("Ingrese el Area Base Menor");
    AreaBaseMenor = lector.nextDouble();

    AreaLateral = (PerimetroBaseMayor + PerimetroBaseMayor)/2*ApotemaP;

    System.out.println("El area lateral es " + AreaLateral);

    //=========================================================
    AreaTotal = AreaLateral + AreaBaseMayor + AreaBaseMenor;

    System.out.println("El area total es " + AreaTotal);

    //====================================================
    

    Volumen = (1/3)*altura*(AreaBaseMayor + AreaBaseMenor )+(AreaBaseMayor+AreaBaseMenor);

    System.out.println("El volumen es " +  Volumen);


       }    
    }
