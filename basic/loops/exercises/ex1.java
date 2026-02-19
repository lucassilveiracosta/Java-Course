package basic.loops.exercises;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int senha = 2002;
        int guess = 0;

        while(guess != 2002){
            System.out.printf("\nDigite a senha\n> ");
            guess = sc.nextInt();
            
            String res = (senha == guess) ? "\nSenha valida!" : "\nSenha invalida!";
            System.out.println(res);
        }

        sc.close();
    }
}
