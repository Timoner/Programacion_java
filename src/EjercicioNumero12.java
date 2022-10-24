import java.io.IOException;

//Marc Estelrich Timoner
public class    EjercicioNumero12 {
    public static void main (String[]args) throws IOException {
        System.out.println("Introduce una letra ");
        char letra= (char)System.in. read();
        if (Character.isUpperCase(letra)){
           System.out.println("La letra que has introducido es Mayuscula");
       }
       else {
           System.out.println("Minuscula");
       }

    }
    }
