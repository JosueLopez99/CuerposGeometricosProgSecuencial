import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
    double Perimetrobase, generatriz, Areabase, altura;
    double AreaLateral, AreaTotal, Volumen;

    Scanner lector = new Scanner(System.in);

    System.out.println("Ingrese el perimetro de base");
    
    Perimetrobase = lector.nextDouble();

    System.out.println("Ingrese la generatriz");
    generatriz = lector.nextDouble();

    AreaLateral = (Perimetrobase * generatriz)/2;

    System.out.println("El area lateral es " + AreaLateral);

   //==============================================================
   
   System.out.println("Ingrese el area de la base");
   Areabase = lector.nextDouble();

   AreaTotal = (AreaLateral + Areabase);

   System.out.println("El area total es " + AreaTotal);

   //============================================================

   System.out.println("inserte la altura");
   altura = lector.nextDouble();

   Volumen = (Areabase * altura)/3;

   System.out.println("EL volumen es " + Volumen);
    
    }
}