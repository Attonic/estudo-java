package edu.cleison.repeticao;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Locale;
public class AboutMe {
    public static void main(String[] args) {
    try {
        Scanner src = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome: ");
        String nome = src.nextLine();

        System.out.println("Digite seu sobrenome: ");
        String sobreNome = src.nextLine();

        System.out.println("Digite sua idade");
        int idade = src.nextInt();

        System.out.println("Digite sua Altura");
        double altura = src.nextDouble();

        System.out.println("Olá me chamo" + nome.toLowerCase() + sobreNome.toUpperCase() + "\n Tenho idade de: " + idade + "\nAltura de: " + altura);
    }
    catch (InputMismatchException e){
        System.out.println("Os campos idade ou altura precisam ser numericos");
    }
    }
}
