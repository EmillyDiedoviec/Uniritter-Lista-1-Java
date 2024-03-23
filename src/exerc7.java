import java.util.Scanner;

public class exerc7 {
    public static void main(String[] args) {
        //7. (Lista1_07) Construa um programa em Java que leia (via teclado) um comprimento em
        //polegadas, calcule e mostre o comprimento correspondente em milímetros, considerando
        //que 1 polegada equivale a 25,4 milímetros. (DICA: Usar dados do tipo float para ter precisão
        //nos resultados (%.1f)).

        Scanner scan = new Scanner(System.in);

        float polegadas;
        System.out.println("Insira um comprimento em polegadas: ");
        polegadas = scan.nextInt();

        float milimetros = polegadas * 25.4F;

        System.out.printf("%.1f polegadas são %.1f milímetro", polegadas, milimetros);
    }
}
