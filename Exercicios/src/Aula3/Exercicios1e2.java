package Aula3;

import java.util.Scanner;

/*
 * @author pedro.saraujo
 */
public class Exercicios1e2 {

    /* Dadas duas matrizes A & B de mesmo tamanho:
 *1. Criar uma função que receba as matrizes e retorne uma nova matriz com a soma das outras duas.
 *2.Idem para multiplicção.   
     */
    static Scanner input = new Scanner(System.in, "ISO-8859-1");

    //Função "sizeM" determina o tamanho da matriz int:
    static int[] sizeM() {
        int[] size = new int[2];
        System.out.println("Informe o número de Linhas: ");
        size[0] = input.nextInt();
        System.out.println("Informe o número de Colunas: ");
        size[1] = input.nextInt();
        return size;
    }

    //Função "cMtzInt" cria a matriz int:
    static int[][] cMtzInt(int[] size) {
        int[][] matriz = new int[size[0]][size[1]];
        return matriz;
    }

    //Função popMtzInt popula a matriz int:
    static int[][] popMtzInt(int[] s) {
        int[][] matriz = new int[s[0]][s[1]];
        for (int i = 0; i < matriz.length; i++) {
            System.out.printf("Linha[%d]", i);
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("[%d]:", j);
                matriz[i][j] = input.nextInt();
            }
        }
        return matriz;
    }

    //Função "printMtzInt" printa a matriz it:
    static void printMtzInt(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("{");
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]);
                if (j < matriz[i].length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("}");
        }
    }

    //Função "sumMtz" soma as Matrizes "A" e B":
    static int[][] sumMtz(int[][] matrizA, int[][] matrizB) {
        int[][] matrizSum = new int[matrizA.length][matrizA[0].length];
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[0].length; j++) {
                matrizSum[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }
        return matrizSum;

    }

    //Função "multMtz" multiplica as Matrizes "A e B":
    static int[][] multMtz(int[][] matrizA, int[][] matrizB) {
        int[][] matrizMult = new int[matrizA.length][matrizA[0].length];
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[0].length; j++) {
                for (int k = 0; k < matrizA.length; k++) {
                    matrizMult[i][j] += matrizA[i][k] * matrizB[k][j];
                }

            }
        }
        return matrizMult;
    }

    public static void main(String[] args) {
        //Aqui sizeM está definindo o tamanho das duas matriz como pede no exercicio.
        int[] s = sizeM();
        //Criando matriz "A":
        int[][] matrizA = cMtzInt(s);
        System.out.println("");
        System.out.println("|  —————————————— |");
        System.out.println("|     POPULANDO MTZ 'A'     |");
        System.out.println("|  —————————————— |");
        matrizA = popMtzInt(s);
        System.out.println("");

        //Criando matriz "B":
        int[][] matrizB = cMtzInt(s);
        System.out.println("|  —————————————— |");
        System.out.println("|     POPULANDO MTZ 'B'     |");
        System.out.println("|  —————————————— |");
        matrizB = popMtzInt(s);

        //Imprimindo Matriz "A":
        System.out.println("");
        System.out.println("|  —————————————— |");
        System.out.println("|     MATRIZ 'A' CRIADA     |");
        System.out.println("|  —————————————— |");
        printMtzInt(matrizA);
        System.out.println("");

        //Imprimindo Matriz "B":
        System.out.println("|  —————————————— |");
        System.out.println("|     MATRIZ 'B' CRIADA     |");
        System.out.println("|  —————————————— |");
        printMtzInt(matrizB);
        System.out.println("");

        //Somando as Matrizes "A" & "B":
        System.out.println("|  —————————————— |");
        System.out.println("|     SOMA MATRIZ A & B     |");
        System.out.println("|  —————————————— |");
        int[][] matrizSum = sumMtz(matrizA, matrizB);
        printMtzInt(matrizSum);
        System.out.println("");

        //Multiplicando as Matrizes "A" & "B":
        System.out.println("|  —————————————————— |");
        System.out.println("|     MULTIPLICA MATRIZ A & B      |");
        System.out.println("|  —————————————————— |");
        int[][] matrizMult = multMtz(matrizA, matrizB);
        printMtzInt(matrizMult);
    }
}
