package Aula2;

import java.util.Scanner;

/*
 * @author pedro.saraujo
 */
public class Exercicio1 {
    
    static Scanner input = new Scanner(System.in);

    //Função "size" determina o tamanho do vetor:
    static int size() {
        System.out.println("Informe o tamnaho do vetor: ");
        int s = input.nextInt();
        return s;
    }

    //Função "cVetInt" cria o vetor inteiro dado o tamanho passdo anteriormente:
    static int[] cVetInt(int s) {
        int[] vet = new int[s];
        
        for (int i = 0; i < s; i++) {
            System.out.printf("Posição[%d]: ", i);
            vet[i] = input.nextInt();
        }
        return vet;
        
    }

    /*Função "printInt" é para imprimir array int*/
    static void printInt(int[] array) {
        System.out.println("{");
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d", array[i]);
            if (i < array.length - 1) {
                System.out.println(", ");
            }
        }
        System.out.println("}");
    }

    //Função "printVet" imprime o vetor int:
    static void printVet(int[] vet) {
        System.out.print("Vetor Criado: ");
        System.out.print("{");
        for (int i = 0; i < vet.length; i++) {
            System.out.printf("%d", vet[i]);
            if (i < vet.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("}");
    }

    //Função "printVet" imprime o vetor int:
    static void printVetIn(int[] vet) {
        System.out.print("Vetor Invertido: ");
        System.out.print("{");
        for (int i = 0; i < vet.length; i++) {
            System.out.printf("%d", vet[i]);
            if (i < vet.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("}");
    }
    
    
    //Função "invertVet" inverte o vetor no mesmo vetor:
    static void invertVet(int vet[]) {
        int j = vet.length - 1;
        int aux;
        for (int i = 0; i < (vet.length / 2); i++) {
            aux = vet[i];
            vet[i] = vet[j];
            vet[j] = aux;
            j--;
        }
        
    /*Função melhorada:
    static void invertVet(int vet[]) {
        int aux;
        for (int i = 0; i < (vet.length / 2); i++) {
            aux = vet[i];
            vet[i] = vet[vet.length - 1 - i];
            vet[vet.length - 1 - i] = aux;
        }
    }
    */
    }

    public static void main(String[] args) {
        
        int s = size();
        int vet[] = cVetInt(s);
        printVet(vet);
        System.out.println("");
        invertVet(vet);
        printVetIn(vet);
        System.out.println("");
        
    }
    
}
