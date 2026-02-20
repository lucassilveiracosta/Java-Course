package basic.loops.exercises2;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int x;
        System.out.printf("Digite um valor para X\n> ");
        x = sc.nextInt();

        for(int i = 1; i <= x; i++){
            if(x % i == 0){
                System.out.println(i);
            }
        }
        sc.close();
    }
}
