import java.util.Scanner;

public class SumaImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        int contador = 0;
        int operacion = 1;
        int resultado = 0;

        System.out.println("Ingrese cantidad de impares a sumar:");
        n = sc.nextInt();
        do {
                contador +=1;
                resultado = resultado + operacion;
                operacion +=2;

        }while (contador<n);
        {
        }System.out.printf("La suma entre la cantidad de impares es de %d." ,resultado);
    }
}

