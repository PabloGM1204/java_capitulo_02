import java.util.Scanner;
public class Ejercicio5{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        // Pido que me diga una cantidad y que con la libreria de scanner puede leer por teclado
        System.out.println("Digame una cantidad de pesetas para pasar a euros: ");
        double pesetas = sc.nextDouble();
        double euros = 0.006;
        System.out.println("Su valor en euros es = "+(euros*pesetas));
        sc.close();
    }
}