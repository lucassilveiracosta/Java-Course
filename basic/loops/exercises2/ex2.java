package basic.loops.exercises2;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Quantos números inteiros você vai digitar?\n> ");
        int qntd = sc.nextInt();

        int num;
        int in = 0;
        int out = 0;
        System.out.printf("Digite números\n");
        for(int i = 0; i < qntd; i++){
            System.out.print("> ");
            num = sc.nextInt();

            if(num >= 10 && num <= 20){
                in++;
            }
            else{
                out++;
            }
        }

        System.out.printf("IN: %d\n", in);
        System.out.printf("OUT: %d", out);

        sc.close();
    }
}
