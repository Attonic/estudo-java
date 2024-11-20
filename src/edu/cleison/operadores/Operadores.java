package edu.cleison.operadores;

public class Operadores {
    public static void main(String[] args) {
        int numero = 5;

        numero = - numero;
        System.out.println(- numero);
        System.out.println(numero);
        numero = numero * -1;
        System.out.println(numero);

        int a, b;
        a = 5;
        b = 6;
        String resultado = "";

            if (a == b) {
                resultado = "verdadeiro";
            }else {
                resultado = "falto";
            }

        String nomeUm = "Cleison";
        String nomeDois = "Cleison";


        if (nomeUm == nomeDois) {
            System.out.println("Nomes iguais");
        }else {
            System.out.println("Nomes São diferentes");
        }


    }

}


