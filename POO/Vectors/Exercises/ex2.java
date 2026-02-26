package POO.Vectors.Exercises;

import java.util.Locale;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter the total numbers to digit: ");
        int n = sc.nextInt();

        double[] vect = new double[n];
        double sum = 0;
    
        System.out.println("Enter the numbers");
        for(int i = 0; i < n; i++) {
            System.out.printf("> ");
            vect[i] = sc.nextDouble();
            sum += vect[i];
        }

        for(int i = 0; i < n; i++) {
            System.out.printf("%.1f ", vect[i]);
        }

        System.out.println("\nSUM: " + sum);
        System.out.println("MEDIA " + sum / n);

        sc.close();
    }
}
