//Marc Estelrich Timoner
import java.util.Scanner;
public class EjercicioNumero8 {
    public static  void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Select one: ");
        System.out.println("1- Area del triangule: ");
        System.out.println("2- Area del quadrat: ");
        System.out.println("3- Area del pentagon: ");
        int numb= sc.nextInt();

        switch (numb){

            case 1->{
                System.out.println("Area traingulo: ");
                System.out.println("Introduce la base");
                double base= sc.nextDouble();
                System.out.println("Introduce la altura: ");
                double altura = sc.nextDouble();
                double areaTriangle= altura*base/2;
                System.out.println("Area del traingulo: "+areaTriangle);
            }
            case 2->{

                System.out.println("Area quadrado: ");
                System.out.println("Introduce la longitud a:");
                double l1=sc.nextDouble();
                System.out.println("Introduce la longitd b: ");
                double l2=sc.nextDouble();
                double resultQ= l1*l2;
                System.out.println("Area quadrado: "+resultQ);
            }
            case 3->{
                System.out.println("Area pentagono: ");
                System.out.println("Introduce el perimetro: ");
                double perimetro=sc.nextDouble();
                System.out.println("Introduce la apotema");
                double apotema=sc.nextDouble();
                double resultP= perimetro*apotema/2;
                System.out.println("Area pentagono: "+resultP);

            }

            default -> {

                System.out.println("Error");
            }
        }



    }
}
