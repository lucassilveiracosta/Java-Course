package exercises;

import java.util.Locale;
import java.util.Scanner;

public class ex2 {
    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in); 

        double pi = 3.14159;
        
        System.out.printf("Enter the radius\n> ");
        double radius = sc.nextDouble();

        double area = Math.pow(radius, 2) * pi;

        System.out.printf("The area of the circle is %.4f", area);

        sc.close();
    }
}
