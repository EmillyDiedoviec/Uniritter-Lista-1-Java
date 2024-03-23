import java.util.Scanner;

public class exerc3_1 {
    public static void main(String[] args) {
        //3.1. (Lista1_03_1) A mesma especificação do exercício anterior (Lista1_03) só que
        //agora usando números do tipo float (com duas casas decimas depois da vírgula (%.2f)).

        Scanner scan = new Scanner(System.in);
        float num1;
        float num2;
        float num3;
        float num4;
        float soma;

        System.out.println("Insira o primeiro valor: ");
        num1 = scan.nextFloat();
        System.out.println("Insira o segundo valor: ");
        num2 = scan.nextFloat();
        System.out.println("Insira o terceiro valor: ");
        num3 = scan.nextFloat();
        System.out.println("Insira o quarto valor: ");
        num4 = scan.nextFloat();

        soma = (num1 + num2 + num3 + num4) /4;

        System.out.printf("A média aritmética desses valores é: %.2f", soma);
    }
}
