package classe;

public class Produto {
    private String nome;
    private double preco;
    private int qntd;

    public Produto(String nome, double preco, int qntd){
        this.nome = nome;
        this.preco = preco;
        this.qntd = qntd;
    }

    public void exibirProduto(){
        System.out.println("Nome do produto: "+nome);
        System.out.println("Preço do produto: "+preco);
        System.out.println("Quantidade do produto em estoque: "+ qntd);
    }
    public void calcularValorTotal(){
        double valorTotal = preco * qntd;
        System.out.println("O valor total do estoque é: R$"+ valorTotal);
    }
}
