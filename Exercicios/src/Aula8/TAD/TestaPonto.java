package Aula8.TAD;

/**
 * @author pedro.saraujo
 */
public class TestaPonto {

    public static void main(String[] args) {
        Ponto p1 = new Ponto(2, 5);
        Ponto p2 = new Ponto(-5, -2);
        System.out.println(p1);
        System.out.println(p2);
        boolean igual = p1.igual(p2);
        System.out.println("P1 = P2? " + igual);
        double d = p1.distancia(p2);
        System.out.println("Distancia: " + d);
    }
}
