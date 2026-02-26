package POO.Vectors.Exercises;

import java.util.Locale;
import java.util.Scanner;

import POO.Vectors.Exercises.ExercisesEntities.People;

public class ex3 {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter the amount of people: ");
        int n = sc.nextInt();

        People[] vect = new People[n];

        for(int i = 0; i < n; i++) {
            System.out.printf("PERSON [%d]\n", i);
            System.out.printf("Enter the name: ");
            String name = sc.next();
            System.out.printf("Enter the age: ");
            int age = sc.nextInt();
            System.out.printf("Enter the height: ");
            double height = sc.nextDouble();
            
            vect[i] = new People(name, age, height);
            
        }

        
        double sumHeight = 0;
        for(int i = 0; i < n; i++) {
            sumHeight += vect[i].getHeight();

            
        }
        double avgHeight = sumHeight / n;
        System.out.printf("Average height: %.1f\n", avgHeight);


        double countAgeBelow16 = 0;
        for(int i = 0; i < n; i++) {
            if(vect[i].getAge() < 16) {
                countAgeBelow16++;
            }
        }

        System.out.printf("Percentage of people with age below 16: %.1f percent\n", (countAgeBelow16 / n) * 100);

        for(int i = 0; i < n; i++) {
            if(vect[i].getAge() < 16) {
                System.out.printf("%s\n", vect[i].getName());
            }
        }
        sc.close();
    }   
}
