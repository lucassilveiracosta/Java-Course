package POO.Vectors.Exercises.ExercisesEntities;


public class Student {
    private String name;
    private double grade1;
    private double grade2;
    private boolean passed;

    public Student(String name, double grade1, double grade2, boolean passed) {

        this.name = name;
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.passed = passed;
    }

    public String getName() {
        return this.name;
    }
    
    public double getGrade1() {
        return this.grade1;
    }

    public double getGrade2() {
        return this.grade2;
    }

    public boolean getPassed() {
        return this.passed;
    }

}
