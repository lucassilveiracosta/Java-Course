package basic.conditionals;

import java.util.Scanner;

public class ternaria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        String res = (x % 2 == 0) ? "par" : "impar"; //metodo eficiente --> (Condição) ? "true" : "false";
        System.out.println(res);

        sc.close();
    }
}