import java.util.Locale;
import java.util.Scanner;

public class inOut {
    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.printf("Digite onde esta o centro da círculo\n> ");
        double cx = sc.nextDouble();
        System.out.printf("> ");
        double cy = sc.nextDouble();

        System.out.printf("\nDigite o raio da círculo\n> ");
        double radius = sc.nextDouble();

        System.out.printf("\nDigite o ponto para a verificação\n> ");
        double px = sc.nextDouble();
        System.out.printf("> ");
        double py = sc.nextDouble();

        double dist = pointsDistance(cx, cy, px, py);

        pos(radius, dist);
        sc.close();
    }

    public static void pos(double radius, double dist) {
        if(dist > radius){
            System.out.printf("\n\nO ponto não pertence ao círculo por %.1f", dist - radius);
        }
        else {
            System.out.println("O ponto pertence a círculo!");
        }
    }

    public static double pointsDistance(double centrox, double centroy, double pointx, double pointy) {
        double dist = Math.sqrt(Math.pow(centrox - pointx, 2) + Math.pow(centroy - pointy, 2)); 
        return dist;
    }
}
