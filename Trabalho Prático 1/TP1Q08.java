/*Faça um programa que leia um número inteiro n indicando o número de valores
 * reais que devem ser lidos e salvos sequencialmente em um arquivo texto. Após
 * a leitura dos valores, devemos fechar o arquivo. Em seguida, reabri-lo e
 * fazer a leitura de trás para frente usando os métodos getFilePointer e seek
 * da classe RandomAccessFile e mostre todos os valores lidos na tela. Nessa
 * questão, você não pode usar, arrays, strings ou qualquer estrutura de dados.
 * A entrada padrão é composta por um número inteiro n e mais n números reais. A
 * saída padrão corresponde a n números reais mostrados um por linha de saída.*/

// Daniel Salgado Magalhães - 821429

import java.io.FileWriter;
import java.io.IOException;

public class TP1Q08 {
    public static void main(String[] args) {
        String nomeArquivo = "arquivo.txt";

        try {
            // Cria um objeto FileWriter para escrever no arquivo
            FileWriter arq = new FileWriter(nomeArquivo);

            // Escreve números no arquivo de 1 a 10
            for (int i = 1; i <= 10; i++) {
                arq.write(String.valueOf(i) + "\n");
            }

            // Fecha o objeto FileWriter
            arq.close();

            System.out.println("Números escritos no arquivo com sucesso.");
        } catch (IOException e) {
            System.err.println("Erro ao escrever números no arquivo: " + e.getMessage());
        }
    }
}
