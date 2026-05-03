package classe;

public class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = 0.0;
    }

    public void Depositar(double valor){
        if (0 < valor){
            saldo = saldo + valor;
        }else {
            System.out.println("Depósito inválido!");
        }
    }

    public void Sacar(double valor) {
        if (0 < valor && valor <= saldo) {
            saldo = saldo - valor;
        } else {
            System.out.println("Saque inválido. Saldo insuficiente ou valor incorreto.");

        }
    }

    public void mostrarSaldo() {
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: R$ " + saldo);
    }
}
