import java.util.Scanner;

public class exerc4 {
    public static void main(String[] args) {
        //4. (Lista1_04) Construa um programa em Java que leia um número do tipo “inteiro” (via
        //teclado) e o guarde em uma variável X. Calcule e mostre: (1) o conteúdo de X, (2) o quadrado
        //de X, (3) o resto da divisão inteira de X por 3, (4) a metade de X, e (5) o resultado do produto
        //de X pela metade de X.

        Scanner scan = new Scanner(System.in);
        int x;

        System.out.println("Insira o valor de X: ");
        x = scan.nextInt();

        int quadrado = x * x;
        int resto = x % 3;
        int metade = x / 2;
        int produto = (x * x) /x;

        System.out.println("O valor de X é: " + x);
        System.out.println("O quadrado de X é: " + quadrado);
        System.out.println("O resto da divisão inteira de X é: " + resto);
        System.out.println("A metade de X é: " + metade);
        System.out.println("O resultado do produto de X pela metade de X de X é: " + produto);
    }
}
