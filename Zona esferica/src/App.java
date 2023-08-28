import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner(System.in);
        
double radioEsfera, altura, radio;
double Area, Volumen;

System.out.println("Ingrese el radio de la esfera");
radioEsfera = lector.nextDouble();

System.out.println("Ingrese la altura");
altura = lector.nextDouble();

Area = (2*3.14) * (radioEsfera * altura);

System.out.println("El Area es " + Area);

//=======================================
 System.out.println("Ingrese el radio");
 radio = lector.nextDouble();

 Volumen = (3.14*altura) *  + (altura*altura+6+radio*radio*radio*radio)/6;

 System.out.println("El volumen " + Volumen);
   }
}
