package ObejectJava;

import java.util.Scanner;

public class Object4 {

        public static String verificarPositivoNegativo(int numero) {
            return (numero > 0) ? "Positivo" : (numero < 0) ? "Negativo" : "Zero";
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite um número: ");
            int numero = scanner.nextInt();

            String resultado = verificarPositivoNegativo(numero);
            System.out.println("O número " + numero + " é: " + resultado);

            scanner.close();
        }
    }

