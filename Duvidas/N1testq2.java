package Duvidas;

public class N1testq2 {

    public static int[] somaInsertionSort(int[] l1, int[] l2, int m1, int m2){
        int[] listSom = new int[m1 + m2];

        for (int i = 0; i < m1; i++) {
            listSom[i] = l1[i];
        }

        for (int i = 0; i < m2; i++) {
            listSom[i + m1] = l2[i];
        }

        for (int i = 1; i < m1 + m2; i++) {
            int key = listSom[i];
            int j = i - 1;

            while ((j > -1) && key > listSom[j]) {

                listSom[j + 1] = listSom[j];
                j--;
            }
            listSom[j + 1] = key;
        }
        return listSom;
    }

    public static void main(String[] args) {


        int[] array1 = { 1 , 9 , 5 , 3 };
        int[] array2 = { 2 , 11 , 4 , 7 , 8 };

        int tam1 = array1.length;
        int tam2 = array2.length;

        int[] arrayRes = somaInsertionSort(array1, array2, tam1, tam2);

        System.out.println("Tamanho do vetor: " + arrayRes.length);
        for (int x: arrayRes) {
            System.out.println(x);
        }
    }
}
