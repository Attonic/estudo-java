package edu.cleison.estruturas;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;


public class ResultadoEscolar {
    public static void main(String[] args){
        DecimalFormat df = new DecimalFormat("#.00");
        Scanner src = new Scanner(System.in).useLocale(Locale.US);
        double media = 0;
        System.out.println("Qual a primeira nota do aluno");
        double nota1 = src.nextDouble();

        System.out.println("Qual a segunda nota? ");
        double nota2 = src.nextDouble();

        System.out.println("Qual a 3 nota no aluno? ");
        double nota3 = src.nextDouble();

        media = ((nota1 + nota2 + nota3)/3);

        System.out.println("A media do aluno é " + df.format(media));

        if (media >= 7){
            System.out.println("Aluno Aprovado");
        } else if (media >= 5 && media < 7) {
            System.out.println("Aluno em recuperação");
        }else {
            System.out.println("Aluno reprovado");
        }
    }
}
