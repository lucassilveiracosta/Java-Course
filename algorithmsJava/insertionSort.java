package algorithmsJava;
public class insertionSort {
    public static void main(String[] args) {
        
        int n = 5;

        int[] vect = new int[n];

        vect[0] = 3;
        vect[1] = 5;
        vect[2] = 1;
        vect[3] = 4;
        vect[4] = 2;

        for(int j = 1; j < n; j++) { // 0 -> 4

            int chave = vect[j];
            int i = j - 1;

            // i --> 1
            // i --> 0

            while(i >= 0 && chave < vect[i]) {

                int aux = vect[i + 1];
                vect[i + 1] = vect[i];
                vect[i] = aux;
                i--;
                
            }
        }

        for(int i = 0; i < n; i++) {
            System.out.println(vect[i]);
        }
    }
}
