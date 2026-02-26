package POO.Vectors;

import java.util.Locale;
import java.util.Scanner;

import POO.Vectors.Entities.Products;

public class newVects {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter the amount of products: ");
        int n = sc.nextInt();

        Products[] vect = new Products[n];

        
        for(int i = 0; i < n; i++) {
            System.out.println("\nEnter the products");
            System.out.printf("> ");
            String name = sc.next();
            System.out.printf("> ");
            double price = sc.nextDouble();

            vect[i] = new Products(name, price);

        }

        double sum = 0;
        for(int i = 0; i < n; i++) {
            sum += vect[i].getPrice();
        }

        double avg = sum / n;

        System.out.printf("The average price is: $ %.2f", avg);
        sc.close();


    }
}
