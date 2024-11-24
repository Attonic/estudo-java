package lanchonete.atendimento.cozinha;

import lanchonete.atendimento.Atendente;

public class Cozinheiro {

    public void adicionarLancheNoBalcao(){
        //pode ser default
        System.out.println("Adicionando lanche Natural Hamburger no Balcão");
    }
    //pode ser default
    public void adicionarSucoNoBalcao(){
        System.out.println("Adicionar suco no balcão");
    }
    //pode ser Defalt
    public void adicionarComboNobalcao(){
        adicionarLancheNoBalcao();
        adicionarSucoNoBalcao();
    }
    private void prepararLanche(){
        System.out.println("Preparando lanche tipo Hamburger");
    }
    private void prepararVitamina(){
        System.out.println("Preparando Suco");
    }
    public void prepararCombo(){
        prepararLanche();
        prepararVitamina();
    }

    private void selecionarIngredientesLanche(){
        System.out.println("Selecionando Pão, salada, ovo e carne");
    }
    private void selecionarIngredientesVitamina(){
        System.out.println("Selecionando fruta, leite e suco");
    }
    private void levarIngredientes(){
        System.out.println("Levando Ingredientes");
    }

    private void baterVitaminaLiquidificador(){

        System.out.println("Batendo Vitamina no Liquidificado");
    }
    public void fritarIngredientesLanche(){
        System.out.println("Fritando a carne e o ovo para o hamburger");
    }

    private void pedirParaTrocarGas(Almoxarife meuAmigo){
        meuAmigo.trocarGas();
    }
    private void pedirIngredientes(Almoxarife almoxarife){
        almoxarife.entregarIngredientes();
    }

}
