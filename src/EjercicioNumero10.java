//Marc Estelrich Timoner
import java.util.Scanner;
public class EjercicioNumero10 {
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Programa para calcular el peso de la luna ");
        System.out.println("Formula peso de la luna = pesoen la tierra /9,81 *1,622");
        System.out.println("Introduce tu peso: (en la tierra)");
        double peso= sc.nextDouble(),resultado;
        resultado = peso/9.81*1.622;
        System.out.println("Resultado= "+resultado);


    }
}
