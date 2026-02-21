package POO.Classe.exercises;

import java.util.Locale;
import java.util.Scanner;
import POO.Classe.exercises.entities.Student;

public class ex3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student someone;
        someone = new Student();

        System.out.printf("Name: ");
        someone.name = sc.next();
        System.out.printf("Nota 1: ");
        someone.nota1 = sc.nextDouble();
        System.out.printf("Nota 2: ");
        someone.nota2 = sc.nextDouble();
        System.out.printf("Nota 3: ");
        someone.nota3 = sc.nextDouble();

        System.out.println("\nFinal grade: " + someone.sum());

        if(someone.passOrFailed()) {
            System.out.println("PASSED");
        }
        else {
            System.out.printf("FAILED by %.1f points", 60 - someone.sum());
        }
        sc.close();
    }
}
