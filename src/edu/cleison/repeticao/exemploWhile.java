package edu.cleison.repeticao;
import java.util.concurrent.ThreadLocalRandom;
import java.text.DecimalFormat;

public class exemploWhile {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.00");
        double mesada = 50.0;

    while (mesada > 0){
        Double valorDoce = valorAleatorio();
        if (mesada < valorDoce){
            valorDoce = mesada;
        }
        System.out.println("Doce do valor: " + df.format(valorDoce) + " Adicionado no carrinho ");
        mesada = mesada - valorDoce;
    }
        System.out.println("Mesada: " + df.format(mesada));
        System.out.println("Ele gastou tudo em doce");




    }
    private static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }
}
