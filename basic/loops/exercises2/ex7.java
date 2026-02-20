package basic.loops.exercises2;

import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x, q, c; 
        System.out.printf("Digite um valor para X\n> ");
        x = sc.nextInt();

        for(int i = 1; i <= x; i++){
            System.out.printf("%d  ", i);
            q = (int) Math.pow(i, 2);
            System.out.printf("%d  ", q);
            c = (int) Math.pow(i, 3);
            System.out.printf("%d\n", c);
        }
        sc.close();
    }
}
