package algorithmsJava;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Locale;
import java.util.Scanner;

public class insertionSort {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos numeros para fazer o sort?\n> ");
        int n = sc.nextInt();

        int[] vect = new int[n];

        for(int i = 0; i < n ; i++) {
            System.out.printf("vect[%d]: ", i);
            vect[i] = sc.nextInt();
        }

        LocalDateTime antes = LocalDateTime.now();

        for(int j = 1; j < n; j++) { // 0 -> 4

            int chave = vect[j];
            int i = j - 1;

            // i --> 1
            // i --> 0

            while(i >= 0 && chave < vect[i]) {

                int aux = vect[i + 1];
                vect[i + 1] = vect[i];
                vect[i] = aux;
                i--;
                
            }
        }

        LocalDateTime depois = LocalDateTime.now();

        Duration tt = Duration.ofDays(Duration.between(antes, depois).toMillis());
        for(int i = 0; i < n; i++) {
            System.out.println(vect[i]);
        }
        System.out.println(tt);
        sc.close();
    }
}
