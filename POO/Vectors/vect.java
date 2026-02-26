package POO.Vectors;

import java.util.Locale;
import java.util.Scanner;

public class vect {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter the number of heights: ");
        int n = sc.nextInt();

        double[] vector = new double[n];  // ----> declaração de um vetor em java

        System.out.println("Enter heights");
        for(int i = 0; i < n; i++) {
            System.out.printf("> ");;
            vector[i] = sc.nextDouble();
        }

        double sum = 0;
        for(int i = 0; i < n; i++) {
            sum += vector[i];
        }

        double media = sum / n;
        System.out.printf("The media of heights is: %.1f", media);
        sc.close();
    }
}
