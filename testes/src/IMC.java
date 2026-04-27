import java.util.Scanner;

public class IMC {
    public static void main(String args[]){
        double peso, altura, imc;
        String nome, nomeNormalizado = " ";
        Scanner lerDados = new Scanner (System.in);

        System.out.println("Qual é seu nome? (Escreva abaixo)");
        nome = lerDados.next();
        nomeNormalizado = nome.trim().toUpperCase();
        System.out.printf("Digite seu peso: ");
        System.out.println((peso = lerDados.nextDouble())+"Kg");
        System.out.printf("Digite sua altura: ");
        System.out.println((altura = lerDados.nextDouble())+"m");
        imc = peso/(altura*altura);
        System.out.println(nomeNormalizado +" possui o índice de massa corporal de: " + imc);
    }
}

