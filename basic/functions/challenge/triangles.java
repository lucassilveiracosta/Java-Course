package basic.functions.challenge;

import java.util.Locale;
import java.util.Scanner;

public class triangles {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter three int numbers for X\n> ");
        int ax = sc.nextInt();
        int bx = sc.nextInt();
        int cx = sc.nextInt();

        double xArea = triangleArea(ax, bx, cx);


        System.out.printf("Enter three int numbers for Y\n> ");
        int ay = sc.nextInt();
        int by = sc.nextInt();
        int cy = sc.nextInt();        

        double yArea = triangleArea(ay, by, cy);

        System.out.println("\nX area: " + xArea);
        System.out.println("Y area: " + yArea);
        compare(xArea, yArea);
        sc.close();
    }   

    public static double triangleArea(int x, int y, int z) {
        double p = (x + y + z) / 2;
        double area = Math.sqrt(p * (p - x) * (p - y) * (p - z));
        return area;
    }

    public static void compare(double X, double Y) {
        if(X > Y){
            System.out.printf("\nThe triangle X have the biggest area");
        }
        else {
            System.out.printf("\nThe triangle Y have the biggest area");
        }
    }
}
