package basic.functions;

import java.util.Scanner;

public class funct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter three numbers\n> ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        double media = med(a, b, c);

        showMediaf(media);
        sc.close();
    }

    public static int med(int x, int y, int z) {
        return (x + y + z) / 3;
    }

    public static void showMediaf(double value) {
        System.out.printf("Media: %.1f", value);
    }
}
