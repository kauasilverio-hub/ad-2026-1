//Elaborar um algoritmo que efetue a apresentação do valor da conversão em real (R$) de
// um valor lido em dólar (US$). O algoritmo deverá solicitar o valor da cotação do
// dólar e também a quantidade de dólares disponíveis com o usuári

import java.util.Scanner;

public class CotacaoDolar {
    static void main(String[] args) {
        float cotacao, dolar, conversao;
        Scanner lerdados = new Scanner(System.in);

        System.out.println("Qual é o valor da cotação?");
        cotacao = lerdados.nextFloat();
        System.out.println("Quantos doláres você possui?");
        dolar = lerdados.nextFloat();

        conversao = cotacao * dolar;

        System.out.println("Você possui "+ conversao + " reais");
    }
}