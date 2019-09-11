package Aula4;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author pedro.saraujo
 */
public class DiferencaAbsoluta {

    public static void main(String[] args) throws Exception {
        FileReader arquivo = new FileReader("vetor.txt");
        BufferedReader leBufferizado = new BufferedReader(arquivo);
        String linha = leBufferizado.readLine();
        System.out.println(linha);
        String[] dados = linha.split(" ");
        int[] vetor = new int[dados.length];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = Integer.parseInt(dados[i]);
        }
        int dif = diferencaAbsoluta(vetor);
        System.out.println("Diferença: " + dif);
    }

    public static int diferencaAbsoluta(int[] v) {
        int menor = v[0];
        int maior = v[0];

        for (int i = 1; i < v.length; i++) {
            if (v[i] < menor) {
                menor = v[i];
            }
            if (v[i] > maior) {
                maior = v[i];
            }
        }
        return maior - menor;
    }
}
