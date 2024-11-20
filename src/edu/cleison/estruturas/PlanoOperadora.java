package edu.cleison.estruturas;
import java.util.Scanner;
public class PlanoOperadora {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        System.out.println("Temos os Seguintes planos: \nA - 5G Youtube \nB - Whats e Instagram Gratis\n C - 100 minutos de ligação\n Qual sua escolha? ");
        String plano = src.nextLine();

        switch (plano){
            //Sem o break, caso A seja selecionado ele junta aos demais e assim sucessivamente.
            case "A":{
                System.out.println("Parabéns Plano escolhido foi: A - 5G Youtube + ");

            }
            case "B":{
                System.out.println("Parabéns Plano escolhido foi: B - Whats e Instagram Gratis +");
            }
            case "C":{
                System.out.println("Parabéns Plano escolhido foi: C - 100 minutos de ligação");
            }
            default:
                System.out.println("Digite a letra correspondente ao plano");
        }
    }
}
