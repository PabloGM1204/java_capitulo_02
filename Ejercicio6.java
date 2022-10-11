import java.util.Scanner;
public class Ejercicio6{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digame cuanto es su baseImponible"); 
        double baseImponible = sc.nextDouble();
        // Multiplico la base por 0.21 para que me de solo el iva y mostrarlo por pantalla
        System.out.println("El iva = "+(baseImponible*0.21));
        // Multiplico lo anterior y le sumo la baseImponible para asi poder tener el precio con el iva incluido
        System.out.println("Importe a pagar "+((baseImponible*0.21)+baseImponible));
    }
}