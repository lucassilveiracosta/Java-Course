package POO.Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            String[] vect = sc.nextLine().split(" ");
            int pos = sc.nextInt();
            System.out.println(vect[pos]); // possiveis erros (input mismatch, indexoutodbound)
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Posição invalida");
        }
        catch (InputMismatchException e) {
            System.out.println("A posição deve ser inteira");
        }

        System.out.println("Fim do programa");
        sc.close();
    }
}
