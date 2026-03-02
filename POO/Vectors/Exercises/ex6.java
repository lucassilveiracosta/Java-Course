package POO.Vectors.Exercises;

import java.util.Locale;
import java.util.Scanner;


public class ex6 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter the amount of numbers to digit: ");
        int n = sc.nextInt();

        int[] vect1 = new int[n];
        int[] vect2 = new int[n];

        System.out.println("Enter numbers for vect 1");
        for(int i = 0; i < n; i++) {
            System.out.printf("> ");
            vect1[i] = sc.nextInt(); 
        }

        System.out.println("\nEnter numbers for vect 2");
        for(int i = 0; i < n; i++) {
            System.out.printf("> ");
            vect2[i] = sc.nextInt(); 
        }

        int[] vectRes = new int[n];

        System.out.println("Sum of the vectors ");
        for(int i = 0; i < n; i++) {
            vectRes[i] = vect1[i] + vect2[i];
            System.out.println(vectRes[i]);
        }
        sc.close();
    }
}
