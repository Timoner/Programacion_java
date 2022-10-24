//Marc Estelrich Timoner
import java.util.Scanner;
public class EjercicioNumero6 {
    public static  void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdueix la velocitat en Km/h :");
        double v = sc.nextDouble();
        double resultado = v/3.6;
        System.out.println("Velocitat en m/s: "+resultado);

    }
}
