package algorithmsJava;



public class MergeSort {

    public static void mergeSort(int inicio, int fim, int[] lista) {
        int meio = (int) (inicio + fim) / 2;
        if (fim - inicio > 1) {
            mergeSort(inicio, meio, lista);
            mergeSort(meio, fim, lista);
            merge(inicio, meio, fim, lista);
        }
    }

    public static int[] merge(int inicio, int meio, int fim, int[] lista) {
        int[] listaEsquerda = new int[meio - inicio];
        int[] listaDireita = new int[fim - meio]; // inicialização de array temp

        for (int i = 0; i < listaEsquerda.length; i++) {
            listaEsquerda[i] = lista[i + inicio];  // atribuindo ao array as listas quebradas
        }

        for (int i = 0; i < listaDireita.length; i++) {
            listaDireita[i] = lista[meio + i]; // atribuindo ao array as listas quebradas
        }

        int[] listaJunta = new int[fim - inicio];
        int i = 0;
        int j = 0;
        int k = inicio;

        while (i < listaEsquerda.length && j < listaDireita.length) { // atribuindo a lista os numeros das listas quebradas
            if (listaEsquerda[i] <= listaDireita[j]) {
                lista[k] = listaEsquerda[i];
                i++;
            } else {
                lista[k] = listaDireita[j];
                j++;
            }
            k++;
        }

        while (i < listaEsquerda.length) { // pega o que sobra e aloca no array
            lista[k] = listaEsquerda[i];
            i++;
            k++;
        }

        while (j < listaDireita.length) { // pega o que sobra e aloca no array
            lista[k] = listaDireita[j];
            j++;
            k++;
        }
        return lista;
    }

    static void main(String[] args) {

        int[] array = { 9, 7, 8, 4, 6, 5, 1, 3};

        mergeSort(0, 8, array);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
