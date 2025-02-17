package ObejectJava;

import java.util.Scanner;

public class Object2 {
        public static boolean autenticar(String usuarioCorreto, String senhaCorreta, String usuarioDigitado, String senhaDigitada) {
            return usuarioDigitado.equals(usuarioCorreto) && senhaDigitada.equals(senhaCorreta);
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String usuario = "Aninhalinda123";
            String senha = "LindaAninha123";

            System.out.print("Digite o usuário: ");
            String usuarioDigitado = scanner.nextLine();

            System.out.print("Digite a senha: ");
            String senhaDigitada = scanner.nextLine();

            boolean autenticado = autenticar(usuario, senha, usuarioDigitado, senhaDigitada);

            if (autenticado) {
                System.out.println("Autenticação bem-sucedida! Bem-vindo, " + usuarioDigitado + ".");
            } else {
                System.out.println("Usuário ou senha incorretos. Tente novamente.");
            }

            scanner.close();
        }
    }

