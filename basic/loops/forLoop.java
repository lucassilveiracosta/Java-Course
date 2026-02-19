package basic.loops;

public class forLoop {
    public static void main(String[] args) {
        
        int x = 5;
        int y = 2;
        for(int i = 0; i < 10; i++){
            System.out.printf("%d, ", x);
            x++;
            y += 5;
            System.out.println(y);
        }
    }
}
