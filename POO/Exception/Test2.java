package POO.Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test2 {
    static void main(String[] args) {

        method1();
        System.out.println("Fim do programa");

    }

    public static void method1(){
        System.out.println("***METHOD1 START***");
        method2();
        System.out.println("***METHOD1 END***");
    }

    public static void method2() {
        System.out.println("***METHOD2 START***");
        Scanner sc = new Scanner(System.in);

        try {
            String[] vect = sc.nextLine().split(" ");
            int pos = sc.nextInt();
            System.out.println(vect[pos]); // possiveis erros (input mismatch, indexoutodbound)
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Posição invalida");
            e.printStackTrace();
            sc.next();
        }
        catch (InputMismatchException e) {
            System.out.println("A posição deve ser inteira");
        }
        sc.close();
        System.out.println("***METHOD2 CLOSE***");
    }
}
