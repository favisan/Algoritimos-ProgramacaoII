package Aula9.Pilha;

import java.util.Scanner;

/**
 * @author pedro.saraujo
 */
//Exercício 1:
/*
Escreva uma função que recebe uma String e usando uma pilha inverte
as letras de cada palavra da String preservando a ordem das palavras.
Note que sempre a String é finalizada por ponto, por exemplo, dado o
texto:
        ESTE EXERCÍCIO É MUITO FÁCIL.
        a saída deve ser:
        ETSE OICÍCREXE É OTIUM LICÁF.
 */
public class ExercicioI {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Texto: ");
        String s = in.nextLine();
        Pilha p = new Pilha(100);
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != ' ') {
                p.push(c);
            } else {
                while (!p.isEmpty()) {
                    System.out.print(p.pop());
                }
                System.out.print(' ');
            }
        }
        while (!p.isEmpty()) {
            System.out.print(p.pop());
        }
    }
}
