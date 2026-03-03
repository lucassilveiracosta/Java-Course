package POO.Vectors.Exercises;

import java.util.Locale;
import java.util.Scanner;

import POO.Vectors.Exercises.ExercisesEntities.Membro;

public class additional {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.printf("Quantos membros você deseja cadastrar: ");
        int n = sc.nextInt();

        Membro[] vect = new Membro[n];

        for(int i = 0; i < n; i++) {
            System.out.printf("\nMembro %d\n", i);
            System.out.printf("Nome\n> ");
            String name = sc.next();
            System.out.printf("Digite seu Nível\nB - Básico\nP - Pleno\nS - Sênior\n> ");
            char nivel = sc.next().charAt(0);
            System.out.printf("Pontuação\n> ");
            double pontuacao = sc.nextDouble();
            
            vect[i] = new Membro(name, nivel, pontuacao);
        }

        double sumB = 0;
        double sumP = 0;
        double sumS = 0;
        int countB = 0;
        int countP = 0;
        int countS = 0;
        
        for(int i = 0; i < n; i++) {

            if(vect[i].getNivel() == 'B') {
                sumB += vect[i].getPontuacao();
                countB++;
            }
            else if(vect[i].getNivel() == 'P') {
                sumP += vect[i].getPontuacao();
                countP++;
            }
            else if(vect[i].getNivel() == 'S') {
                sumS += vect[i].getPontuacao();
                countS++;
            }
        }

        double mediaB = sumB / countB;
        double mediaP = sumP / countP;
        double mediaS = sumS / countS; 

        boolean running = true;
        while(running) {

            System.out.println("***Sistema do PDI***");
            System.out.println("1. Ver média dos membros Básicos");
            System.out.println("2. Ver média dos membros Plenos");
            System.out.println("3. Ver média dos membros Sêniores");
            System.out.println("4. Sair");
            System.out.printf("> ");
            int opcao = sc.nextInt();
            
            switch(opcao) {

                case 1:
                    for(int i = 0; i < n; i++) {
                        if(vect[i].getNivel() == 'B') {
                            System.out.println(vect[i].getName());
                        }
                    } 
                    System.out.println("Média: " + mediaB);

                    System.out.printf("Deseja retornar ao menu?\ns - sim\nn - nao\n> ");
                    char confirm = sc.next().charAt(0);
                    if(confirm == 'n') {
                        running = false;
                        System.exit(200);
                    }
                    
                    break;

                case 2: 
                    for(int i = 0; i < n; i++) {
                        if(vect[i].getNivel() == 'P') {
                            System.out.println(vect[i].getName());
                        }
                    } 
                    System.out.println("Média: " + mediaP);

                    System.out.printf("Deseja retornar ao menu?\ns - sim\nn - nao\n> ");
                    char confirm1 = sc.next().charAt(0);
                    if(confirm1 == 'n') {
                        running = false;
                        System.exit(200);
                    }
                    break;
                
                case 3: 
                    for(int i = 0; i < n; i++) {
                        if(vect[i].getNivel() == 'S') {
                            System.out.println(vect[i].getName());
                        }
                    } 
                    System.out.println("Média: " + mediaS);

                    System.out.printf("Deseja retornar ao menu?\ns - sim\nn - nao\n> ");
                    char confirm2 = sc.next().charAt(0);
                    if(confirm2 == 'n') {
                        running = false;
                        System.exit(200);
                    }
                    break;
                
                case 4: 
                    running = false;
                    System.exit(200);
                    break;
                
                default:
                    System.out.println("Valor invalido!");
                    break;
            }


        }
     
        sc.close();   
    }
}
