
package Aula9.Pilha;

/*
 * @author pedro.saraujo
 */
public class BemFormada {

    public static boolean bemFormada(String s) {
        Pilha p = new Pilha(s.length());
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[') { // empilha
                p.push(c);
            } else {
                // verifica se a pilha esta vazia
                if (p.isEmpty()) { // erro
                    return false;
                }
                // retira o caracter do topo
                char topo = p.pop();
                if (c == ')' && topo == '[') { // erro
                    return false;
                }
                if (c == ']' && topo == '(') { // erro
                    return false;
                }
            }
        }
        return p.isEmpty();
    }

    public static void main(String[] args) {
        String s = "(([])";
        boolean b = bemFormada(s);
        System.out.println("Bem Formada? " + b);

    }
}