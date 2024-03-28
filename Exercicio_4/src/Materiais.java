public abstract class Materiais {
    private String titulo;
    private int anoPublicacao;

    public Materiais(String titulo, int anoPublicacao){
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
    }
    public String getTitulo() {
        return titulo;
    }
    public int getAnoPublicacao() {
        return anoPublicacao;
    }
    public double calcularMulta(int diasAtraso) {
        return 0;
    }
}
