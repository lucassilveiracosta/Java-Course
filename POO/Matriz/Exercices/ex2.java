package POO.Matriz.Exercices;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] matrix = new int[m][n];

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                System.out.printf("Matrix[%d][%d]: ", i, j);
                matrix[i][j] = sc.nextInt();
            }
        }

        int x = sc.nextInt();

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(x == matrix[i][j]) {
                    System.out.printf("Position: [%d][%d]", i, j);
                    if(i - 1 >= 0) {
                        System.out.printf("Em cima(%d, %d): %d\n", i - 1, j, matrix[i - 1][j]);
                    }

                    if(i + 1 < m) {
                        System.out.printf("Embaixo(%d, %d): %d\n", i + 1, j, matrix[i + 1][j]);
                    }

                    if(j - 1 >= 0) {
                        System.out.printf("Esquerda(%d, %d): %d\n", i, j - 1, matrix[i][j - 1]);
                    }

                    if(j + 1 < n) {
                        System.out.printf("Direita(%d, %d): %d\n", i, j + 1, matrix[i][j + 1]);
                    }
                    System.out.println("\n---------------------------------");
                }

            }
        }
        sc.close();
    }
}
