package Aula9.Pilha;

/**
 * @author pedro.saraujo
 */
public class PilhaChar {

    // atributos
    private char[] elementos;
    private int topo;

    public PilhaChar(int n) {
        elementos = new char[n];
        topo = -1;
    }

    //métodos
    public boolean isEmpty() {
        return topo == -1;
    }

    public boolean isFul() {
        return topo == elementos.length - 1;
    }

    public void push(char e) {
        if (!isFul()) {
            topo++;
            elementos[topo] = e;
        }
    }

    public char pop() {
        char e = elementos[topo];
        topo--;
        return e;
    }
}
