import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
    
        double Perimetrobase, altura,Areabase ;
        double AreaLateral, AreaTotal,Volumen;
       Scanner lector = new Scanner(System.in);

    System.out.println("Inserte el Perimetro de la base");
    Perimetrobase = lector.nextDouble();
  
    System.out.println("Inserte la altura");
    altura = lector.nextDouble();
 
    AreaLateral = (Perimetrobase * altura);

    System.out.println("El area lateral es : " + AreaLateral);

    //=================================================

    System.out.println("Inserte el area de la base ");
    Areabase = lector.nextDouble();

    AreaTotal = AreaLateral + (Areabase * 2);

    System.out.println("El area total es " + AreaTotal);
//=======================================================

System.out.println("Inserte el Volumen");
Volumen = lector.nextDouble();

Volumen = (Areabase * altura);

System.out.println("EL volumen es " + Volumen);

    }
}
