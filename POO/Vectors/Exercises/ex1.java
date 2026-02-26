package POO.Vectors.Exercises;

import java.util.Locale;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter the amount of numbers between 1 to 10: ");
        int n = sc.nextInt();

        if(n > 10 || n < 0) {
            System.out.println("Invalid number.");
            System.exit(n);
        }

        int[] vect = new int[n];

        System.out.println("Enter the numbers");
        for(int i = 0; i < n; i++) {
            System.out.printf("> ");
            vect[i] = sc.nextInt();
        }

        System.out.println("\nNegative numbers: ");
        for(int i = 0; i < n; i++) {
            if(vect[i] < 0) {
                System.out.println(vect[i]);
            }
        }

        sc.close();
    }
}
