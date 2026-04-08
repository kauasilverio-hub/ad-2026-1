import java.util.Scanner;

public class SalarioComissao {
    public static void main(String[] args) {
        String nomeVendedor;
        float salarioFixo, valorvendas, slariototal;
        Scanner receberDados = new Scanner(System.in);

        System.out.println("Digite o nome do funcionário: ");
        nomeVendedor = receberDados.next();
        System.out.println("Digite o salário mensal: ");
        salarioFixo = Float.parseFloat(receberDados.next());
        System.out.println("Digite o valor das vendas: ");
        valorvendas = Float.parseFloat(receberDados.next());
    }
}
