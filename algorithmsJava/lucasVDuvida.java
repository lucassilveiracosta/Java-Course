package algorithmsJava;

import java.util.Scanner;

public class lucasVDuvida {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] java = new int[12];

        for (int i = 0; i < java.length; i++) {
            java[i] = i;
        }

        System.out.println(java[11]);

        System.out.print("digite x: ");
        int x = sc.nextInt();

        String davi = x > 10 ? "sim" : "nao";

        if(davi.equals("nao")) System.out.println("X é menor que 10");

        System.out.println(davi);

    }
}
