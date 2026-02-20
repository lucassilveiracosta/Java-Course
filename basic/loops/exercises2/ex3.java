package basic.loops.exercises2;

import java.util.Locale;
import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int qntd;
        System.out.printf("Digite a quantidade\n> ");
        qntd = sc.nextInt();

        System.out.printf("Digite um número em cada seta\n");

        double x1, x2, x3, soma;

        for(int i = 0; i < qntd; i++){
            System.out.printf("> ");
            x1 = sc.nextDouble();
            System.out.printf("> ");
            x2 = sc.nextDouble();
            System.out.printf("> ");
            x3 = sc.nextDouble();

            soma = ((x1 * 2) + (x2 * 3) + (x3 * 5)) / 10;
            System.out.printf("Média: %.1f\n\n", soma);
        }
        sc.close();
    }
}
