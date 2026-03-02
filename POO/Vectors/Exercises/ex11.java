package POO.Vectors.Exercises;

import java.util.Locale;
import java.util.Scanner;
import POO.Vectors.Exercises.ExercisesEntities.Human;

public class ex11 {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter the amount of people you will digit: ");
        int n = sc.nextInt();
        
        double higherHeight = 0;
        double lowerHeight = 10000000;
        int countWoman = 0;
        double sumHeightWoman = 0;
        int countMan = 0;

        Human[] vect = new Human[n];

        for(int i = 0; i < n; i++) {

            System.out.printf("Person %d\n", i + 1);
            System.out.printf("Height: ");
            double height = sc.nextDouble();
            System.out.printf("Gender(W/M): ");
            char gender = sc.next().charAt(0);
            
            vect[i] = new Human(height, gender);
            
            
            if(vect[i].getHeight() > higherHeight) {
                higherHeight = vect[i].getHeight();
            }

            if(vect[i].getHeight() < lowerHeight) {
                lowerHeight = vect[i].getHeight();
            }

            
            if(vect[i].getGender() == 'W' || vect[i].getGender() == 'w') {
                countWoman++;
                sumHeightWoman += vect[i].getHeight();
            }

            
            if(vect[i].getGender() == 'M' || vect[i].getGender() == 'm') {
                countMan++;
            }
        }

        double media = sumHeightWoman / countWoman;


        System.out.printf("The highest person have: %.2f\n", higherHeight);
        System.out.printf("The lowest person have: %.2f\n", lowerHeight);
        System.out.printf("The average women height: %.2f\n", media);
        System.out.printf("The amount of men: %d", countMan);
        sc.close();
    }
}
