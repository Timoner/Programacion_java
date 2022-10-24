import java.util.Scanner;
public class EjercicioNumero22C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String passw="1234";
        final int INTENTOS=3;
        boolean acierto=false;
        String pass;
        for (int i=0;i<INTENTOS && !acierto;i++){
            System.out.println("Introduce la contraseña");
            pass=sc.next();
            if(pass.equals(passw)){
                System.out.println("Has entrado");
                acierto=true;
            }
            else {
                System.out.println("Intentalo de nuevo");
            }
        }


    }
}
