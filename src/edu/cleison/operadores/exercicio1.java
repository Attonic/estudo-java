package edu.cleison.operadores;
import java.util.Scanner;
public class exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o numero inicial de animais em casais");
            int numAnimais = scanner.nextInt();

            if (numAnimais < 2){
                System.out.println("O numero de casais de animais deve ser 2");
            }

        System.out.println("Digite o numero de anos");
            int numAnos = scanner.nextInt();

        System.out.println("Ano 0: " + numAnimais + " Animais");
       for (int ano = 1; ano <= numAnos; ano++) {
           numAnimais *= 3; System.out.println("Ano " + ano + ": " + numAnimais + " " +
                   "chinchilas"); }
    }
}
