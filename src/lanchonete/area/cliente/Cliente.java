package lanchonete.area.cliente;

public class Cliente {
    public void escolherLanche(){
        System.out.println("Escolhendo o Lanche");
    }
    public void fazerPedido(){
        System.out.println("Pagando a conta");
    }
    private void consultarSaldoAplicativo(){
        System.out.println("Consultando saldo no aplicativo");
    }
    public void pagarConta(){
        consultarSaldoAplicativo();
        System.out.println("Pegando o pedido balcão");
    }
//    public void pegarPedidoNoBalcao(){
//        System.out.println("Pegando o pedido balcão");
//    }
}
