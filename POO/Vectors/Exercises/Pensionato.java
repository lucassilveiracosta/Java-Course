package POO.Vectors.Exercises;

import java.util.Locale;
import java.util.Scanner;
import POO.Vectors.Exercises.ExercisesEntities.User;



public class Pensionato {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter the amount of users(between 1 and 10): ");
        int n = sc.nextInt();

        User[] vectUser = new User[10];
        for(int i = 0; i < n; i++) {
            System.out.printf("\nRent %d\n", i + 1);
            System.out.printf("Name: ");
            String name = sc.next();
            System.out.printf("Email: ");
            String email = sc.next();
            System.out.printf("Room(0-9): ");
            int room = sc.nextInt();

            vectUser[room] = new User(name, email);
        }

        System.out.println("\nBusy rooms");
        for(int i = 0; i < 10; i++) {
            if(vectUser[i] != null) {
                System.out.printf("%d: %s, %s\n", i, vectUser[i].getName(), vectUser[i].getEmail());
            }
        }

        sc.close();
    }
}
