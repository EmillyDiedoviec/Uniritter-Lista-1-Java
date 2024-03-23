import java.util.Scanner;

public class exerc6 {
    public static void main(String[] args) {
        //6. (Lista1_06) Construa um programa em Java para ler (via teclado) uma temperatura em
        //graus Fahrenheit, calcular e mostrar o valor correspondente em graus Celsius sabendo que
        //TempCelsius = 5 x (TempFahrenheit – 32) / 9. (DICA: Usar dados do tipo float para ter precisão
        //nos resultados (%.1f)).

        Scanner scan = new Scanner(System.in);
        float grausF;
        System.out.println("Quantos graus em Fahrenheit? ");
        grausF = scan.nextInt();

        float grausC = 5 * (grausF - 32) / 9;

        System.out.printf("%.1f graus Fahrenheit são %.1f graus Celcius", grausF, grausC);

    }
}
