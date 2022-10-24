//Marc Estelrich Timoner
import java.util.Scanner;
public class EjercicioNumero7 {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Put number:");
        System.out.println("1: euro>>pst");
        System.out.println("2: pst>>euro");
        System.out.println("");
     int valor = sc.nextInt();

     switch (valor){
         case 1 -> {
             System.out.println("Euros>>pst: ");
                double euros= sc.nextDouble();
                double result = euros*166.386;
             System.out.println(euros+" € "+ " >> "+result+" pst");
         }
        case 2 -> {
            System.out.println("Pst>>euros: ");
            double pst=sc.nextDouble();
            double reslt_p= pst/166.386;
            System.out.println(pst+" pst "+" >> "+reslt_p+" € ");

        }
         default -> {

             System.out.println("ERROR");
         }
     }


    }
}
