public class Gerente extends Funcionario{
    public String departamento;
    public Gerente(String nome, int idade, double salario, String departamento) {
        super(nome, idade, salario);
        this.departamento = departamento;
    }
    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    @Override
    public void info() {
        super.info();
        System.out.println("Departamento: " + departamento);
    }
}

