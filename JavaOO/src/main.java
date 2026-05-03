import classe.Pessoa;
import classe.Calculadora;
import classe.ContaBancaria;
import classe.Produto;
import classe.Media;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner lerDados = new Scanner(System.in);

        Pessoa pessoa = new Pessoa("Ana", 25);

        pessoa.apresentar();
        pessoa.fazerAniversario();
        pessoa.apresentar();

        System.out.printf("\n");

        Calculadora calculadora = new Calculadora( 20, 3);

        calculadora.Somar();
        calculadora.Subtrair();
        calculadora.Multiplicação();
        calculadora.Divisão();

        System.out.printf("\n");

        ContaBancaria contaBancaria = new ContaBancaria("Kauã", 0);

        contaBancaria.Depositar(600.72);
        contaBancaria.mostrarSaldo();
        contaBancaria.Sacar(550.50);
        contaBancaria.mostrarSaldo();

        System.out.printf("\n");

        Produto produto = new Produto("Cheetos 500g", 9.95, 72);

        produto.exibirProduto();
        produto.calcularValorTotal();

        System.out.printf("\n");

        Media media = new Media();

        System.out.println("Escreva seu nome: ");
        media.setNome(lerDados.next());
        System.out.printf("Escreva sua primeira nota: ");
        media.setNota1(lerDados.nextDouble());
        System.out.printf("Escreva sua segunda nota: ");
        media.setNota2(lerDados.nextDouble());

        System.out.printf("\n");

        media.calculaMedia();
        media.verificarSituacao();

    }
}

