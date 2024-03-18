public class B extends A{
    private int k;

    public B(int a, int b, int c, int d){
        super(a, b, c);
        this.k = d;
    }
    public void  imprimevalores(){
        System.out.println("Estou na classe B.");
        System.out.println("Valor de X é: " + this.x);
        System.out.println("Valor de Y é: " + this.y);
        System.out.println("Valor de K é: " + this.k);
        System.out.println("Z não é visível nesta classe.");
        System.out.println("Valor de Z é: " + obterZ());
    }

    public static void main(String[] args) {
        B obj1 = new B(1, 2,3,4);

        obj1.imprimevalores();
        obj1.alterarY(20);
        obj1.imprimevalores();
    }
}
