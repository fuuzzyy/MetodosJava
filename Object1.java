package ObejectJava;
import java.util.Scanner;
import java.util.Random;

public class Object1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroSecreto = random.nextInt(100) + 1;
        int tentativas = 0;
        int palpite;

        System.out.println("Bem-vindo ao Jogo de Adivinhação!");
        System.out.println("Tente adivinhar o número secreto entre 1 e 100.");

        do {
            System.out.print("Digite seu palpite: ");
            palpite = scanner.nextInt();
            tentativas++;

            if (verificarPalpite(palpite, numeroSecreto)) {
                System.out.println("Parabéns! Você acertou o número secreto em " + tentativas + " tentativas!");
            } else if (palpite < numeroSecreto) {
                System.out.println("O número secreto é maior. Tente novamente!");
            } else {
                System.out.println("O número secreto é menor. Tente novamente!");
            }

        } while (palpite != numeroSecreto);

        scanner.close();
    }

    public static boolean verificarPalpite(int palpite, int numeroSecreto) {
        return palpite == numeroSecreto;
    }
}
