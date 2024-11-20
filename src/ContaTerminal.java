/**
 * Atividade referente a Desavio proposto pela DIO.
 * @author Antonio Cleison
 * @version 1.0
 *
 * */
import java.util.Locale;
import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) {

        //Cria um Scanner para ler as entradas do usuário
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
        //Fecha o Scanner utilizado
          scanner.close();

        System.out.println("Olá " + nomeCliente + " Obrigado por criar uma conta na nosso banco,\n sua agência é: " + agencia + " conta: " + numeroConta + "\ne seu saldo " + saldo + " já esta disponível para saque");

    }

}
