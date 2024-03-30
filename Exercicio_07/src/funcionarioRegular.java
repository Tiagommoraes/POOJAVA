public class funcionarioRegular extends Funcionario {
    public funcionarioRegular(String nome, double salarioPorHora, int horasTrabalhadasPorMes){
        super(nome, salarioPorHora, horasTrabalhadasPorMes);
    }
    public double calcularSalarioMensal(){
        return getSalarioPorHora() * getHorasTrabalhadasPorMes();
    }
}
