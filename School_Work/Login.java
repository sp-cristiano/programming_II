
/**
 * Cria um programa que simular uma pagina de login e validar o usuario.
 * Usuario correcto: admin
 * Senha correcto: 12345
 * Se ambos esta correcto: "Bem - Vindo"
 * se Usuario correcto e senha errada: Senha incorrcta
 * Caso contrario: Accesso negado
 */

/**
 * Login Program
 * @param args : Command line arguments.
 * @param usuarioCorrecto : The correct username.
 * @param senhaCorrecto : The correct password.
 * @param userName : The input username.
 * @param password : The input password.
 */
import java.util.Scanner;

public class Login {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String usuarioCorrecto = "admin";
    String senhaCorrecto = "12345";
    String userName = "";
    String password = "";

    do {
      System.out.println("Nome do Usuario: ");
      userName = input.nextLine().trim();
      if (userName.isEmpty()) {
        System.out.println("Nome do usuario nao pode fica vazil");
      }
    } while (userName.isEmpty());

    do {
      System.out.println("Palavra Pass: ");
      password = input.nextLine().trim();
      if (password.isEmpty()) {
        System.out.println("A palavra pass nao pode fica vazil");
      }
    } while (password.isEmpty());

    if ((userName.equals(usuarioCorrecto) == true ) && (password.equals(senhaCorrecto) == true)) {
      System.out.println("Bem - Vindo");
    } else if ((userName.equals(usuarioCorrecto) == false) && (password.equals(senhaCorrecto) == true)) {
        System.out.println("Nome do usuario invalida. Por favor verificar.");
      } else if ((userName.equals(usuarioCorrecto) == true) && (password.equals(senhaCorrecto) == false)) {
        System.out.println("Palavra pass nao esta valida. por favor verificar.");
      } else {
        System.out.println("Accesso Negado!");
      }
      input.close();
  }
}
