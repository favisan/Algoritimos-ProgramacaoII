package Aula2;

/**
 *
 * @author pedro.saraujo
 */
//Exercicio de intercalação:
public class Exercicio2 {

    public static int[] intercalar(int a[], int b[]) {
        int[] c = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                c[k] = a[i];
                i++;
            } else {
                c[k] = b[j];
                j++;

            }
            k++;
        }
        while (i < a.length) {
            c[k] = a[i];
            i++;
            k++;
        }
        while (j < b.length) {
            c[k] = b[j];
            j++;
            k++;
        }
        return c;
    }
    
    public static void main(String[] args) {
        int a[] = {1,3,5,7};
        int b[] = {2,4,6};
        int res[] = intercalar(a,b);
        
        for (int i = 0; i < res.length; i++) {
            System.out.println("Res["+i+"]="+res[i]);
        }
    }
}
