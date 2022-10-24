import java.io.IOException;

public class EjercicioNumero15 {
    public static void main(String[] args) throws IOException {
            char car1,car2;
        System.out.println("Introduce el primer caracter: ");
        car1=(char) System.in.read();
        System.in.read();
        System.out.println("Introduce el segundo caracter:");
        car2=(char) System.in.read();
        if (Character.isLowerCase(car1)){
            if (Character.isLowerCase(car2)){
            System.out.println("Los dos son letras minusculas.");}
            else{
            System.out.println("El primer es una letra minuscula pero el segundo no");
             }
        } else if (Character.isLowerCase(car2)) {
            System.out.println("El segundo caracter es minuscula el primero no.");

        }
        else {
            System.out.println("Ninguno es minuscla");
        }

    }
}
