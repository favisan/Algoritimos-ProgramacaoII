package Aula1;

/*
 * @author pedro.saraujo
 */
public class Exercicio1 {

    static String interseccao(int a[], int b[]) {
        //StringBuilder melhor desempenho na concatenação.
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    res.append(a[i] + " ");
                }
            }
        }
        return res.toString();
    }

    public static void main(String[] args) {
        int[] a = {7, 2, 5, 8, 4};
        int[] b = {4, 2, 9, 5};

        System.out.println(interseccao(a, b));
        
    }
}
