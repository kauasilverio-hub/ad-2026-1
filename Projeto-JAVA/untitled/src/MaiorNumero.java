import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {
        int num1, num2, numMaior;
        Scanner lerInteiro = new Scanner(System.in);
        System.out.println("Digite o primeiro número inteiro: ");
        num1 = lerInteiro.nextInt();
        System.out.println("Digite o segundo número inteiro: ");
        num2 = lerInteiro.nextInt();

        if (num1 > num2){
            System.out.println("O primeiro número digitado é o maior.");
        }
        else if (num2 > num1){
            System.out.println("O segundo número digitado é o maior.");
        }
        else {
            System.out.println("Os números são iguais.");

        }
    }
}
