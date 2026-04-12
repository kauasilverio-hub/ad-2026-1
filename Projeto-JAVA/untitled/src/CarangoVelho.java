//A concessionária de veículos “CARANGO VELHO” está vendendo os seus veículos com desconto.
// Faça um algoritmo que calcule e exiba o valor do desconto e o valor a ser pago pelo cliente
// de vários carros. O desconto deverá ser calculado de acordo com o ano do veículo.
// Até 2010 - 12% e acima de 2010 - 7%. O sistema deverá perguntar se deseja continuar calculando
// desconto até que a resposta digite: “(N) Não” . Informar total de carros com ano até 2010 e total geral.

import java.util.Scanner;

public class CarangoVelho {
    static void main(String[] args) {
        float descontoPercentual, descontoCarro, valorCarro, valorFinal;
        int anoCarro, totalCarros, totalCarros2010;
        String resposta = " ";
        Scanner lerDados = new Scanner(System.in);

        totalCarros = 0;
        totalCarros2010 = 0;

        do {
            System.out.println("Digite o valor do carro: ");
            valorCarro = lerDados.nextFloat();
            System.out.println("Digite o ano de fabricação do carro: " );
            anoCarro = lerDados.nextInt();

            if (anoCarro <=2010){
                descontoPercentual = 0.12f;
                System.out.println("Desconto de 12%");
                totalCarros2010 = totalCarros + 1;
            }
            else {
                descontoPercentual = 0.07f;
                System.out.println("Desconto de 7%");
            }

            descontoCarro = descontoPercentual * valorCarro;
            valorFinal = valorCarro - descontoCarro;

            System.out.println("O valor final do carro é R$"+ String.format("%.2f", valorFinal) +"\n Deseja continuar calculando?S/N");
            resposta = lerDados.next();

            totalCarros = totalCarros + 1;

        } while (!resposta.equals("N"));

        System.out.println("Total de carros com ano até 2010: " + totalCarros2010);
        System.out.println("Total de carros: " + totalCarros);
    }
}


