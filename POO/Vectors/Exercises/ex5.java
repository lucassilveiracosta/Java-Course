package POO.Vectors.Exercises;

import java.util.Locale;
import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter the amount of numbers to digit: ");
        int n = sc.nextInt();

        double num = 0;
        int pos = 0;
        double[] vect = new double[n];
        System.out.println("Enter the numbers");
        for(int i = 0; i < n; i++) {

            System.out.printf("> ");
            vect[i] = sc.nextDouble();
            if(vect[i] > num) {
                num = vect[i];
                pos = i;
            }
        }

        System.out.printf("The biggest number is: %.1f", num);
        System.out.printf("\nThe position is: %d", pos);
        sc.close();
    }
}
