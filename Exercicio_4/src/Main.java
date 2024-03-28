public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro("Princípios de Orientação a Objetos em JAVASCRIPT", 2014);
        Revista revista = new Revista("MSDN", 2011);

        int diasAtrasoLivro = 8;
        int diasAtrasoRevista = 15;

        Emprestimo emprestimoLivro = new Emprestimo(livro, diasAtrasoLivro);
        Emprestimo emprestimoRevista = new Emprestimo(revista, diasAtrasoRevista);

        double multaTotalLivro = emprestimoLivro.calcularMultaTotal();
        double multaTotalRevista = emprestimoRevista.calcularMultaTotal();

        System.out.println("A multa total do livro é: R$ " + multaTotalLivro);
        System.out.println("A multa total de revista é: R$ " + multaTotalRevista);
    }
}
