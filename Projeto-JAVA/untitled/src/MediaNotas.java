import java.util.Scanner;

public class MediaNotas {
    public static void main(String[] args) {
        String nome;
        float nota1, nota2, nota3, media;    //Float=Real

        System.out.println("Digite o nome do ALuno: ");
        Scanner entradaDados = new Scanner(System.in);
        nome = entradaDados.next();
        System.out.println("Digite a primeira Nota: ");
        nota1 = Float.parseFloat(entradaDados.next());
        System.out.println("Digite a segunda Nota: ");
        nota2 = entradaDados.nextFloat();
        System.out.println("Digite a terceira Nota: ");
        nota3 = entradaDados.nextFloat();
        media = (nota1 + nota2 + nota3) / 3;

        System.out.println("O nome do Aluno é: "+ nome);
        System.out.println("A média do Aluno é: "+ String.format("%.2f",media));
    }
}
