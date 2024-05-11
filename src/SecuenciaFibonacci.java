import java.util.Scanner;

public class SecuenciaFibonacci {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Variables
        int n;
        int num1 = 0;
        int num2 = 1;
        int fib;
        int limite = 100;

        System.out.println("Introduzca un número entero no negativo:");
        n = sc.nextInt();

        System.out.printf("Resultados para número Fibonacci hasta la suma %d :" ,n);
        System.out.println("");
        for (int i = 0; i < n; i++) {
            System.out.println(num1);

            fib = num1 + num2;
            num1 = num2;
            num2 = fib;
        }
    }
}
