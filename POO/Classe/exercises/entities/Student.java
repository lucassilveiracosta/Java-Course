package POO.Classe.exercises.entities;

public class Student {
    
    public String name;
    public double nota1; // até 30
    public double nota2; // até 35
    public double nota3; // ate 35

    public double sum() {
        return nota1 + nota2 + nota3;
    }

    public boolean passOrFailed() {

        if(sum() >= 60) {
            return true;
        }
        else {
            return false;
        }
    }
}
