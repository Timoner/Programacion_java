//Marc Estelrich Timoner
import java.util.Scanner;
public class EjercicioNumero9 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Programa para calcular la velociadad de un coche, v=d/t:");
        System.out.println("IMPORTANTE: V=K");
        System.out.println("Introduce la distancia");
        double dsitancia=sc.nextDouble();
        System.out.println("Introduce el tiempo: ");
        double tiempo=sc.nextDouble();
        double result= dsitancia/tiempo;
        System.out.println("Resultado: "+result);

    }
}
