package Aula9.Pilha;
/**
 * @author pedro.saraujo
 */
//Exercício 2:
/*
Escreva uma função que receba um número inteiro e positivo
representando um número decimal, determine o seu equivalente binário.
Exemplo: Dado 18 a saída deverá ser 10010. Utilize uma Pilha no
processo de conversão.
 */
public class ExercicioII {
    
        public static void main(String[] args) {
        int n = 18;
        PilhaInt p = new PilhaInt(50);
        do {
            int r = n % 2;
            p.push(r);
            n = n / 2;            
        } while (n != 0);
        System.out.print("Binario: ");
        while (!p.isEmpty()) {
            System.out.print(p.pop());
        }
        System.out.println();
    }
}

