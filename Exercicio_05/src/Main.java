public class Main {
    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo("Toyota", "Corolla", 2024);
        Carro carro = new Carro("Volkswagem", "Jetta", 2024, 4);
        Moto moto = new Moto("Harley-Davidson", "CVO Road Glid", 2024);

        System.out.println(veiculo);
        System.out.println(carro);
        System.out.println(moto);
    }
}
