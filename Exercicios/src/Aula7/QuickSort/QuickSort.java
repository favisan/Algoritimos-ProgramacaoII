package Aula7.QuickSort;

/**
 * @author pedro.saraujo
 */
public class QuickSort {

    public static void main(String[] args) {
        int v[] = {5, 6, 2, 7, 9, 1, 8, 3, 7};
        int i = particao(v, 0, v.length - 1);
        imprimeVetor(v);
        System.out.println("Pivo: " + i);
        quickSort(v, 0, v.length - 1);
        imprimeVetor(v);
    }

    // A função quickSort recebe como parametro, p < r, 
    // e rearranja o vetor de modo que ele fique em ordem crescente. 
    public static void quickSort(int v[], int p, int r) {
        if (p < r) {
            int pivo = particao(v, p, r);
            quickSort(v, p, pivo - 1);
            quickSort(v, pivo + 1, r);
        }
    }

    // A função rearranja o vetor v[p..r] e devolve 
    // um elemento j do conjunto p..r tal que v[p..j-1] ≤ v[j] < v[j+1..r], 
    // onde em v[j] estaria o pivô.
    // Retorna o índice onde ficou o pivo.
    public static int particao(int v[], int p, int r) {
        int c, i, j;
        // pivo
        c = v[p];
        i = p + 1;
        j = r;
        while (i <= j) {
            if (v[i] <= c) {
                i++; // sobe i
            } else if (v[j] > c) {
                j--; // desce j
            } else {
                // troca
                int t = v[i];
                v[i] = v[j];
                v[j] = t;
                i++;
                j--;
            }
        }
        // agora p == j+1
        v[p] = v[j];
        v[j] = c;
        return j;
    }

    public static void imprimeVetor(int v[]) {
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }
    }
}
