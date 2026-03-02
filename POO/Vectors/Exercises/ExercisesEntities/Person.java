package POO.Vectors.Exercises.ExercisesEntities;

public class Person {
    
    private String name;
    private int age; 

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public String getName() {
        return this.name;
    }

    public String setName(String name) {
        return this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public int setAge(int age) {
        return this.age = age;
    }
}
