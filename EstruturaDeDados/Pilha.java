package EstruturaDeDados;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Pilha {
    
    private Integer tamanhoMaximo;
    private Integer ultimoElemento;
    private Integer[] vetor;

    public Pilha(Integer tamanhoMaximo, Integer ultimoElemento, Integer[] vetor) {
        this.tamanhoMaximo = tamanhoMaximo;
        this.ultimoElemento = ultimoElemento;
        this.vetor = vetor;
    }

    public void pop() {
        if(ultimoElemento
                >= 0) {
            vetor[ultimoElemento] = null;
            ultimoElemento--;
        }
        else {
            throw new Error("Underflow!");
        }
    }
    
    public void push(int elemento) {
        if(ultimoElemento != tamanhoMaximo - 1) {
            ultimoElemento++;
            vetor[ultimoElemento] = elemento;
        }
        else {
            throw new Error("Overflow!");
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Integer[] vetor = {1, 2, 3, 4, 5, null, null, null, null, null};
        Integer tam = 10;
        Integer ultimo = 4;
        Pilha pilha = new Pilha(tam, ultimo, vetor);
        int pushNum = 0;

        while(true) {
            System.out.println(Arrays.asList(pilha.vetor));

            System.out.println("\n1. push");
            System.out.println("2. pop");
            System.out.print("3. sair\n> ");
            int opcao = sc.nextInt();

            if(opcao == 1) {
                System.out.print("Digite o numero inteiro: ");
                pushNum = sc.nextInt();
            }

            switch (opcao) {
                case 1 -> pilha.push(pushNum);
                case 2 -> pilha.pop();
                case 3 -> System.exit(200);
            }


        }
    }
}
