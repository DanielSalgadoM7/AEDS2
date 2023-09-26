/*Crie uma classe Jogador seguindo todas as regras apresentadas no slide unidade01g_conceitosBasicos_introducaoOO.pdf. 
Sua classe terá os atributos privados id(int), nome(String), altura(int), peso(int), universidade (String), anoNascimento (int), 
cidadeNascimento(String), estadoNascimento(String). Sua classe também terá pelo menos dois construtores, e os métodos gets, sets, 
clone, imprimir e ler.


O método imprimir mostra os atributos do registro (ver cada linha da saída padrão) e o ler lê os atributos de um registro. 
Atenção para o arquivo de entrada, pois em alguns registros faltam valores e esse foi substituído pelo valor “nao informado”.


A entrada padrão é composta por várias linhas e cada uma contém uma string indicando o id do jogador a ser lido. A última 
linha da entrada contém a palavra FIM. A saída padrão também contém várias linhas, uma para cada registro contido em uma linha da 
entrada padrão.* */

public class Jogadores{
    private int id;
    private String nome;
    private int altura;
    private int peso;
    private String universidade;
    private int anoNascimento;
    private String cidadeNascimento;
    private String estadoNascimento;

    //construtor sem parâmetro
    public Jogadores(){
        this.id = -1;
        this.nome = "";
        this.altura = -1;
        this.peso = -1;
        this.universidade = "";
        this.anoNascimento = -1;
        this.cidadeNascimento = "";
        this.estadoNascimento = "";
    }

    
    //construtor com parâmetro
    public Jogadores(int id, String nome, int altura, int peso, String universidade, int anoNascimento, String cidadeNascimento, 
    String estadoNascimento){
        this.id = id;
        this.nome = nome;
        this.altura = altura;
        this.peso = peso;

        if(universidade != null){
            this.universidade = universidade;
        }else{
            this.universidade = "nao informado";
        }

        this.anoNascimento = anoNascimento;

        if(cidadeNascimento != null){
            this.cidadeNascimento = cidadeNascimento;
        }else{
            this.cidadeNascimento = "nao informado";
        }

        if(estadoNascimento != null){
            this.estadoNascimento = estadoNascimento;
        }else{
            this.estadoNascimento = "nao informado";
        }
    }




    //getters
    public int getId(){
        return id;
    }

    public String getNome(){
        return nome;
    }

    public int getAltura(){
        return altura;
    }

    public int getPeso(){
        return peso;
    }

    public String getUniversidade(){
        return universidade;
    }

    public int getanoNascimento(){
        return anoNascimento;
    }

    public String getcidadeNascimento(){
        return cidadeNascimento;
    }

    public String getestadoNascimento(){
        return estadoNascimento;
    }

    //getters
    public void setId(int id){
        this.id = id;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setAltura(int altura){
        this.altura = altura;
    }

    public void setPeso(int peso){
        this.peso = peso;
    }

    public void setUniversidade(String universidade){
        this.universidade = universidade;
    }

    public void setanoNascimento(int anoNascimento){
        this.anoNascimento = anoNascimento;
    }

    public void setcidadeNascimento(String cidadeNascimento){
        this.cidadeNascimento = cidadeNascimento;
    }

    public void setestadoNascimento(String estadoNascimento){
        this.estadoNascimento = estadoNascimento;
    }

    public void Imprimir(){
        System.out.println("[" + id + " ## " + nome + " ## " + altura + " ## " + peso + " ## " + universidade + " ## " + anoNascimento + " ## " + 
        cidadeNascimento + " ## " + estadoNascimento + "]");
    }
}