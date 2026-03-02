package POO.Vectors.Exercises;

import java.util.Locale;
import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.printf("Enter the amount of number to digit: ");
        int n = sc.nextInt();
    
        double[] vect = new double[n];
        double sum = 0;
        System.out.println("Enter the numbers");

        for(int i = 0; i < n; i++) {
            System.out.printf("> ");
            vect[i] = sc.nextDouble();
            sum += vect[i];
        }   
        
        double media = sum / n;
        System.out.println("Average: " + media);
        System.out.println("Grades below de average: ");
        for(int i = 0; i < n; i++) {
            if(vect[i] < media) {
                System.out.println(vect[i]);
            }
        }
        sc.close();


    }
}
