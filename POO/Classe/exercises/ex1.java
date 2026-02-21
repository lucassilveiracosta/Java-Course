package POO.Classe.exercises;

import java.util.Locale;
import java.util.Scanner;

import POO.Classe.exercises.entities.Rectangle;

public class ex1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rectangle form;
        form = new Rectangle();

        System.out.printf("Enter the width of the rectangle\n> ");
        form.width = sc.nextDouble();

        System.out.printf("Enter the height of the rectangle\n> ");
        form.height = sc.nextDouble();

        System.out.printf("\nAREA: %.1f\n", form.area());
        System.out.printf("PERIMETER: %.1f\n", form.perimeter());
        System.out.printf("DIAGONAL: %.1f", form.diagonal());


        sc.close();
    }
}
