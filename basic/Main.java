package basic;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;
/**
 * IMPORTANT:
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {

    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Double a = sc.nextDouble();
        Double b = sc.nextDouble();
        Double c = sc.nextDouble();

        Double delta = deltaFormula(a,b,c);

        if(a != 0 && delta >= 0) {
            System.out.printf("R1 = %.5f\n", (-b + Math.sqrt(delta)) / (2*a));
            System.out.printf("R2 = %.5f", (-b - Math.sqrt(delta)) / (2*a));
        } else System.out.println("Impossivel calcular");
    }

    private static Double deltaFormula(Double a, Double b, Double c) {
        return Math.pow(b, 2) - 4*a*c;
    }

}