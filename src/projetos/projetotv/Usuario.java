package projetos.projetotv;

public class Usuario {
    public static void main(String[] args) throws Exception{

        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        //Volume 23

        smartTv.mudarCanal(22);
            System.out.println("Canal Atual" + smartTv.canal);

        System.out.println("TV ligada? " + smartTv.ligada);

        smartTv.aumentarCanal();
            System.out.println("Canal Atual: " + smartTv.canal);

        System.out.println("Volume Atual: " + smartTv.volume);


        smartTv.ligar();
        System.out.println("Tv ligada! " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Tv Desligada! " + smartTv.ligada);

    }
}
