import java.awt.geom.Arc2D;
import java.util.Scanner;

public class CadastroProduto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Produto[] produtos = new Produto[3];

        for (int i = 0; i < produtos.length; i++) {
            System.out.println("Digite o nome do produto " + (i + 1) + ": ");
            String nome = scanner.nextLine();
            System.out.println("Digite o preço do produto " + (i + 1) + ": ");
            double preco = Double.parseDouble(scanner.nextLine());
            System.out.println("Informe a quantidade de produtos " + (i + 1) + ": ");
            int quantidade = Integer.parseInt(scanner.nextLine());

            produtos[i] = new Produto(nome, preco,quantidade);
        }
        System.out.println("Dados Cadastrados ");
        double totalGeral = 0;
        Produto produtomaiorValorTotal = null;
        double maiorValorTotal = Double.MIN_VALUE;

        for (Produto produto : produtos) {
            double valorTotal = produto.calcularValorTotal();
            totalGeral += valorTotal;

            System.out.println("Nome: " + produto.getNome() + ",preço: R$" + produto.getPreco()
            + ",quantidade: " + produto.getQuantidade() + ", valor total: R$" + valorTotal);
            if (valorTotal > maiorValorTotal) {
                maiorValorTotal = valorTotal;
                produtomaiorValorTotal = produto;
            }
        }
        if (produtomaiorValorTotal != null) {
            System.out.println("Produto com o maior valor total: ");
            System.out.println("Nome: " + produtomaiorValorTotal.getNome()+
                    ", Valor Total: R$" + produtomaiorValorTotal.calcularValorTotal());
        }
        double mediaValoresTotais = totalGeral / produtos.length;
        System.out.println("Médias dos valores totais: R$" + mediaValoresTotais);

        scanner.close();
    }
}
