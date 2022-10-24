//Marc Estelrich Timoner
import java.util.Scanner;
public class EjercicioNumero22 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Programa introducir el pass: ");
        String npass=sc.next();
        String pass="casa123";

       if(npass.equals(pass)){
           System.out.println("Has entrado: ");
       }
       else{
        while (npass.equals(pass)==false) {
            System.out.println("Intenta otra vez");
            npass= sc.next();
            if (npass.equals(pass)){
                System.out.println("Has entrado");break;
            }
            System.out.println("Intenta otra vez");
            npass=sc.next();
            if (npass.equals(pass)){
                System.out.println("Has entrado");break;
            }
            System.out.println("Fuera");
            break;
        }
       }

        }
    }

