package basic.conditionals.exercises;

import java.util.Scanner;

public class ex1 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;   

        System.out.printf("Digite um número\n> ");
        num = sc.nextInt();

        if(num >= 0) {
            System.out.println("\n NÚMERO POSITIVO");
        }
        else{
            System.out.println("\n NÚMERO NEGATIVO");
        }

        sc.close();
    }
}
