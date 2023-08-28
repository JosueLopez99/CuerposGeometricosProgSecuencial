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

//===============================================

Volumen = (3.14*altura) * (3*radioEsfera - altura)/3;
 
System.out.println("El volumen es " + Volumen);

    }
}