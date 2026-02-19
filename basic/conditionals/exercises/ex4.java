package basic.conditionals.exercises;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int horaI, horaF, aux;

        System.out.printf("Hora que o jogo começou\n> ");
        horaI = sc.nextInt();
        System.out.printf("Hora que o jogo terminou\n> ");
        horaF = sc.nextInt();

        if(horaI > horaF) {
            aux = 24 - horaI + horaF;
        }
        else if(horaI == horaF) {
            aux = 24;
        }
        else {
            aux = horaF - horaI;
        }

        System.out.printf("\nO jogo durou %d hora(s)", aux);

        sc.close();
    }
}
