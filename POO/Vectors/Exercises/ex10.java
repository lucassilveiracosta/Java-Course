package POO.Vectors.Exercises;

import java.util.Locale;
import java.util.Scanner;


import POO.Vectors.Exercises.ExercisesEntities.Student;

public class ex10 {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter how mane students you will enter: ");
        int n = sc.nextInt();

        Student[] vect = new Student[n];
        for(int i = 0; i < n; i++) {
            System.out.printf("Student %d\n", i + 1);
            System.out.printf("Name: ");
            String name = sc.next();
            System.out.printf("Grade 1: ");
            double grade1 = sc.nextDouble();
            System.out.printf("Grade 2: ");
            double grade2 = sc.nextDouble();

            boolean passed;
            if(grade1 + grade2 >= 12) {
                passed = true;
            }
            else {
                passed = false;
            }

            vect[i] = new Student(name, grade1, grade2, passed);

        }

        System.out.println("Approved students");
        for(int i = 0; i < n; i++) {
            
            if(vect[i].getPassed()){
                System.out.println(vect[i].getName());
            }
        }
        sc.close();
    }
}
