import java.util.Scanner;

public class SumaImparLimite {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = 0;
        int min = 0;
        int max = 0;

        System.out.println("Ingrese el Límite Inferior");
        min = sc.nextInt();
        System.out.println("Ingrese el Límite Superior");
        max = sc.nextInt();

        min = min + 1;
        System.out.println("Calculando operación...");

        while (min < max) {
            if (min % 2 == 1) {
                n += min;
            }
            min += 1;
        }System.out.printf("el resultado de la suma entre límites es: "+n);
    }
}
