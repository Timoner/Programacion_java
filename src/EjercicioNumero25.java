import java.util.Scanner;
public class EjercicioNumero25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu nota:");
        int numb=sc.nextInt();


            switch (numb) {
                case 5 -> {
                    System.out.println("Suficiente.");
                }
                case 1,2,3,4->{
                    System.out.println("Suspendido");
                }
                case 6 ->{
                    System.out.println("Be");
                }
                case 7 ->{
                    System.out.println("Notable-baix");
                }
                case 8->{
                    System.out.println("Notable alt");
                }
                case 9->{
                    System.out.println("Excelente");
                }
                case 10 ->{
                    System.out.println("Matricula de honor.");
                }
                default ->{
                    System.out.println("Has introduit malament la nota");
                }
            }
        }


}
