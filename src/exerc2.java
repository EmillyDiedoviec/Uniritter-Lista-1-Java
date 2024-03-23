import java.util.Scanner;

public class exerc2 {
    public static void main(String[] args) {
        //2. (Lista1_02) Construa um programa em Java que leia (via teclado) três números do tipo
        //inteiro, calcule e mostre o resultado da soma deles.
        Scanner scan = new Scanner(System.in);

        int num1;
        int num2;
        int num3;
        int soma;

        System.out.println("Insira o primeiro valor: ");
        num1 = scan.nextInt();
        System.out.println("Insira o segundo valor: ");
        num2 = scan.nextInt();
        System.out.println("Insira o terceiro valor: ");
        num3 = scan.nextInt();

        soma = num1 + num2 + num3;

        System.out.println("O valor da soma é: " + soma);
    }
}
