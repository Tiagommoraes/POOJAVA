public class TesteFuncionário {
    public static void main(String[] args) {
        funcionarioRegular regular = new funcionarioRegular("Tiago", 30.0, 180);
        System.out.println("Seu Salário Mensal Regular é de: " + regular.calcularSalarioMensal());

        funcionarioTerceirizado terceirizado = new funcionarioTerceirizado("Pedro ", 35.0, 200);
        System.out.println("Seu Salário Mensal Terceirizado é de: " + terceirizado.calcularSalarioMensal());
    }
}
