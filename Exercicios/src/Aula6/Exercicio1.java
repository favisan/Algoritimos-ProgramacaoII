package Aula6;

/**
 * @author pedro.saraujo
 */
public class Exercicio1 {

    public static void main(String[] args) {
        int f = fatorial(5);
        System.out.println(f);
    }

    public static int fatorial(int n) {
        if (n == 0) 
            return 1;
        int ret = fatorial(n - 1);
        int solucao = n * ret;
        return solucao;

    }
}
