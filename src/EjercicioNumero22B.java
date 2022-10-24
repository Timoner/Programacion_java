import java.util.Scanner;
public class EjercicioNumero22B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Programa introducir el pass: ");
        String npass=sc.next();
        String pass="casa123";

        if (npass.equals(pass)){
            System.out.println("Has entrado");
        }
        else {
            while (npass.equals(pass) == false) {
                System.out.println("Intentalo de nuevo te quedan 2 intentos");
                npass = sc.next();
                if (npass.equals(pass)) {
                    System.out.println("Has entrado");
                } else {
                    System.out.println("Intentalo de nuevo te queda 1 intento");
                    npass = sc.next();
                    if (npass.equals(pass)) {
                        System.out.println("Has entrado");
                    } else {
                        System.out.println("Fuera!!");
                    }
                }

            }
        }
    }
}
