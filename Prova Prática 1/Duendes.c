/*No ano de 2020 o Papai Noel não poderá sair de casa para entregar presentes por conta da pandemia do Coronavirus. 
Então ele ordenou que seus duendes fossem entregar no lugar dele no dia do natal. 
Como eles são bastante inexperientes, irão se dividir em vários times compostos de três membros: 
Um líder, um entregador e um piloto de trenó. O plano do Papai Noel é que os líderes das equipes seja sempre os duendes 
mais velhos, por esse motivo ele pediu para todos escreverem seus nomes e idades em uma lista. 
Como você é um duende programador, resolveu ajudar o Papai Noel a organizar a lista e montar os times a partir dela.

Segue abaixo algumas regras e fatos:

A lista deve ser organizada em ordem descendente de idade;
Caso dois duendes possuírem a mesma idade, deve se organizar por ordem ascendente de nome;
Não existe dois duendes de mesmo nome;
Nenhum duende tem mais de 20 caracteres em seu nome;
Os duendes da lista tem idade entre 10 e 100 anos;
Os primeiros 1/3 dos duendes (os mais velhos), serão os líderes dos times;
A ordem dos duendes entregadores e pilotos seguem a mesma lógica dos líderes. Ex) 
Se há 6 duendes na lista, haverá dois times, onde o duende mais velho é líder do time 1, e o segundo mais velho é líder 
do time 2. O terceiro mais velho é entregador do time 1 e o quarto mais velho é entregador do time 2. 
O quinto é piloto de trenó do time 1 e o último é piloto do time 2;

Entrada
A entrada é composta de um número inteiro N (3 <= N <= 30), onde N é múltiplo de 3, que representa a quantidade de 
duedes na lista. Em seguida as próximas N linhas contém o nome e a idade de cada duende.

Saída
A saída é composta de 4 linhas por time. A primeira linha deve seguir o formato "Time X", onde X é o número do time. 
A segunda, terceira e quarta linha contém, respectivamente, o nome e idade do duende líder, entregador e piloto de trenó.
 Depois de cada time, deverá haver uma linha em branco, inclusive após o último time.*/

 //Daniel Salgado Magalhães - 821429

 #include <stdio.h>

 int main(){
    int idade[100], lider1 = 0, lider2 = 0, entregador1 = 0, entregador2 = 0, piloto1 = 0, piloto2 = 0;
    int qntDuende = 0, i = 0, temp = 0;
    scanf("%d", &qntDuende);
    int nome[qntDuende][1000];

    for(i=0;i<qntDuende;i++){
        scanf(" %[^\n\r]", nome[i]);
        /*for(int pos=0;pos<nome[i];pos++){
            if(pos.equals(" ")){
                idade[pos] = nome[pos+1];
            }
        }*/
        if(idade[i] > idade[i + 1]){
            temp = idade[i];
            idade[i] = idade[i+1];
            idade[i+1] = temp;
        }
        piloto2 = idade[0];
        piloto1 = idade[1];
        entregador2 = idade[2];
        entregador1 = idade[3];
        lider2 = idade[4];
        lider1 = idade[5];
    }

    

    printf("Time 1\n");
    printf("%s\n", nome[5]);
    printf("%s\n", nome[3]);
    printf("%s\n", nome[1]);
    printf("\nTime 2\n");
    printf("%s\n", nome[4]);
    printf("%s\n", nome[2]);
    printf("%s\n", nome[0]);

 }