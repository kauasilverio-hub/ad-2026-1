import java.util.Scanner;

public class NotaAprovada {
    static void main(String[] args) {
        String nome;
        float nota1, nota2, nota3, media;    //Float=Real
        Scanner entradaDados = new Scanner(System.in);

        System.out.println("Digite o nome do ALuno: ");
        nome = entradaDados.next();
        System.out.println("Digite a primeira Nota: ");
        nota1 = Float.parseFloat(entradaDados.next());
        System.out.println("Digite a segunda Nota: ");
        nota2 = entradaDados.nextFloat();
        System.out.println("Digite a terceira Nota: ");
        nota3 = entradaDados.nextFloat();
        media = (nota1 + nota2 + nota3) / 3;

        System.out.println("A média do aluno " + nome + " é: " + String.format("%.2f",media));

        if (media >= 7){
            System.out.println("o aluno está Aprovado.");
        }
        else if (media >= 5.1f && media <= 6.9f) {
            System.out.println("o aluno está em Recuperação.");
        }
        else if (media <= 5f){
            System.out.println("O aluno está Reprovado.");
        }
    }
}