package POO.Heranca.Abstracts;

import POO.Heranca.Abstracts.Entities.Circle;
import POO.Heranca.Abstracts.Entities.Rectangle;
import POO.Heranca.Abstracts.Entities.Shape;
import POO.Heranca.Abstracts.Enum.Color;

import java.util.Locale;
import java.util.Scanner;

public class Principal {

    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of shapes: ");
        int n = sc.nextInt();

        Shape[] shapes = new Shape[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Shape #" + (i + 1) + " data: ");
            System.out.print("Rectangle or Circle (r/c)? ");
            char option = sc.next().toLowerCase().charAt(0);
            System.out.print("Color (BLACK, BLUE, RED): ");
            String color = sc.next().toUpperCase();
            Color colorEnum = Color.valueOf(color);

            switch (option) {
                case 'r':
                    System.out.print("Width: ");
                    double width = sc.nextDouble();
                    System.out.print("Height: ");
                    double height = sc.nextDouble();

                    shapes[i] = new Rectangle(colorEnum, width, height);
                break;

                case 'c':
                    System.out.print("Radius: ");
                    double radius = sc.nextDouble();

                    shapes[i] = new Circle(colorEnum, radius);
            }
        }

        System.out.println("\nShape Areas: ");

        for (Shape x: shapes) {
            System.out.printf("%.2f\n", x.area());
        }
    }
}
