class Emprestimo {
    private Materiais materiais;
    private int diasAtraso;
    public Emprestimo(Materiais materiais, int diasAtraso){
        this.materiais = materiais;
        this.diasAtraso = diasAtraso;
    }
    public double calcularMultaTotal(){
        return materiais.calcularMulta(diasAtraso);
    }
}
