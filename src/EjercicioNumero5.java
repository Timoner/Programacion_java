//Marc Estelrich Timoner
import java.util.Scanner;
public class EjercicioNumero5 {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdueix el radi: ");
        double radi= sc.nextDouble();
        double r2= Math.pow(radi,2);
        double area= Math.PI*r2;
        double longitud= 2* Math.PI*radi;
        System.out.println("Area= "+area);
        System.out.println("Longitud= "+longitud);



    }
}
