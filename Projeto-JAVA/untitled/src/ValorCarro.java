//O custo ao consumidor de um carro novo é a soma do custo de fábrica com a percentagem do
// distribuidor e dos impostos (aplicados, primeiro os impostos sobre o custo de fábrica,
// e depois a percentagem do distribuidor sobre o resultado). Supondo que a percentagem do
// distribuidor seja de 28% e os impostos 45%. Escrever um algoritmo que leia o custo de fábrica
// de um carro e informe o custo ao consumidor do mesmo.


import java.util.Scanner;

public class ValorCarro {
    static void main(String[] args) {
        float custoFabrica, custoDistribuidor, soma, imposto, resultado;
        String nomeCarro, sobrenomeCarro;
        Scanner lerDados = new Scanner(System.in);

        System.out.println("Digite o nome do carro:");
        nomeCarro = lerDados.next();
        sobrenomeCarro = lerDados.next();
        System.out.println("Digite o custo de fábrica: ");
        custoFabrica = lerDados.nextFloat();
        System.out.println("O carro " + nomeCarro + " " + sobrenomeCarro + " tem como valor de fábrica: R$" + String.format("%,2f",custoFabrica));
        imposto = custoFabrica * 0.45f;
        soma = custoFabrica + imposto;
        custoDistribuidor = soma * 0.28f;
        resultado = soma + custoDistribuidor;
        System.out.println("Adicionando o Imposto de 45% sobre o valor de fábrica, e 28% de comissão do Distribuidor sobre o resultado, o valor do " + nomeCarro + " " + sobrenomeCarro + " a ser pago é: R$" + String.format("%,2f", resultado));
    }
}
