import java.util.Scanner;

public class exerc5 {
    public static void main(String[] args) {
        //5. (Lista1_05) Construa um programa em Java para ler (via teclado) o raio de um círculo,
        //calcular a área deste círculo e mostrar o resultado. (DICA: Cálculo da área = (PI * (raio * raio)).
        //Usar dados do tipo float para ter precisão nos resultados (%.2f). Usar pi = 3.141592).

        Scanner scan = new Scanner(System.in);

        float raio;
        System.out.println("Insira o valor do raio: ");
        raio = scan.nextInt();

        float pi = 3.141592F;
        float area = pi * (raio * raio);
        System.out.printf("A área do circulo é %.2f", area);
    }
}
