import java.util.Scanner;

public class SoloPares2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese cantidad de números pares sucesivos a ver:");

        int n = sc.nextInt();
        int contador = 0, operacion = 0;

        System.out.printf("la serie de pares sucesivos pertenecientes a los primero %d corresponde a:", n);
        System.out.println("");
        do {

            contador += 1;
            operacion += 2;
            System.out.println(operacion);

        } while (contador < n);
        {
        }
    }
}