public class TesteFuncionário {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Tiago", 38, 2000.0);
        Gerente gerente = new Gerente("Isabel",38, 10000.0, "Gerente Geral");

        System.out.println("Informações do Funcionário: ");
        funcionario.info();
        System.out.println();

        System.out.println("Informações do Gerente: ");
        gerente.info();
    }
}
