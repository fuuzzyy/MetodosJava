package ObejectJava;

import java.util.Scanner;

public class Object3 {

        public static String Vogal(char caractere) {

            caractere = Character.toLowerCase(caractere);

            return (caractere == 'a' || caractere == 'e' || caractere == 'i' || caractere == 'o' || caractere == 'u')
                    ? "É uma vogal"
                    : "Não é uma vogal";
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite um caractere: ");
            char caractere = scanner.next().charAt(0);

            String resultado = Vogal(caractere);
            System.out.println("Resultado: " + resultado);

            scanner.close();
        }
    }

