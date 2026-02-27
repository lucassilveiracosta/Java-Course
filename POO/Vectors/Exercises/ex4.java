package POO.Vectors.Exercises;

import java.util.Locale;
import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter the amount of numbers: ");
        int n = sc.nextInt();

        int[] vect = new int[n];

        for(int i = 0; i < n; i++) {

            System.out.printf("Enter the number: ");;
            vect[i] = sc.nextInt();
        }

        int count = 0;
        System.out.println("Numeros pares");
        for(int i = 0; i < n; i++) {

            if(vect[i] % 2 == 0) {
                System.out.printf("%d ", vect[i]);
                count++;
            }
        }
        System.out.printf("\nQuantity of even numbers: %d", count);
        sc.close();
    }
}
