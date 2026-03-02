package POO.Vectors.Exercises;

import java.util.Locale;
import java.util.Scanner;
import POO.Vectors.Exercises.ExercisesEntities.Person;

public class ex9 {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter the amount of people: ");
        int n = sc.nextInt();

        Person[] vect = new Person[n];

        for(int i = 0; i < n; i++) {
            System.out.printf("Person %d\n", i + 1);
            String name = sc.next();
            int age = sc.nextInt();
            vect[i] = new Person(name, age);
        }

        int higherAge = 0;
        int savePos = 0;
        for(int i = 0; i < n; i++) {
            if(vect[i].getAge() > higherAge) {
                savePos = i;
                higherAge = vect[i].getAge();
            }
        }
        
        System.out.printf("The older person is: %s", vect[savePos].getName());

        sc.close();
    }
}
