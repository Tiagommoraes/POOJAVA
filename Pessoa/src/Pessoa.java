public class Pessoa{
    private String nome;
    private int idade;
    private String cidadeResidencia;

public Pessoa(String nome, int idade, String cidadeResidencia){
    this.nome = nome;
    this.idade = idade;
    this.cidadeResidencia = cidadeResidencia;
}
//METODO APRESENTAR
    public void apresentar(){
        System.out.println("Meu nome é: " + nome);
        System.out.println("Minha idade é: " + idade);
        System.out.println("Minha cidade de residência é: " + cidadeResidencia);
    }
public static void main(String[] args) {
    //EXEMPLO
    Pessoa pessoaA = new Pessoa("Ayla Raphysa", 01, "Belo Horizonte");
    Pessoa pessoaB = new Pessoa("Thágley", 31,"Belo Horizonte");

    //APRESENTAR PESSOAS
    System.out.println("Informações da 1ª pessoa");
    pessoaA.apresentar();
    System.out.println("\nInformações da 2ª pessoa");
    pessoaB.apresentar();
}
}