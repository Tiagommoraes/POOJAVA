public class ContaBancaria {
    private int numero;
    private String titular;
    private double saldo;

    //CONSTRUTOR
    public ContaBancaria(int numero, String titular, double saldo ) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;

    }
    //METODO
    public void depositar(double valor){
        saldo += valor;
        System.out.println("Depósito de R$" + valor + " Realizado, Obrigado!");

    }
    //SAQUE
    public void sacar(double valor){
        if (valor <= saldo){
            saldo -= valor;
            System.out.println("Saque de R$ " + valor+  " Realizado com sucesso.");
        } else {
            System.out.println("Voçê não possui saldo suficiente.");
        }
    }
    //EXIBIR SALDO ATUAL
    public void exibirsaldo(){
        System.out.println("Seu saldo é: R$" +saldo);
    }
    //NUMERO DA CONTA
    public int getNumero(){
        return numero;
    }
    //SETTER NUMERO DA CONTA
    public void setNumero(int numero){
        this.numero = numero;
    }
    //TITULAR DA CONTA
    public String getTitular(){
        return titular;
    }
    //SETTER TITULAR DA CONTA
    public void setTitular(String titular){
        this.titular = titular;
    }
    public static void main(String [] args){
        //EXEMPLO
        ContaBancaria minhaconta = new ContaBancaria(304321, "Tiago M Moraes", 1000.0);
        minhaconta.depositar(800.0);
        minhaconta.exibirsaldo();

        minhaconta.sacar(600.0);
        minhaconta.exibirsaldo();
    }


}
