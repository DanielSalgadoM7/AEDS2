/*Crie um método ITERATIVO que recebe uma string, sorteia duas letras minúsculas aleatórias (código ASCII <= 'a' e >= 'z'), 
substitui todas as ocorrências da primeira letra na string pela segunda e retorna a string com as alterações efetuadas. 
Na saída padrão, para cada linha de entrada, execute o método desenvolvido nesta questão e mostre a string retornada como uma linha de saída. Abaixo, observamos um exemplo de entrada supondo que para a primeira linha as letras sorteados foram o 'a' e o 'q'. Para a segunda linha, foram o 'e' e o 'k'.


EXEMPLO DE ENTRADA:                                     EXEMPLO DE SAÍDA:

o rato roeu a roupa do rei de roma             o rqto roeu q roupq do rei de romq

e qwe qwe qwe ewq ewq ewq                     k qwk qwk qwk kwq kwq kwq

FIM


A classe Random do Java gera números (ou letras) aleatórios e o exemplo abaixo mostra uma letra minúscula na tela. Em especial, destacamos que:

i) \textit{seed} é a semente para geração de números aleatórios;
ii) nesta questão, por causa da correção automática, a *seed* será quatro;
iii) a disciplina de Estatística e Probabilidade faz uma discussão sobre ``aleatório''.

Random gerador = new Random();
gerador.setSeed(4);
System.out.println((char)('a' + (Math.abs(gerador.nextInt()) % 26)));*/

//Daniel Salgado Magalhães - 821429

import java.util.Random;

public class TP1Q04{
    public static void main(String[] args)throws Exception{
        String entrada = "";
        Random gerador = new Random();
        gerador.setSeed(4);

        //loop infinito até o break da palavra FIM
        while(true){
           entrada = MyIO.readLine();
           if(entrada.equals("FIM")){
            break;
           }
           
           MyIO.println(alteracaoAleatoria(entrada, gerador));
        }
    }

    public static String alteracaoAleatoria(String entrada, Random gerador){
        
        char letraOriginal = (char)('a' + (Math.abs(gerador.nextInt()) % 26));
        char letraTrocada = (char)('a' + (Math.abs(gerador.nextInt()) % 26));

        String fraseAleatoria = "";

        //for que compara o char para a letra original, caso seja igual, ele troca para a letra gerada aleatoriamente
        for(int i = 0;i<entrada.length();i++){
            if(entrada.charAt(i) == letraOriginal){
                fraseAleatoria += letraTrocada;
            }else{
                fraseAleatoria += entrada.charAt(i);
            }
        }

        return fraseAleatoria; 
    }
}
