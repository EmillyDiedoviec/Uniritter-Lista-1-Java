import java.util.Scanner;

public class exerc9 {
    public static void main(String[] args) {
        //9. (Lista1_09) Construa um programa em Java para ler (via teclado) 3 valores os quais
        //correspondem ao número de convidados para um churrasco, sendo homens, mulheres e
        //crianças. Sabendo que, em média, um homem come 650 gramas de carne, uma mulher come
        //420 gramas de carne, e uma criança come 290 gramas de carne, calcule a quantidade de carne
        //necessária para o churrasco em quilogramas e mostre o resultado.

        Scanner scan = new Scanner(System.in);

        int homens;
        System.out.println("Quantos homens? ");
        homens = scan.nextInt();

        int mulheres;
        System.out.println("Quantas mulheres? ");
        mulheres = scan.nextInt();

        int criancas;
        System.out.println("Quantas crianças? ");
        criancas = scan.nextInt();

        int homensTotal = homens * 650;
        int mulheresTotal = mulheres * 420;
        int criancasTotal = criancas * 290;

        float  totalCarne = (homensTotal + mulheresTotal + criancasTotal) / 1000F;
        System.out.println("O necessário de kgs é: " + totalCarne);

    }
}
