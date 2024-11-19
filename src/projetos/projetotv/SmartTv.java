package projetos.projetotv;

public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void aumentarCanal(){
        canal++;
    }

    public void diminuirCanal(){
        canal--;
    }

    /**
     * @param novoCanal Primeiro parâmetro do metodo
     * Este metodo muda o canal para um canal especifico
     */

    public void mudarCanal(int novoCanal){
        canal = novoCanal;


    }

    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando o volume para: " + volume);
    }

    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuindo o volume para: " + volume);
    }

    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }


}
