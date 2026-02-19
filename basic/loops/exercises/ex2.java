package basic.loops.exercises;

import java.util.Locale;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int x = 1;
        int y = 1;

        while(x != 0 && y != 0){ 

            System.out.printf("Digite o valor de X\n> ");
            x = sc.nextInt();
            System.out.printf("Digite o valor de Y\n> ");
            y = sc.nextInt();

            if(x > 0 && y > 0){
                System.out.println("Q1");
            }
            else if(x < 0 && y > 0){
                System.out.println("Q2");
            }
            else if(x < 0 && y < 0){
                System.out.println("Q3");
            }
            else if(x > 0 && y < 0){
                System.out.println("Q4");
            }
        }
        sc.close();
    }
}
