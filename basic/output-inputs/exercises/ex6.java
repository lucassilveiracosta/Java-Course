import java.util.Locale;
import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        double A, B, C;

        System.out.printf("type 3 float numbers on the arrow\n> ");
        A = sc.nextDouble();
        System.out.printf("\n> ");
        B = sc.nextDouble();
        System.out.printf("\n> ");
        C = sc.nextDouble();

        double areaTriangle = (A * C) / 2;
        double areaCircle = 3.14159 * Math.pow(C, 2);
        double areaTrapeze = ((A + B) * C) / 2;
        double areaSquare = Math.pow(B, 2);
        double areaRectangle = A * B;

        System.out.printf("TRIANGLE: %.3f\n", areaTriangle);
        System.out.printf("CIRCLE: %.3f\n", areaCircle);
        System.out.printf("TRAPEZE: %.3f\n", areaTrapeze);
        System.out.printf("SQUARE: %.3f\n", areaSquare);
        System.out.printf("REACTANGLE: %.3f", areaRectangle);

        sc.close();
    }
}
