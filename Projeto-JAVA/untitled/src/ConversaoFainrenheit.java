//Ler uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit.
// A fórmula de conversão é: F=(9*C+160) / 5, sendo F a temperatura em Fahrenheit e
// C a temperatura em Celsius.

import java.util.Scanner;

public class ConversaoFainrenheit {
    static void main(String[] args) {
        float temperatura, conversao;
        Scanner lerdados = new Scanner(System.in);

        System.out.println("Informe a Temperatura em Celcius: ");
        System.out.println((temperatura = lerdados.nextFloat()) + "C°");

        conversao = ((temperatura * 9f) +160f)/5f;

        System.out.println(temperatura + " graus Celcius em Fainhenheit são: " + conversao + "F°");
    }
}
