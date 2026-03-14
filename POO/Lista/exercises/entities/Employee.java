package POO.Lista.exercises.entities;

public class Employee {
    
    private int Id;
    private String name;
    private double salary;

    public Employee(int Id, String name, double salary) { // Constructor
        this.Id = Id;
        this.name = name;
        this.salary = salary;
    }
    public int getId() {
        return this.Id;
    }

    public String getName() {
        return this.name;
    }

    public double getSalary() {
        return this.salary;
    }

    public int setId(int Id) {
        return this.Id = Id;
    }

    public String setName(String name) {
        return this.name = name;
    }

    public double setSalary(double salary) {
        return this.salary = salary;
    }

    public double salaryRaise(double salary, double percentage, Employee user) {
        return user.setSalary(salary * (1 + (double) percentage / 100));
    }
}
