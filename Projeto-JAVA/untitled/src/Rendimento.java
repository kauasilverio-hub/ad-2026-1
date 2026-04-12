//Faça um algoritmo que receba um valor que foi depositado e
// exiba o valor com rendimento após um mês. ● Considere fixo o juro da poupança em 0,70% a.

import java.util.Scanner;

public class Rendimento {
    static void main(String[] args) {
        float deposito, rendimento, resultado;
        Scanner lerdados = new Scanner(System.in);

        System.out.println("Informe o valor do seu depósito:");
        deposito = lerdados.nextFloat();
        System.out.println("Deposito de R$" + deposito + " foi aplicado.");
        rendimento = deposito * 0.7f;
        resultado = rendimento + deposito;

        System.out.println("Ao final do mês o valor total na sua poupança será de: R$" + resultado);
    }
}

