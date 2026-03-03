package POO.Vectors.Exercises.ExercisesEntities;

public class Membro {
    
    private String name;
    private char nivel;
    private double pontuacao;

    public Membro(String name, char nivel, double pontuacao) {

        this.name = name;
        this.nivel = nivel;
        this.pontuacao = pontuacao;
    }

    public String getName() {
        return this.name;
    }

    public char getNivel() {
        return this.nivel;
    }

    public double getPontuacao() {
        return this.pontuacao; 
    }
}
