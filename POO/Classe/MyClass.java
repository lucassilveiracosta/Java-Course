package POO.Classe;

import java.util.Scanner;
import POO.Classe.entities.Triangle;

public class MyClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Triangle x, y; // --> isso não cria objeto
        x = new Triangle(); //instanciando objeto
        y = new Triangle(); //instanciando objeto

        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        sc.close();
    }
}
