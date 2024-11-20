import java.util.Locale;
import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor digite o numero da conta: ");
        int numeroConta = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por favor digite sua agência: ");
        String agencia = scanner.next();
        scanner.nextLine();

        System.out.println("Por favor digite seu nome: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Qual seu saldo: ");
        float saldo = scanner.nextFloat();

          scanner.close();

        System.out.println("Olá " + nomeCliente + " Obrigado por criar uma conta na nosso banco,\n sua agência é: " + agencia + " conta: " + numeroConta + "\ne seu saldo " + saldo + " já esta disponível para saque");

    }

}
