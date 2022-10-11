public class Ejercicio5{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        // Pido que me diga una cantidad y que con la libreria de scanner puede leer por teclado
        System.out.println("Digame una cantidad de pesetas para pasar a euros: ");
        double pesetas = sc.nextDouble();
        double euros = 166.386;
        System.out.println(euros+" su valor en pesetas es = "+(euros*pesetas));
        sc.close();
    }
}
