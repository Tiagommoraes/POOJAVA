class Livro extends Materiais {
    public Livro( String titulo, int anoPublicacao){
        super(titulo, anoPublicacao);
    }
    public double calcularMulta(int diasAtraso){
        double multaPorDia = 0.50;
        return diasAtraso * multaPorDia;
    }
}

