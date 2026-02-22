package POO.Classe;

import java.util.Locale;
import java.util.Scanner;
import POO.Classe.entities.Circle;

public class radius {

    public static final double PI = 3.14159; //final serve para representar uma constante, no JS usa o CONST
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        
        Circle ball;
        ball = new Circle();

        System.out.printf("Enter the radius: ");
        ball.radius = sc.nextDouble();

        System.out.printf("\nCircumference: %.2f\n", ball.circumference(PI));
        System.out.printf("Sphere Volume: %.2f\n", ball.volumeSphere(PI));
        System.out.printf("Pi: %.1f", PI);

        sc.close();
    }   
}
