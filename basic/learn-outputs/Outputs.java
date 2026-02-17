import java.util.Locale;

public class Outputs { 
    
    double x = 10.2;
    double y = 20.4;

    String a = "lucas";

    public static void main(String[] args) { 
        Locale.setDefault(Locale.US); // para transformar a virgula em ponto ex.:  10,14 --> 10.14
        Outputs obj = new Outputs();
        double sum = obj.x + obj.y;
        System.out.printf("The sum of x and y is: %.2f", sum);
    }

    /*public static void main(String[] args) {
        Outputs name = new Outputs();
        String res = name.a;
        System.out.printf("Hello, %s", res);
    }*/
}


// To show de variables, we can use these forms
// %f --> float variables
// %d --> int variables
// %s --> text