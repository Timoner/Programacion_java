//Marc Estelrich Timoner
import java.util.Scanner;
public class EjercicioNumero11 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Programa para saber si el numero es par o impar");
        System.out.println("Introduce un numero  ");
        int numb= sc.nextInt();
        if (numb %  2 == 0){
            System.out.println("El numero que has introduit es par");

        }
        else {
            System.out.println("El numero que has introduit esimpar");
        }
    }
}
