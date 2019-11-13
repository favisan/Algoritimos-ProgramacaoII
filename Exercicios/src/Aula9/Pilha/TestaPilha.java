package Aula9.Pilha;

/**
 * @author pedro.saraujo
 */
public class TestaPilha {

    public static void main(String[] args) {
        Pilha p = new Pilha(30);
        p.push('a');
        p.push('b');
        p.push('c');
        
        while (!p.isEmpty()) {
            char e = p.pop();
            System.out.print(e + " ");
            System.out.println("");
        }
    }

}
