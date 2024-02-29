public class Circulo {
    private double raio;
public Circulo (double raio){
    this.raio = raio;
}
public double calcularArea(){
    return Math.PI * raio * raio;
}
public double calcularPerimetro(){
    return 2 * Math.PI * raio;
}
public double getRaio() {
        return raio;
}
public void setRaio(double raio) {
        this.raio = raio;
}
public static void main (String[] args){
    //EXEMPLO
    Circulo circulo = new Circulo(3.5);
    //CALCULAR
    double area = circulo.calcularArea();
    System.out.println("Área do Circulo é: " + area);
    //CALCULAR PERIMETRO
    double perimetro = circulo.calcularPerimetro();
    System.out.println("O perimetro do Circulo é: " + perimetro);
}
}