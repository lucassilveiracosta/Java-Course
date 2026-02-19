package basic.loops.exercises;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcao = 1;

        System.out.printf("Digite na seta o numero do combustivel utilizado pelo cliente\n> ");
        while(opcao != 4){
            opcao = sc.nextInt();
        }
    }
}
