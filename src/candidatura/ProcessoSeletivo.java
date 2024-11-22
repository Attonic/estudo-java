
/**
 * @author Cleison
 * @versio 0.1
 * */
package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        System.out.println("Processo seletivo");
        String [] candidatos = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto"};
        for(String candidato: candidatos){
            entrandoEmContato(candidato);
        }
        selecaoCandidatos();
        imprimirSelecionados();
//        analizarCadidato(1900.0);
//        analizarCadidato(2200.0);
//        analizarCadidato(2000.0);

    }

    static void entrandoEmContato(String candidato){
      int tentativasFeitas = 1;
      boolean continuarTentando = true;
      boolean atendeu = false;

      do {
        atendeu = atender();
        continuarTentando = !atendeu;
        if(continuarTentando){
            tentativasFeitas++;
        }else {
            System.out.println("Contato feito");
        }

      }while (continuarTentando && tentativasFeitas < 2);

      if (atendeu){
          System.out.println("Conseguimos contatos com " + candidato + "em" + tentativasFeitas);
      }else {
          System.out.println("Não conseguimos contato com candidato " + candidato + "nas" + tentativasFeitas);
      }
    }


    public static boolean atender(){
        return new Random().nextInt(3)==1;
    }

    public static void imprimirSelecionados(){
        String [] candidatos = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto"};

        System.out.println("Imprimindo informando o índice: ");

        for (int i = 0; i < candidatos.length; i++){
            System.out.println("Candidato " + (i+1) + "ª" + candidatos[i]);
        }

        System.out.println("Forma Abreviada");

        for (String candidato: candidatos){
            System.out.println("O candidato é; " + candidato);
        }
    }
    public static void selecaoCandidatos(){
        //Array de candidatos
        String [] candidatos = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto", "Monica", "Fabricio", "Mirela", "Daniela", "Jorge"};
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.00;

        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + "Solicitou valor de salario: " + salarioPretendido);
            if (salarioBase >= salarioPretendido){
                System.out.println("O candidato " + candidato + "foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }

    }

    public static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2000);
    }

    public static void analizarCadidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA CANDIDATO COM CONTRA PROPOSTA");
        }else {
            System.out.println("AGUARDANDO RESULTADO DEMAIS CANDIDATOS");
        }
    }
}
