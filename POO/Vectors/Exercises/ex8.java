package POO.Vectors.Exercises;

import java.util.Locale;
import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter the amount of numbers: ");
        int n = sc.nextInt();

        int[] vect = new int[n];
        int sum = 0;
        int count = 0;
        System.out.println("Enter the numbers");
        for(int i = 0; i < n; i++) {

            System.out.printf("> ");
            vect[i] = sc.nextInt();

            if(vect[i] % 2 == 0) {
                sum += vect[i];
                count++;
            }
        }

        double media = 0;
        if(count > 0) {
            media = sum / count;
        }
        
        if(count != 0) {
            System.out.printf("Media of the even numbers: %.1f", media);
        }
        else {
            System.out.printf("There are no even numbers");
        }
        sc.close();
    }
}
