public class Moto extends Veiculo {
    private boolean eletrica;

    public Moto(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
        this.eletrica = eletrica;
    }
    public boolean isEletrica() {
        return eletrica;
    }
    public void setEletrica(boolean eletrica) {
        this.eletrica = eletrica;
    }

    @Override
    public String toString() {
        String tipoCombustivel = eletrica ? "Elétrica" : "Não elétrica";
        return super.toString() + ", Tipo " + tipoCombustivel;
    }
}
