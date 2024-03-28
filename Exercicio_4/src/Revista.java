class Revista extends Materiais {
    public Revista (String titulo, int anoPublicacao) {
        super(titulo, anoPublicacao);
    }

    @Override
    public double calcularMulta(int diasAtraso) {
        double multaPorDia = 0.50;
        return diasAtraso * multaPorDia;
    }
}
