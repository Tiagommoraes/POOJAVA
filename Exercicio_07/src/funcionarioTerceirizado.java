public class funcionarioTerceirizado extends Funcionario {
    private double adicionalPorServicoTerceirizado;
    public funcionarioTerceirizado(String nome, double salarioPorHora, int horasTrabalhadasPorMes){
        super(nome, salarioPorHora, horasTrabalhadasPorMes);
        this.adicionalPorServicoTerceirizado = adicionalPorServicoTerceirizado;
    }
    public double getAdicionalPorServicoTerceirizado(){
        return adicionalPorServicoTerceirizado;
    }

    public void setAdicionalPorServicoTerceirizado(double adicionalPorServicoTerceirizado) {
        this.adicionalPorServicoTerceirizado = adicionalPorServicoTerceirizado;
    }
    public double calcularSalarioMensal(){
        return (getSalarioPorHora() * getHorasTrabalhadasPorMes()) + adicionalPorServicoTerceirizado;
    }
}
