public class Produto {
    private String nome;
    private double precoUnitario;
    private int qtdEmEstoque;
    public Produto (String nome, double precoUnitario, int qtdEmEstoque) {
        this.nome = nome;
        this.precoUnitario = precoUnitario;
        this.qtdEmEstoque = qtdEmEstoque;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getPrecoUnitario() {
        return precoUnitario;
    }
    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }
    public int getQtdEmEstoque() {
        return qtdEmEstoque;
    }
    public void setQtdEmEstoque(int qtdEmEstoque) {
        this.qtdEmEstoque = qtdEmEstoque;
    }
    public void adicionarEstoque (int quantidade){
        this.qtdEmEstoque += quantidade;
        System.out.println("Estoque adicionado. " + quantidade);
    }
    public void removerEstoque(int quantidade){
        if (quantidade <= this.qtdEmEstoque){
            this.qtdEmEstoque -= quantidade;
            System.out.println("Estoque removido. " + quantidade);
        }else {
            System.out.println("Estoque com quantidade insulficiente! ");
        }
    }

    public static void main(String[] args) {
        Produto produto1 = new Produto("Arroz 5kl", 35.0, 100);
        Produto produto2 = new Produto("Feijão ", 5.0, 100);

        System.out.println("Adicionando estoque ao produto 1: ");
        produto1.adicionarEstoque(10);
        produto1.removerEstoque(6);

        System.out.println("Adicionando estoque ao produto 2");
        produto2.adicionarEstoque(20);
        produto2.removerEstoque(15);

        System.out.println("Produdo 1: ");
        System.out.println("Nome: " + produto1.getNome());
        System.out.println("Preço unitário: " + produto1.getPrecoUnitario());
        System.out.println("Quantidade em estoque: " + produto1.getQtdEmEstoque());

        System.out.println("Produto 2: ");
        System.out.println("Nome: " + produto2.getNome());
        System.out.println("Preço unitário: " + produto2.getPrecoUnitario());
        System.out.println("Quantidade em estoque: " + produto2.getQtdEmEstoque());
    }
}