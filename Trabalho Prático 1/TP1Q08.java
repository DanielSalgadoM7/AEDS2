/*Faça um programa que leia um número inteiro n indicando o número de valores
 * reais que devem ser lidos e salvos sequencialmente em um arquivo texto. Após
 * a leitura dos valores, devemos fechar o arquivo. Em seguida, reabri-lo e
 * fazer a leitura de trás para frente usando os métodos getFilePointer e seek
 * da classe RandomAccessFile e mostre todos os valores lidos na tela. Nessa
 * questão, você não pode usar, arrays, strings ou qualquer estrutura de dados.
 * A entrada padrão é composta por um número inteiro n e mais n números reais. A
 * saída padrão corresponde a n números reais mostrados um por linha de saída.*/

// Daniel Salgado Magalhães - 821429

public class TP1Q08{
    public static void main(String[] args){
        int entradaNum = 0;
        float valorLido = 0;

        entradaNum = MyIO.readInt();

        for(int i=0;i<entradaNum;i++){
            valorLido = MyIO.readFloat();
        }
        
    }
}
