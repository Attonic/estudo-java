package edu.cleison.estruturas;
import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Locale;

public class SistemaDeMedida {
    public static void main(String[] args){
        Scanner src = new Scanner(System.in);
        System.out.println("Digite uma letra: ");
        String sigla = src.nextLine();

    switch (sigla){
        case "P":{
            System.out.println("Pequeno");
        }
        case "M":{
            System.out.println("Médio");
        }
        case "G":{
            System.out.println("Grande");
            break;
        }
        default:{
            System.out.println("Indefinido");
        }
    }

    }
}

