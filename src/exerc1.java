import java.util.Scanner;
public class exerc1 {
    public static void main(String[] args) {
        //1. (Lista1_01) Construa programa em Java que leia (via teclado) dois números do tipo inteiro,
        //calcule o produto entre eles e mostre o resultado.

        Scanner scan = new Scanner(System.in);
        int num1;
        int num2;
        int soma;

        System.out.println("Insira o primeiro valor: ");
        num1 = scan.nextInt();
        System.out.println("Insira o segundo valor: ");
        num2 = scan.nextInt();
        soma = num1 + num2;

        System.out.println("O valor da soma é: " + soma);
    }
}
