public class A {
    protected int x, y;
    private int z;

    public A(int a, int b, int c){
        this.x = a;
        this.y = b;
        this.z = c;
    }
    public int obterX(){
        return this.x;
    }
    public int obeterY(){
        return this.y;
    }
    public int obterZ(){
        return this.z;
    }
    public void alterarX(int a){
        this.x = a;
    }
    public void alterarY(int b){
        this.y = b;
    }
    public void alterarZ(int c){
        this.z = c;
    }

    public void  imprimevalores(){
        System.out.println("Estou na classe A. ");
        System.out.println("Valor de X é: " + this.x);
        System.out.println("Valor de Y é: " + this.y);
        System.out.println("Valor de Z é: " + this.z);
    }
}
