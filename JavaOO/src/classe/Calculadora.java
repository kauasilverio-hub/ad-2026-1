package classe;

public class Calculadora {
    private int a, b, soma, mult, sub;
    private double div;

    public Calculadora(int a, int b){
        this.a = a;
        this.b = b;
    }

    public void Somar(){
        soma = a + b;
        System.out.println("Soma: " +soma);
    }

    public void Subtrair(){
        sub = a - b;
        System.out.println("Subtração: " +sub);
    }

    public void Multiplicação(){
        mult = a * b;
        System.out.println("Multiplicação: "+mult);
    }

    public void Divisão(){
        div = a/b;
        System.out.println("Divisão: "+ div);
    }
}
