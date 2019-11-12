package Aula8.TAD;

/**
 * @author pedro.saraujo
 */
public class TestaFracao {

    public static void main(String[] args) {
        Fracao f1 = new Fracao(2, 4);
        Fracao f2 = new Fracao(1, 2);
        System.out.println(f1);
        System.out.println(f2);
        Fracao s = f1.soma(f2);
        System.out.println(s);
        Fracao m = f1.multiplicacao(f2);
        System.out.println(m);
        Boolean i = f1.igualdade(f2);
        System.out.println("Iguais? " + i);
    }
}
