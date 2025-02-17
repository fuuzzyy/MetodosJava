package ObejectJava;

import java.util.Scanner;

public class Object5 {

        public static String verificarIntervalo(int numero) {
            return (numero >= 10 && numero <= 50) ? "Dentro do intervalo" : "Fora do intervalo";
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite um número: ");
            int numero = scanner.nextInt();

            String resultado = verificarIntervalo(numero);
            System.out.println("O número " + numero + " está: " + resultado);

            scanner.close();
        }
    }

