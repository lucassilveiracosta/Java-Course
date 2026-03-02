package POO.Vectors.Exercises.ExercisesEntities;

public class Human {
    
    private double height;
    private char gender;

    public Human(double height, char gender) {

        this.height = height;
        this.gender = gender;
    } 

    public char getGender() {
        return this.gender;
    }

    public double getHeight() {
        return this.height;
    }
}
