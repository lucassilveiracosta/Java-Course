package basic.loops.exercises2;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 1;

        System.out.printf("Digite um valor para X\n> ");
        x = sc.nextInt();

        if(x >= 1 && x <= 1000){
            for(int i = 1; i <= x; i++){
                if(i % 2 != 0){
                    System.out.println(i);
                }
            }
        }
        sc.close();
    }
}
