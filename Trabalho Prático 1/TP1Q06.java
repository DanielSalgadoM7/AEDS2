/*Crie um método iterativo que recebe uma string e retorna true se a mesma é composta somente por vogais. 
Crie outro método iterativo} que recebe uma string e retorna true se a mesma é composta somente por consoantes. 
Crie um terceiro método iterativo que recebe uma string e retorna true se a mesma corresponde a um número inteiro. 
Crie um quarto método iterativo que recebe uma string e retorna true se a mesma corresponde a um número real. 
Na saída padrão, para cada linha de entrada, escreva outra de saída da seguinte forma X1 X2 X3 X4 onde cada Xi é um 
booleano indicando se a é entrada é: composta somente por vogais (X1); composta somente somente por consoantes (X2); 
um número inteiro (X3); um número real (X4). Se Xi for verdadeiro, seu valor será SIM, caso contrário, NÃO.*/

public class TP1Q06{
    public static void main(String[] args){
        String entrada;

        while(true){
            entrada = MyIO.readLine();
            if(entrada.equals("FIM")){
                break;
            }

            MyIO.print(isVogal(entrada)?"SIM":"NAO");
            MyIO.println(isConsoante(entrada)?"SIM":"NAO");
        }
    }

    public static boolean isVogal(String entrada){
        entrada = entrada.toLowerCase();
        for(int i = 0;i<entrada.length();i++){
            if(entrada.charAt(i) !='a' && entrada.charAt(i) != 'e' && entrada.charAt(i) != 'i' && entrada.charAt(i) != 'o' && entrada.charAt(i) != 'u'){
                return false;
            }
        }
        return true;
    }

    public static boolean isConsoante(String entrada){
        entrada = entrada.toLowerCase();
        for(int i=0;i<entrada.length();i++){
            if(entrada.charAt(i) == 'a' || entrada.charAt(i) == 'e' || entrada.charAt(i) == 'i' || entrada.charAt(i) == 'o' || entrada.charAt(i) == 'u'){
                return false;
            }
        }
        return true;
    }

}
