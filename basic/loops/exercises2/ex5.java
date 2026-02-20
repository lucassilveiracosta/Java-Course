package basic.loops.exercises2;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        int mult = 1;
        System.out.printf("Digite um número inteiro\n> ");
        n = sc.nextInt();

        if(!(n == 0)){
            
            for(int i = 1; i <= n; i++){
                mult *= i;
            }
        }

        System.out.println("Fatorial: "+ mult);
        sc.close();
    }
}
