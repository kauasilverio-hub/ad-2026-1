package classe;

public class Media {
    private double nota1, nota2;
    private String nome;

    public Media(){
    }

    public void calculaMedia(){
        double media;
        media = (nota1+nota2)/2;
        System.out.println("A média do aluno " + nome + " é: "+media);
    }

    public void verificarSituacao(){
        if ((nota1+nota2)/2 >= 7){
            System.out.println("Situação: Aprovado");
        } else if ((nota1+nota2)/2 >=6f && (nota1+nota2)/2 <= 6.9f ) {
            System.out.println("Situação: Recuperção");
        }else if ((nota1+nota2)/2 <= 5.9){
            System.out.println("Situação: Reprovado");
        }else {
            System.out.println("Nota inválida!");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }
}
