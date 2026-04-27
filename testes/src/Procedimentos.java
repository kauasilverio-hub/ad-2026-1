import java.util.Scanner;

public class Procedimentos {
    private static void circunferencia(){
        double raio, area;
        String unidade = " ";
        Scanner cir = new Scanner(System.in);

        System.out.printf("Dê o raio do círculo a ser calculado: ");
        raio = cir.nextDouble();

        area = 3.14f * (raio * raio);

        System.out.printf("Informe a unidade de medida do círculo (cm, m, km): ");
        unidade = cir.next();

        System.out.println("O seu círculo possui uma área de: " + area + unidade + "²\n");
    }

    private static void Media(){
        double [] num = new double[6];
        int cont;
        double media, soma;
        Scanner number = new Scanner(System.in);

        soma = 0;

        System.out.println("Digite 6 números aleatórios para descobrir sua média: ");

        for(cont = 0; cont < 6; cont++) {
            num[cont] = number.nextDouble();
            soma = soma + num[cont];
        }

        media = soma/6;

        System.out.println("Sua média é: " + media + "\n");
    }

     private static void MenorValor() {
        double [] list = new double[10];
        int cont;
        double menorValor;
        Scanner men = new Scanner(System.in);

         System.out.println("Informe os números: ");

         for(cont=0; cont < 10; cont++) {
             list [cont] = men.nextDouble();
         }

         menorValor = list[0];

         for(cont = 0; cont < 10; cont++){
             if (menorValor > list[cont]){
                 menorValor = list[cont];
             }
         }

         System.out.println("O menor valor dentre os 10 números passados é: " + menorValor + "\n");
    }

    static void main(String args[]) {
        int opcao;
        String resposta = " ";
        String respostaRevisada = " ";
        Scanner lerDados = new Scanner(System.in);

        do {
            System.out.println("Qual procedimento deseja realizar? \n \n1 - Calcular área de círculo \n2 - Média de 6 números\n3 - Menor número de 10 valores");
            opcao = lerDados.nextInt();

            switch (opcao) {
                case 1:
                    circunferencia();
                    break;
                case 2:
                    Media();
                    break;
                case 3:
                    MenorValor();
                    break;
                default:
                    System.out.println("Opção inválida");
            }

            System.out.println("Deseja realizar um novo procedimento? (S/N)");
            resposta = lerDados.next();
            respostaRevisada = resposta.trim().toUpperCase();

        }while (!respostaRevisada.equals("N"));
    }
}