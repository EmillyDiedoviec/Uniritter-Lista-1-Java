import java.util.Scanner;

public class exerc3 {
    public static void main(String[] args) {
        // 3. (Lista1_03) Construa um programa em Java para ler (via teclado) quatro números do tipo
        //inteiro, calcule e mostre o resultado da média aritmética entre eles. Usar “float” para o tipo
        //de dado da variável que irá armazenar o resultado da média aritmética e imprimir o resultado
        //com duas casas decimais depois da vírgula (%.2f).

        Scanner scan = new Scanner(System.in);
        int num1;
        int num2;
        int num3;
        int num4;
        float soma;

        System.out.println("Insira o primeiro valor: ");
        num1 = scan.nextInt();
        System.out.println("Insira o segundo valor: ");
        num2 = scan.nextInt();
        System.out.println("Insira o terceiro valor: ");
        num3 = scan.nextInt();
        System.out.println("Insira o quarto valor: ");
        num4 = scan.nextInt();

        soma = (num1 + num2 + num3 + num4) /4;

        System.out.printf("A média aritmética desses valores é: %.2f", soma);

    }
}
