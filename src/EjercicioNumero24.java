import java.util.Scanner;
public class EjercicioNumero24 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Programa Calculadora: ");
        System.out.println("Introduce los numero para operar luego");
        System.out.println("Introduce el primer numero:");
        double num1=sc.nextDouble();
        System.out.println("Introduce el segundo numero: ");
        double num2=sc.nextDouble();
        double result_Sum= num1+num2;
        double result_Res=num1-num2;
        double result_Mult=num1*num2;
        double result_Div= num1/num2;
        System.out.println("Introduce un numero: ");
        System.out.println("1-Sumar//2-Restar//3-Multiplicar//4-Dividir:");
        int snum=sc.nextInt();
        switch (snum){
            case 1->{
                System.out.println("Resultado de la suma: "+result_Sum);
            }
            case 2->{
                System.out.println("Resultado de la resta:"+result_Res);
            }
            case 3->{
                System.out.println("Resultado de la multiplicación: "+result_Mult);
            }
            case 4->{
                System.out.println("Resultado de la division: "+result_Div);
            }
            default-> {
                System.out.println("Errro reinicie el prgrama!!!");
            }
        }
    }
}
