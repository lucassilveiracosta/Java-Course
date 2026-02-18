package exercises;

import java.util.Locale;
import java.util.Scanner;

public class ex1 {
    
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int x, y;

        System.out.printf("Enter two integers to add them\n> ");
        x = sc.nextInt();
        System.out.printf("> ");
        y = sc.nextInt();

        System.out.printf("SUM = %d", x + y);

        sc.close();
    }
}
