import java.util.Scanner;
public class MinhaClasse {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual o seu nome");
            String nome = scanner.next();

        System.out.println("Qual a sua idade ");
            int idade = scanner.nextInt();

        System.out.println("Qual Sua altura?");
            double altura = scanner.nextDouble();
        scanner.close();

    System.out.println("Sua idade é " + idade + " E seu nome é " + nome + " sua altura é: " + altura);

        if (idade >= 18){
            System.out.println("Você pode entrar na festa");
        }else{
            System.out.println("Você não entrar na festa");
        }



    }

    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);


    }




}

