import java.util.Scanner;

public class SalarioComissao {
    public static void main(String[] args) {
        String nomeVendedor;
        float salarioFixo, valorVendas, salarioTotal;
        Scanner receberDados = new Scanner(System.in);

        System.out.println("Digite o nome do funcionário: ");
        nomeVendedor = receberDados.next();
        System.out.println("Digite o salário mensal: ");
        salarioFixo = receberDados.nextFloat();
        System.out.println("Digite o valor das vendas: ");
        valorVendas = receberDados.nextFloat();
        salarioTotal = (float) (salarioFixo + (valorVendas * 0.15));

        System.out.println("Nome do Vendedor é: " + nomeVendedor);
        System.out.println("Salario sem comissão é: " + salarioFixo);
        System.out.println("Salário com comissão é: "+ salarioTotal);
    }
}
