import java.util.Scanner;

public class exerc8 {
    public static void main(String[] args) {
        //8. (Lista1_08) Construa um programa em Java que leia (via teclado) as horas, minutos e
        //segundos em determinado momento do dia, e que calcule e mostre qual o total de segundos
        //decorridos neste dia. (DICA: totalSegundos = (horas * 60 * 60) + (minutos * 60) + segundos).

        Scanner scan = new Scanner(System.in);

        int horas;
        System.out.println("Quantas horas? ");
        horas = scan.nextInt();

        int minutos;
        System.out.println("Quantos minutos? ");
        minutos = scan.nextInt();

        int segundos;
        System.out.println("Quantos segundos? ");
        segundos = scan.nextInt();

        int totalSegundos = (horas * 60 * 60) + (minutos * 60) + segundos;

        System.out.println("Total de segundos: " + totalSegundos);

    }
}
