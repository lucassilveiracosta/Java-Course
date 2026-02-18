package exercises;

import java.util.Locale;
import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        int A, B, C, D;

        System.out.printf("Enter integers\n[A]> ");
        A = sc.nextInt();
        System.out.printf("[B]> ");
        B = sc.nextInt();
        System.out.printf("[C]> ");
        C = sc.nextInt();
        System.out.printf("[D]> ");
        D = sc.nextInt();

        int res = (A * B - C * D);

        System.out.printf("The result is: %d", res);
        sc.close();
    }
}   
