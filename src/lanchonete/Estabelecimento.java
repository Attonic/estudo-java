package lanchonete;

import lanchonete.area.cliente.Cliente;
import lanchonete.atendimento.Atendente;
import lanchonete.atendimento.cozinha.Almoxarife;
import lanchonete.atendimento.cozinha.Cozinheiro;

public class Estabelecimento {
    public static void main(String[] args){
        Cozinheiro cozinheiro = new Cozinheiro();
        //açoes que não precisam estar disponíveis para toda a aplicação
//        cozinheiro.levarIngredientes();
//        cozinheiro.baterVitaminaLiquidificador();
//        cozinheiro.selecionarIngredientesVitamina();
//        cozinheiro.prepararLanche();
//        cozinheiro.prepararVitamina();
//        cozinheiro.prepararVitamina();

        //ações que o estabelecimento precisa ter ciência
        cozinheiro.adicionarSucoNoBalcao();
        cozinheiro.adicionarLancheNoBalcao();
        cozinheiro.adicionarComboNobalcao();

//        Almoxarife almoxarife = new Almoxarife();
        //Ações que não precisam estarem disponíveis para toda a aplicação
//        almoxarife.controlarEntrada();
//        almoxarife.controlarSaida();
        //ação que somente o pacote cozinha precisa conhecer (default)


        Atendente atendente = new Atendente();
//        atendente.pegarLancheCozina();
        atendente.receberPagamento();
//        atendente.pegarPedidoBalcao();
        atendente.servindoMesa();
        //Ação que somente o pacote cozinha precisa conhecer (default)


        Cliente cliente = new Cliente();
        cliente.escolherLanche();
        cliente.fazerPedido();
        cliente.pagarConta();
        //Não deveria, mas o estabelecimento
        //ainda não definiu normal de atendimento
//        cliente.pegarPedidoNoBalcao();

        //esta ação é muito sigilosa, que tal ser privada?
//        cliente.consultarSaldoAplicativo();

        //já pensou os cliente ouvindo que o gás acabou?
//        cozinheiro.pedirParaTrocarGas(almoxarife);


    }

}
