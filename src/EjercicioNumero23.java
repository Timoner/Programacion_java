import java.util.Scanner;
public class EjercicioNumero23 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introdueix el numero de la setmana 1-7:");
        int num;
        num= sc.nextInt();
       switch (num){
           case 1 :
               System.out.println("Dilluna");

           case 2:
               System.out.println("Dimarts");

           case 3:
               System.out.println("Dimecres");

           case 4:
               System.out.println("Dijous");

           case 5:
               System.out.println("Divendres");

           case 6:
               System.out.println("Dissabte");

        case 7:
               System.out.println("Diumenge");

           default :
               System.out.println("ERROR has introduit malament el numero reinici el programa");

       }

    }
}
