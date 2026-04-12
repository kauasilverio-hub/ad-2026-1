//Faça um algoritmo que receba a idade de 75 pessoas e mostre mensagem informando “maior de idade”
// e “menor de idade” e “idoso”para cada pessoa.Considere a idade a partir de 18 anos como maior
// de idade e idoso a partir de 60 anos.

import java.util.Scanner;

public class Idade {
    static void main(String[] args) {
        int [] idade = new int[75];
        int cont;
        Scanner lerDados = new Scanner(System.in);

        for (cont = 0; cont < 75; cont++) {
            System.out.println("Digite sua idade: ");
            idade[cont] = lerDados.nextInt();

            if (idade[cont] >= 60){
                System.out.println("Idoso");
            }
            else if (idade[cont] >= 18 && idade[cont] < 60) {
                System.out.println("Maior de Idade");
            }
            else {
                System.out.println("Menor de Idade");
            }
        }
    }
}