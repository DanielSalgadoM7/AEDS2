/*Leia duas strings sendo que a primeira é o nome de uma página web e a segunda, seu endereço. 
Por exemplo, Pontifícia Universidade Católica de Minas Gerais e www.pucminas.br. 
Em seguida, mostre na tela o número de vogais (sem e com acento), consoantes e dos padrões <br> e <table> que aparecem no código dessa página.
A entrada padrão é composta por várias linhas. Cada uma contém várias strings sendo que a primeira é um endereço web e as demais o nome dessa página 
web. A última linha da entrada padrão contém a palavra FIM. A saída padrão contém várias linhas sendo que cada uma apresenta o número de ocorrência 
(valor x_{i} entre parênteses) de cada caractere ou string solicitado. Cada linha de saída será da seguinte forma: a(x_{1}) e(x_{2}) i(x_{3}) o(x_{4})
 u(x_{5}) á(x_{6}) é(x_{7}) í(x_{8}) ó(x_{9}) ú(x_{10}) à(x_{11}) è(x_{12}) ì(x_{13}) ò(x_{14}) ù(x_{15}) ã(x_{16}) õ(x_{17}) â(x_{19}) ê(x_{19}) 
 î(x_{20}) ô(x_{21}) û(x_{22}) consoante(x_{23}) *<br>*(x_{24}) *<table>*(x_{25}) nomepágina(x_{26}). */

//Daniel Salgado Magalhães - 821429

public class TP1Q07 {
    public static void main(String[] args) {
        String endereco, html;
        endereco = "";
        html = getHtml(endereco);
    }

    public static String getHtml(String endereco){
        String site = "";
        return site;
    }
}
