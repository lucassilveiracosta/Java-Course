package POO.Classe.exercises.entities;

public class Employee {
    
    public String name;
    public double salary;
    public double tax;

    public double netSalary() {
        return salary - tax;
    }

    public double increaseSalary(double percentage) {
        return (salary * percentage) + netSalary();
    }
}
