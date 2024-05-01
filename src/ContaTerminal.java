import java.util.Locale;
import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) {
                
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        double saldo = 237.48;
        System.out.println("Por favor, digite o seu nome de Usuário!");
        String nomeUsuario = scanner.next();
        System.out.println("Por favor, digite o número da conta !");
        int numero = scanner.nextInt();
        System.out.println("Por favor, digite o número da Agência !");
        String agencia = scanner.next();
        System.out.println();
        String mensagem = "Olá ".concat(nomeUsuario).concat(", obrigado por criar uma conta em nosso banco, sua agência é ")
        .concat(agencia).concat(", conta ").concat(Integer.toString(numero)).concat(" e seu saldo é ") + saldo;
        System.out.println(mensagem);
         
    }
  
}
