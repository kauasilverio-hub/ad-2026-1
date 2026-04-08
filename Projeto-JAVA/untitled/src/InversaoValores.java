import java.util.Scanner;

public class InversaoValores {
    public static void main(String[] args) {
        String a, b, temp;
        Scanner lerDados = new Scanner(System.in);
        System.out.println("Digite o primeiro dado:");
        a = lerDados.next();
        System.out.println("Digite o segundo dado:");
        b = lerDados.next();
        temp = a;
        a = b;
        b = temp;

        System.out.println("O dado invertido das variáveis é: \n"+ a +"\n"+ b);
    }
}
