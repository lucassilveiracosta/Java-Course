package POO.Matriz.Exercices;

import java.util.Scanner;

public class ex1 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] matrix = new int[n][n];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.printf("Matriz[%d][%d]: ", i+1, j+1);
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("\n-----------------------------------\n");

        System.out.println("Diagonal");
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(i == j) {
                    System.out.printf("Matriz[%d][%d]: %d\n", i+1,j+1, matrix[i][j]);
                }
            }
        }
        
        System.out.println("\n-----------------------------------\n");
       
        System.out.println("Negativo");
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(matrix[i][j] < 0) {
                    System.out.printf("Matriz[%d][%d]: %d\n", i+1,j+1, matrix[i][j]);
                }
            }
        }
        sc.close();
    }
}
