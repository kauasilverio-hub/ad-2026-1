//Escrever um algoritmo para determinar o consumo médio de um automóvel sendo fornecida
// a distância total percorrida pelo automóvel e o total de combustível gasto

import java.util.Scanner;

public class ConsumoCombustivel {
    public static void main(String[] args){
        float combustivel, distancia, consumo;
        Scanner lerDados = new Scanner(System.in);

        System.out.println("Informe a quantidade de combustível:");
        System.out.println((combustivel = lerDados.nextFloat()) + "L");
        System.out.println("Informe a distância percorrida:");
        System.out.println((distancia = lerDados.nextFloat()) + "Km");
        consumo = combustivel/distancia;

        System.out.println("O Veículo gastou "+ combustivel +"L de combustivel.");
        System.out.println("O Veículo percorreu " + distancia +"Km de distancia.");
        System.out.println("O consumo médio do Veículo é: " +consumo+ "L/Km");
    }
}