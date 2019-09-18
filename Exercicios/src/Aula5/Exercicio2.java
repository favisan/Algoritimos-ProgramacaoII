package Aula5;

/**
 *
 * @author pedro.saraujo
 */

/*
Considere um vetor já quase ordenado, somente o elemento último
elemento está na posição errada, escreva um função que receba um
vetor já quase ordenado, e reordene o vetor, em no máximo n passos
onde n é o tamanho do vetor, sem utilizar o método bolha.
Considere o exemplo abaixo, o elemento no índice 7 está fora de
ordem:
Após reordenar temos:
0 1 2 3  4  5  6  7
3 5 9 11 15 17 19 6

0 1 2 3 4  5  6  7
3 5 6 9 11 15 17 19
 */
public class Exercicio2 {

    public static void sort(int v[]) {
        for (int i = 0; i < v.length; i++) {
            int j = i;
            int x = v[j];
            while (j > 0 && x < v[j - 1]) {
                v[j] = v[j - 1];
                j--;
            }v[j] = x;
        }
        
    }

    public static void main(String[] args) {
        int[] v = {3, 5, 9, 11, 15, 17, 19, 6};
    }

}
